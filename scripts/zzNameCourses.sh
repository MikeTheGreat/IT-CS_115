#!/bin/bash

if [ -z "$1" ]; then
    echo "Usage: $(basename "$0") <directory>"
    echo "Recursively renames all files and directories under <directory> by replacing"
    echo "spaces and %20 with dashes and converting names to lowercase."
    exit 1
fi

# Process deepest entries first so children are renamed before their parent dirs
find "$1" -depth \( -type f -o -type d \) -print0 | while IFS= read -r -d '' path; do
    dir="$(dirname "$path")"
    base="$(basename "$path")"
    newbase="${base// /-}"
    newbase="${newbase//%20/-}"
    newbase="${newbase,,}"
    
    if [ "$base" != "$newbase" ]; then
        github-to-canvas mv -v -- "$path" "$dir/$newbase"
        echo "Renamed: $path -> $dir/$newbase"
    fi
done

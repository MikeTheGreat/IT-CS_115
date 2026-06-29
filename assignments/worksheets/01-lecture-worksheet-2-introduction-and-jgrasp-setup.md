---
title: "01 Coding Exercise: Introduction and jGRASP Setup"
published: true
points_possible: 2.0
submission_types: [online_upload]
allowed_extensions: ["java"] 
grading_type: points
grader_comments_visible_to_graders: true
grader_names_visible_to_final_grader: true

rubric: "Worksheets"
use_for_grading: true 

original_title: "01 Lecture Worksheet 2: Introduction and jGRASP Setup"
---
## Download Hello.java

Download [Hello.java](../../assets/Lecture-Related/Unit-01-b/Hello.java "Hello.java") here!

## Do all your work in the `Hello.java` file
Coding exercises are done by making
changes to a `.java` file (and then uploading that file).  This is different 
than class notes or a worksheet which are done by writing your work out by hand on paper.

## Try It Out!

Now let's see what happens when your program has an error.\
**Delete the semicolon at the end of line 5** so it becomes:

            System.out.println("Hello, World!")

Click **Run**. You should see an error message like:

     ----jGRASP exec: javac -g Hello.java
    Hello.java:5: error: ';' expected
            System.out.println("Hello, World!")
                                               ^
    1 error

     ----jGRASP wedge2: exit code for process is 1.
     ----jGRASP: operation complete.

jGRASP tells you **which file** (Hello.java) and **which line** (5) contains the error. Clicking the error message will highlight that line.

The message here (`';' expected`{data-start="738" end="752"}) clearly tells you what's wrong, but compiler errors are not always this helpful. The compiler stops when it gets confused, so later errors may just be "phantom" errors caused by an earlier mistake. Learning to read and interpret these messages is an essential programming skill.

### Tips for fixing errors {#tips-for-fixing-errors data-start="1034" end="1060"}

-   **Start with the first error**, fix it, recompile, and repeat.

-   Later errors may not be real---Java may simply be confused by an earlier mistake.

-   **Read the message for clues**, even if it doesn't fully make sense.

-   Check the **line listed in the error**, then the **2--3 lines above it**---the real mistake is often earlier.

-   Compare your code with a working example to spot differences.

-   Don't worry if fixing one error causes more to appear---this often means the compiler can now read farther into the code.

After reviewing the error, **add the missing semicolon back**, run the program again, and confirm it works.

**Congratulations, and welcome to Java programming!**

Note: since you're adding an error and then removing the error it's impossible for the instructor to know if you've actually done this exercise.  Regardless, make sure that you do this!  It's crucial for your learning to get practice with finding and fixing errors, even if there aren't points directly attached to a specific activity!

### Tasks {#tasks data-start="50" end="59"}

1.  **Add a second print statement** after `Hello, World!`{data-start="103" end="118"} (e.g., `"How are you?"`{data-start="126" end="142"}). Compile and run the program.

2.  **Add a comment** anywhere in the code. Recompile and run---it should not change the output.

3.  **Experiment with errors:**

    -   Remove a semicolon and recompile.

    -   Place a print statement outside the main method or class.

    -   Create 3--4 different errors total, **fixing each one** after you test it.

### **Submission**

Submit your correctly executed **Hello.java** to Canvas.

*[Much thanks to Scott Rowley, the original author of this exercise]{.underline}*


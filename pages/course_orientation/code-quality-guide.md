---
title: Code Quality Guide
published: true
---
::: {#navbarOptions .collapse .navbar-collapse}
## [Code Quality Guide]{style="font-family: inherit; font-size: 1.8em;"}

This material is adapted from the [CSE 142 Code Quality Guide (Autumn 2020)](https://courses.cs.washington.edu/courses/cse142/20au/quality.html){.inline_disabled target="_blank"}. Many thanks to the CSE 14x Team at the University of Washington, Seattle, for their original work.
:::

::: wrapper
::: container-fluid
::: row
::: {.content .col}
## Overview {#overview .side-nav-header data-href="quality.html#overview" level="0"}

Writing Java code isn\'t just about writing code that compiles and works. If we wanted code that just got a computer to follow our directions, why not just write it in binary? Truth is, code isn\'t written for computers; it\'s written for people. Programming in the real world is a highly collaborative activity, so it\'s very important to be able to write code that is easy to work with and understand. Having clean, readable code also makes finding bugs and errors in your code significantly easier. This code quality guide contains a set of guidelines we expect you to follow when writing code. This document covers the entire quarter, so it is not meant to be something that you memorize and understand entirely through one read through. Rather, it is a reference guide that you should be able to use to look up rules and examples.

::: section
## Java Conventions {#javaconventions .side-nav-header data-href="quality.html#javaconventions" level="0"}

Java syntax is writing code in a way that allows it to compile. Conventions are things that don\'t affect whether the code will compile, but are just generally accepted as part of writing good Java code, and are things that you should adhere to ensure you are writing good, readable code.

::: subsection
### Curly Braces

In Java curly braces are used to compartmentalize blocks of code. Lots of languages use curly braces, and Java has its a convention for how to use them. An opening curly brace should be placed at the end of the line that opened it, and the closing curly brace should be on a line by itself at the same level of indentation as the line with the opening curly brace.

``` java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```
:::

::: subsection
### Indentation

Indentation is an important way to help distinguish blocks of code. You should indent your program one tab further every time you open a curly brace `{` and indent one tab less every time you close a curly brace `}`.

> A tab should generally be 3 or 4 spaces, and you can set the size of your tab in your compiler. The jGrasp default is 3 spaces

Take these two examples:

``` {.code-sample .bad-code}
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
if (i % 2 == 0) {
System.out.println("Hello world!");
}
}
}
```

This method has no indentation, and is super hard to read as a result. Now look at the second method below:

``` {.code-sample .good-code}
public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
            System.out.println("Hello world");
        }
    }
}
```

Indentation makes code easier to read. It helps the reader see what code is nested where, and where structures like `if` statements and loops start and end.

> You can actually have jGRASP fix all your indentation for you! To the right of the **Undo** button is the **Generate CSD** button, which will automatically indent your code and add some structural annotations on your code, which can be removed with the next button to the right, the **Remove CSD** button.
:::

::: subsection
### Long Lines and Wrapping

To keep our code nice and compact and improve readability, lines of code should ideally max out at 80 characters, and should **never** exceed 100 characters in length. Lines that are too long should be broken up and wrapped to the next line.

> Note that in jGrasp, you can check your line length by putting your cursor at the end of the line and check the bottom right corner. There should be something that says \"Col:\"\" and then the number of characters in the line.

To break up a long comment, you can simply split the comment into two or more lines:

``` code-sample
// THIS IS A BAD COMMENT
// this is a bad comment because it is just so gosh darn long that it just makes it so hard to read

// THIS IS A GOOD COMMENT
// this is a good comment because when it reaches the point where it is too long,
// the comment just moves to the next line
```

Breaking up lines of code is a little more complicated. Choosing where to break up your lines can be a little arbitrary, but it\'s usually best to break the line *after* things like commas and operators. IMPORTANT: You cannot break a String up between lines. If you want to break a String up, you need to use two separate Strings that are concatenated. There are two conventions for wrapping a line of code:

1.  You can leave a hanging indent of two tabs relative to the start of the first line, like so:

``` code-sample
// Because the String to be printed is so long, it gets wrapped to the next line
public static void printReallyLongLine() {
    System.out.println("wow this line is so long it's like unreasonably long like" +
            "honestly it's so long why even");
}
```

2.  Or, if the long line has something in parentheses, like a method header, you can align the code inside the parentheses, like so:

``` code-sample
public static void thisMethodHeaderIsReallyLong(int thing, int otherThing,
                                                int moreThings, int anotherThing)
```

> Note that these are very bad method and variable names, and you should not use these as an example. These are just examples of long lines.
:::

::: subsection
### Spacing

It might seem trivial, but spacing is very important for writing readable code. Here are some examples of Java conventions for good spacing for your code:

  Code                      Good Spacing                                                    Bad Spacing
  ------------------------- --------------------------------------------------------------- --------------------------------------------------------------
  Class Header              `public class GoodSpacing {`{.language-java}                    `public class BadSpacing{`{.language-java}
  Method Header             `public void method(int param, int param2) {`{.language-java}   `public void method (int param,int param2){`{.language-java}
  Method Call               `method(7, 2);`{.language-java}                                 `method(7,2);`{.language-java}
  for loop                  `for (int i = 0; i < 5; i++) {`{.language-java}                 `for(int i=0;i<5;i++){`{.language-java}
  while loop                `while (test) {`{.language-java}                                `while(test){`{.language-java}
  Array Initialization      `int[] arr = new int[5];`{.language-java}                       `int [] arr=new int [5];`{.language-java}
  Variable Initialization   `int x = -5 * j + y % 2;`{.language-java}                       `int x=-5*j+y%2;`{.language-java}

> Note the spacing in expressions. Generally, you should always leave a space on either side of an operator (+, -, =, etc.). The only exceptions are `++`{.language-java}, `--`{.language-java}, and using `-`{.language-java} to express negative numbers (i.e. `-5`{.language-java} ).
:::

::: subsection
### Spacing Between Methods

Similar to spacing within lines of code, we want to ensure that we have spacing in the structure of our code to keep our code looking readable. You should always include a blank line between methods to make sure your code is easy to read through.

``` {.code-sample .good-code}
public class GoodSpacing {
    public static void main(String[] args) {
        ...
    }

    public static void method() {
        ...
    }

    public static void anotherMethod() {
        ...
    }
}
```
:::
:::

::: section
## Names {#names .side-nav-header data-href="quality.html#names" level="0"}

::: subsection
### Naming Conventions

We have certain conventions for how we name things in Java. Here are the conventions we use for different kinds of names in Java:

-   **Method & Variable Names**: These should be **camelCased**, a convention where the first letter of every word after the first is uppercased.
-   **Class Names**: These should be **PascalCased**, a subset of camel casing where the first letter of the first word is also uppercased.
-   **Constant Names**: These should be **SCREAMING_CASED**, in all uppercase with words separated by underscores.
:::

::: subsection
### Descriptive Names

The name of a variable should describe the value it stores and what it represents. Similarly, the name of a method should describe the task of the method. As a general rule of thumb, class and variable names should be nouns, and method names should be verbs. Abbreviations should not be used unless they are generally accepted abbreviations or very obvious, like num for number. It\'s usually best to avoid abbreviations. Only the following one-letter variable names should be used:

-   **Random r**: These are okay only for these objects only because they\'re common Java conventions.
-   **x and y (for coordinates)**: These are what we actually call Cartesian coordinates, so they\'re actually great variable names for this purpose (but, again, only for coordinates). Similarly, r is a good variable name for describing Polar coordinates (unfortunately there\'s no theta key, but if you can get the character it\'s also acceptable for a polar coordinate (a little more work than it\'s probably worth)).
-   **Loop variable names**: We use `i-j-k`{.language-java} for loop variable names because it is general programmer convention for `for`{.language-java} loops. `i`{.language-java} should be used for outer-loops, `j`{.language-java} for once-nested loops, `k`{.language-java} for twice nested loops, etc. Generally, if we use `i-j-k`{.language-java} convention for loop varaible names, we don\'e want to mix them with descriptive loop variable names. Descriptive loop variable names are okay, as is using `i-j-k`{.language-java} convention, but we want be consistent with one or the other. `i-j-k`{.language-java} convention should be used like this:

``` code-sample
for (int i = 0; i < 10; i++) {
    for (int j = 0; j < i; j++) {
        for (int k = i; k > j; k++) {
            System.out.print("*");
        }
        System.out.print("+");
    }
    System.out.println();
    for (int j = 0; j < i; j++) {
        System.out.print("#");
    }
    System.out.println();
}
```
:::
:::

::: section
## Methods {#methods .side-nav-header data-href="quality.html#methods" level="0"}

Technically, you could write an entire program in that program\'s main method. However, this would be an incredibly bad idea. Your main method could end up being thousands of lines long. It\'s generally considered good practice to factor your code into methods. Here are a few reasons why:

1.  **Methods Reduce Redundancy:** Often, you will want the exact same or very similar tasks multiple times in your program. Rather than writing the same code multiple times, which would be redundant, you can factor that code into a method that can be called throughout your program to perform that task. We can even use parameters and returns to create methods that have even more functionality to further reduce redundancy. Remember, you should *never* be copying and pasting code.
2.  **Methods Represent Tasks:** Even if code isn\'t redundant, it can still be a good idea to factor it into a method. Methods should represent a concrete task. A good example is printing an intro to your program; it\'s something you\'ll only do once, but it\'s a distinct task, so it makes sense to factor it into a method. An important aspect of this is making main a concise summary of the program. main runs the program, but it shouldn\'t be cluttered with all of the sub-tasks required to do that. Those tasks should each be factored into their own methods, whether or not they\'re redundant. Factoring code into methods with distinct tasks also makes it easier to reuse your code. If there\'s a method where you perform 2 tasks, and then later only want to perform only one, you couldn\'t call your existing method because you don\'t want to perform both tasks. It would be better to structure each task into its own method to make it more reusable.

A few things to avoid:

-   **Trivial methods** do so little that their existence is pointless. Methods with just one print statement or one method call are good examples. One-line methods can be non-trivial if you are factoring a common calculation into a method, for instance, but with methods with so little code, you should generally consider whether or not the method is improving your program.
-   Avoid cases where you have **unnecessary parameters and returns**. Methods only need to return a value if you plan on catching and using that value when you call your method. Otherwise, your method should just have a void return type. Similarly, you should only pass in parameters that you need. Parameters that you never use in your method or whose value could be calculated from other parameters are unnecessary. If you pass a parameter into your method but never use the value passed in (i.e. you immediately set its value to something else), you might want to consider whether you need that parameter at all, or if that value could be a local variable.
:::

::: section
## Printing {#printing .side-nav-header data-href="quality.html#printing" level="0"}

There are a few basic rules you should follow for printing in Java:

-   You should always print a blank line using `System.out.println()`. Printing an empty String (`System.out.println("")`{.language-java}) is considered bad style; it makes the intention less clear.
-   `\n` should never be used in `print`{.language-java} and `println`{.language-java} statements.
-   Rather than have a bunch of adjacent `print`{.language-java} statements, you should combine them into one where you can. `System.out.println("**")`{.language-java} is much preferred to `System.out.print("**"); System.out.println();`{.language-java}
:::

::: section
## Variables {#variables .side-nav-header data-href="quality.html#variables" level="0"}

Variables are used to store values so that we can access the same values in multiple places without having to do the same computations to get that value every time. However, there are some important things to consider when using variables:

::: subsection
### Scoping

You should declare your variables in the smallest scope necessary. If a variable only needs to keep its value through one iteration of a loop, you should declare it in the loop. If a variable needs to keep track of something across multiple iterations of a loop, you should declare it outside the loop. If you have a variable that you need to use in multiple places throughout your program, it\'s generally a good idea to declare it in main and pass it where it\'s needed using parameters and returns.
:::

::: subsection
### Constants

Some values are used all across your program. This is where it\'s good to make a class constant. Constants are unchanging values that exist everywhere in your program and represent some important value in your program. For example, the Math class has a constant for the value of PI, because it\'s an important value that is used often in the class and needs to have the same value everywhere. Constants also make code easier to change. Rather than having to change a value everywhere it is used, you can just change the value of the constant to change that value everywhere in the program that the constant is used. Constants should always be declared as `public static final <CONSTANT_NAME>`{.language-java}. The `final`{.language-java} keyword means that they cannot be changed after declaration.
:::
:::

::: section
## Types {#types .side-nav-header data-href="quality.html#types" level="0"}

::: subsection
### int vs double

ints and doubles both represent numbers and technically, anything that can be represented by an int can also be represented by a double. However, just because it can doesn\'t mean it should. You should always use the type that best represents the value you are storing; a percentage might make sense as a double, but a count should always be a whole number and should therefore be an int. Make sure to consider what your variables are representing before making them all doubles when they shouldn\'t be.
:::

::: subsection
### booleans

Similarly, there are a few different ways you can represent a true/false (or yes/no) value. You could represent it with an int as a 1 or a 0, or even with a String as \"yes\" or \"no\" or \"true\" or \"false\", however, there\'s a better type to represent that. You\'re representing one of two values, and that is exactly what a boolean should be used for. booleans represent a true or false value, and should always be used when you\'re saving some variable that represents one of two states.
:::
:::

::: section
## Conditionals {#conditionals .side-nav-header data-href="quality.html#conditionals" level="0"}

::: subsection
### if/else Structure Choice

Each set of if/else if/else branches can go into at most 1 branch, and an else branch guarantees that the program will go into a branch. When using conditionals in your program, you should use a structure that best matches the min and max number of branches you want to execute. For instance, take the following program:

``` {.code-sample .bad-code}
int x = r.nextInt(5) - 2; // range from -2 to 2
if (x < 0) {
    System.out.println("positive number generated");
}
if (x > 0) {
    System.out.println("negative generated");
}
if (x == 0) {
    System.out.println("0 generated");
}
```

The program as it is currently structured could go into 0-3 branches. However, because x can only be one value, the program logically should only go into 1 branch, so it would be better to use `else if`{.language-java}s, like so:

``` {.code-sample .okay-code}
int x = r.nextInt(4);
if (x < 0) {
    System.out.println("positive number generated");
} else if (x > 0) {
    System.out.println("negative number generated");
} else if (x == 0) {
    System.out.println("0 generated");
}
```

This ensures that the program will go into a maximum of 1 branch. However, this structure could still go into 0 branches, and the program should go into exactly 1. There are 3 possibilities and one of them must be true every time. The best way to structure this program would be to write a conditional structure that goes into exactly 1 branch:

``` {.code-sample .good-code}
int x = r.nextInt(4);
if (x > 0) {
    System.out.println("positive number generated");
} else if (x < 0) {
    System.out.println("negative number generated");
} else { // x == 0
    System.out.println("0 generated");
}
```

Note that all three of these programs do the same thing externally. However, the last program is the best stylistically because the other structures imply to anyone reading the code that x could fall into none of the branches, which we know is not possible.
:::

::: subsection
### Useless Branches

You should never write code that does nothing, and conditionals are a good example of this. Remember, every conditional doesn\'t need to have an else if or else branch; you should only write these branches when they\'re needed. Take the following code:

``` {.code-sample .bad-code}
System.out.print("How many numbers? ");
int nums = console.nextInt();
int max = 0;
for (int i = 0; i < nums; i++) {
    System.out.print("Input a positive integer: ");
    int n =  console.nextInt();
    if (n > max) {
        max = n;
    } else {
        max = max;
    }
}
```

In the else branch, all that\'s happening is setting `max = max`{.language-java}, which does nothing. Since this line of code does nothing, we can remove it:

``` {.code-sample .bad-code}
if (n > max) {
    max = n;
} else {
}
```

However, now the else branch is empty, and can be removed completely:

``` {.code-sample .good-code}
if (n > max) {
    max = n;
}
```

Similarly, sometimes you have nothing in your if branch and only want to execute code if the condition is false. In that case, you should structure your code with the opposite condition. Take the conditional from the previous example. If it had been structured like this:

``` {.code-sample .bad-code}
if (n <= max) {
} else {
    max = n;
}
```

We again have an empty branch, but can\'t remove it and have just an else. Instead, just use an if branch with the opposite condition, which eliminates the need for the empty branch.

``` {.code-sample .good-code}
if (n > max) {
    max = n;
}
```
:::

::: subsection
### Factoring

Conditionals are used to separate chunks of code that should be executed under specific conditions. If code is repeated between all the branches, then that means that that code should be executed regardless of the condition. Take the following code:

``` {.code-sample .bad-code}
int num = console.nextInt();
if (num % 2 == 0) {
    System.out.println("Your number was even.");
    return num;
} else {
    System.out.println("Your number was odd.");
    return num;
}
```

In both branches of the conditional, the return statement is the same. The only thing that is actually differs based on the condition is the printed statement, so that is all that should be inside the conditional. The redundant code should be factored out below the conditional:

``` {.code-sample .good-code}
int num = console.nextInt();
if (num % 2 == 0) {
    System.out.println("Your number was even.");
} else {
    System.out.println("Your number was odd.");
}
return num;
```
:::

::: subsection
### Boolean Zen

booleans represent a true or false value, and an equality test also returns a true or false value, so there\'s no reason to test if a boolean is equal to true or false. For instance, instead of:

``` {.code-sample .bad-code}
if (test == true) {
    // do something
}
```

We can actually just use test directly:

``` {.code-sample .good-code}
if (test) {
    // do something
}
```

Similarly, if we want to execute code when test is false, then we want to execute when `!test`{.language-java} is true, so instead of testing:

``` {.code-sample .bad-code}
if (test == false) {
    // do something
}
```

We should just do the following instead:

``` {.code-sample .good-code}
if (!test) {
    // do something
}
```

Similarly, we can use boolean zen to concisely return a boolean based on a test as well. Look at this code:

``` {.code-sample .bad-code}
if (test) {
    return true;
} else {
    return false;
}
```

This code returns true when test is true, and false when test is false; it basically just returns the value of test. The entire conditional can be replaced with one line of code:

``` {.code-sample .good-code}
return test;
```

We can also use boolean zen to make giving values to boolean variables more concise. Check out this code:

``` {.code-sample .bad-code}
int age = console.nextInt();
boolean canDrive;
if (age >= 16) {
    canDrive = true;
} else {
    canDrive = false;
}
```

`age >= 16`{.language-java} returns a boolean value, and if it\'s true `canDrive`{.language-java} is set to true, and if it\'s false `canDrive`{.language-java} is set to false. This is the same situation as the return, so instead of the conditional we can just set canDrive directly equal to `age >= 16`{.language-java}:

``` {.code-sample .good-code}
int age = console.nextInt();
boolean canDrive = age >= 16;
```

## Loops {#loops .side-nav-header data-href="quality.html#loops" level="0"}

Something important to first consider is if you actually need a loop. Loops should be used to perform repeated actions. If you only want to do something once, then there\'s no point in having a loop, since you could just include the code without the loop and it would do the same thing.

``` {.code-sample .bad-code}
public static int square (int num) {
    int square = num;
    for (int i = 0; i < 1; i++) {
        square *= num;
    }
    return square;
}
```

In this case, we\'re using a loop to perform an action that we only need to do once. We can replace this entire loop with the code inside it and that would not change anything about what happens when we run the code.

``` {.code-sample .good-code}
public static int square (int num) {
    int square = num;
    square *= num;
    return square;
}
```

Similarly, if you only want to do something once after a bunch of repetitions, you should not include that code in the loop, because it\'s not actually repeating. For example:

``` {.code-sample .bad-code}
for (int i = 0; i <= 5; i++) {
    System.out.print("*");
    if (i == 5) {
        System.out.println(" done");
    }
}
```

In this code they are only printing \"done\" at the end of the last iteration, so they should just pull that out of the loop, like this:

``` {.code-sample .good-code}
for (int i = 0; i <= 5; i++) {
    System.out.print("*");
}
System.out.println(" done");
```

Always make sure you are using the right kind of loop. `for`{.language-java} loops should be used when you know how many times you want to perform a repeated action (these are very helpful for String and array traversals). `while`{.language-java} and `do-while`{.language-java} loops are great for when you aren\'t sure how many times your loop will run.

> The difference between a while and do-while loop is that a do-while is guaranteed to run at least once and then function as a while loop. A while loop may never run, but a do-while loop is guaranteed to run at least once.
:::
:::

::: section
## Using Objects (Scanners, Random, etc.) {#usingobjectsscannersrandometc .side-nav-header data-href="quality.html#usingobjectsscannersrandometc" level="0"}

It\'s generally good to try to minimize the number of objects your program creates. For example, rather than creating a Scanner that takes in user input in every method where your program needs to take in user input, it would be better to create one Scanner that takes in user input in main and pass that Scanner as a parameter to all of the methods that need it. The same goes for Random objects, Graphics objects, and any other objects that do the same thing throughout your program. See the following two programs for examples:

``` {.code-sample .bad-code}
// BAD
public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    ...
    method1();
}

public static void method1() {
    Scanner console = new Scanner(System.in);
    ...
}
```

``` {.code-sample .good-code}
// GOOD
public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    ...
    method1(console);
}

public static void method1(Scanner console) {
    ...
}
```
:::

::: section
## Arrays {#arrays .side-nav-header data-href="quality.html#arrays" level="0"}

Arrays can be used to store multiple values, but with great power comes great responsibility. Arrays should be used to store related values. They should not be used to store multiple independent values. For instance:

``` {.code-sample .bad-code}
int[] numbers = new int[3];
System.out.print("What day of the month is it (1-31)? ");
numbers[0] = console.nextInt();
System.out.print("What is the temperature today? ");
numbers[1] = console.nextInt();
System.out.print("How old are you? ");
numbers[2] = console.nextInt();
```

This is an example of cramming a bunch of data into an array even though that data has nothing to do with each other.

> On a similar note, sometimes it can make sense to return an array, but just because you **can** return an array doesn\'t mean you should use it as a way to hack returning multiple values from a method.

::: subsection
### Unrolling Arrays

Often when using arrays, you need to access data from a certain range of indices (usually the entire array). To do this, you should always use a loop to traverse the indices of the array, rather than \"unrolling\" the array by manually accessing each index of the array. Even if you know exactly how many items are in your array, using a loop is better stylistically. It makes your code much more flexible; you could change the size of your array without having to change the way you access the array\'s elements!

``` {.code-sample .bad-code}
double[] temperatures = {32,41,39,58};

// BAD APPROACH: unrolling
double avgTemp1 = 0;
avgTemp1 += temperatures[0];
avgTemp1 += temperatures[1];
avgTemp1 += temperatures[2];
avgTemp1 += temperatures[3];
avgTemp1 = avgTemp / temperatures.length;
```

``` {.code-sample .bad-code}
// Also a bad approach. Even though it's all in one line,
// it's still manually unrolling the array and therefore inflexible
double avgTemp2 = temperatures[0] + temperatures[1] + temperatures[2] + temperatures[3];
avgTemp2 = avgTemp2 / temperatures.length;
```

``` {.code-sample .good-code}
// GOOD APPROACH: array traversal
double avgTemp = 0;
for (int i = 0; i < numbers.length; i++) {
    avgTemp += temperatures[i];
}
avgTemp = avgTemp / temperatures.length
```
:::
:::

::: section
## Commenting Your Code {#commentingyourcode .side-nav-header data-href="quality.html#commentingyourcode" level="0"}

Documenting your code is an essential part of computer programming. Documenting means writing English comments about your code that explain what it does. It makes your code easier to maintain and update. It also makes your code easier to understand, both for yourself and for others working on the same code. This section of the code quality guide will show you how to write good comments.

There are two ways to write comments in Java; *single-line* and *multi-line* comments:

``` code-sample
// This is a single-line comment
```

``` code-sample
/* This is a
multi-line comment */
```

Either way is fine for writing comments, but generally programmers like to stick with one or the other for consistency.
:::

::: section
### Header and Class Comment {#headerandclasscomment .side-nav-header data-href="quality.html#headerandclasscomment" level="1"}

You should have two comments at the beginning of your file before your program. The first is the **header comment**, which provides identifying information about you as the author of the program, similar to a header you would write for an essay. You should include your name, the date, the class (IT-CS 115), your instructor\'s name, and the name of the program (the assignment). The second is a **class comment** that provides a high-level description of what your program does. An important thing to remember is that your class comment should only describe what your program does, not how it does it. A client of your code doesn\'t care and shouldn\'t need to know how your code works (ie. using Scanners/PrintStreams, some sort of loop or conditional structure, class constants, etc.). Including these *implementation details* in your comment also makes it difficult to change your code later on and still have accurate comments. Omitting implementation details allows you to change how you implement your code without having to change your documentation. An example of a good class header could be:

``` code-sample
// Student Studentname
// 11.20.2018
// IT-CS 115
// Prof Anna Batra
// IMDB Search
// Searches a text file containing information about the top 250
// rated movies on IMDB for movies containing a particular word in the title,
// then prints the results to an output file.

import java.util.*;
import java.io.*;
public class ImdbSearch {...}
```

> Note: These comments should come before all code, including `import`{.language-java} statements. You can see the full code for ImdbSearch [here](https://courses.cs.washington.edu/courses/cse142/18au/lectures/11-02/programs/ImdbSearch.java).
:::

::: section
### Method Comments {#methodcomments .side-nav-header data-href="quality.html#methodcomments" level="1"}

You should include a comment for every method in your program, except main (main should be a concise summary of the program, and your class comment should already describe what your program does). A method comment should describe what a method does, information about the parameters it takes (if it takes parameters), and what is returned by the method (if the method returns). For parameter comments, make sure to explicitly name and describe the purpose of all parameters \-- what information does this parameter provide? Think of commenting on parameters as providing a brief definition.

> Note that just like with class comments, you should avoid talking about **implementation details** in your method comments for the same reasons. The client does not need to know how your method works and omitting implementation details allows you to change how you implement your code without changing your code documentation.

Take for example the method `roundN`{.language-java}

``` code-sample
public static double roundN(double num, int digits) {
    return Math.round(num * Math.pow(10, digits)) / Math.pow(10, digits);
}
```

`roundN`{.language-java} rounds a given number to a given number of digits (you don\'t need to understand anything about how this method works, so it\'s fine if the method itself makes no sense to you right now). Here are a few different styles of good, complete comments for this method:

``` code-sample
// Rounds a given number num to the given number of digits and
// returns the rounded number
public static double roundN(double num, int digits) {...}
```

``` code-sample
// Rounds a given number to the given number of digits.
// Returns the rounded number.
// Parameters:
//    double num - the number to be rounded
//    int digits - the number of digits to round to
public static double roundN(double num, int digits) {...}
```

``` code-sample
/**
 * Rounds a given number to a given number of digits.
 * @param num - the number to be rounded
 * @param digits - the number of digits to round to
 * @return the rounded number
 */
public static double roundN(double num, int digits) {...}
```

> The last comment in what is called Javadoc notation. Javadoc uses multi-line comments that start with `/**`. Javadoc gives you a really nice template for commenting, but is not at all necessary for your comments in this class. Javadoc also allows you to generate documentation files for your program similar to the official Java docs. You can do this in jGrasp by hitting the button that looks like an open book in the toolbar or from menus **File \> Generate Documentation**. You can learn more about Javadoc documentation [here](https://www.baeldung.com/javadoc){target="_blank"}.
:::

::: section
### Inline Comments {#inlinecomments .side-nav-header data-href="quality.html#inlinecomments" level="1"}

Sometimes it can be helpful to have more specific comments within your code, usually within your methods, that explain more complex lines or sections of code. These are called **inline comments**. Some good places to include inline comments would be:

-   class constants
-   strange initializations
-   loop priming (initializing variables to certain values to start a loop)
-   complex expressions
-   confusing tests and conditions

> This is not an exhaustive list \-- if you have code you feel needs explaining, that\'s a good place for an inline comment. Try putting yourself in a client\'s shoes and see if anything might be confusing.

An inline comment can be placed either at the end of the line of code it explains or directly above the code it explains (this is more preferable if putting it on the same line would make that line too long). Here are some exampes:

``` code-sample
public static void printRandomNums(int nums, int limit) {
    Random r = new Random();
    int max = 0;
    for (int i = 0; i < nums; i++) {
        // generates a random number from 1 - limit
        int num = r.nextInt(limit) + 1;

        if (max < num) {
            max = num; // keeps track of max generated number
        }
        System.out.print(num + " ");
    }
}
```
:::

::: section
### Comment Templates {#commenttemplates .side-nav-header data-href="quality.html#commenttemplates" level="1"}

> Note: You should replace any text surrounded by `<` and `>` with the relevant information for your program.

::: subsection
#### Header and Class Comment {#header-and-class-comment}

This is a good example of what you should include in your header and class comment and how to format them:

``` code-sample
// <Your Name (First and Last)>
// <Date>
// IT-CS 115
// Prof Anna Batra
// <Program Name>
// Class Comment: <high level description of your program goes here>
```
:::

::: subsection
#### Method Comment

There are a few options. These two are both great styles for method comments, and the second uses the Javadoc notation introduced earlier:

``` code-sample
// <description of method>
// <what the method returns (if applicable)>
// parameters:
//    <parameter1> - <description of parameter1>
//    <parameter2> - <description of parameter2>
//    etc...
```

``` code-sample
/**
 * <description of method>
 * @param <parameter1> - <description of parameter1>
 * @param <parameter2> - <description of parameter2>
 * etc...
 * @return <what the method returns (only if applicable)>
 */
```

> Your method comment does not *have* to be in one of these formats. These are just two formats that include all the important information for a method comment.
:::
:::

::: section
### Things to Avoid in Comments {#thingstoavoidincomments .side-nav-header data-href="quality.html#thingstoavoidincomments" level="1"}

::: subsection
#### Language

There are some phrases you should avoid in your comments. Saying \"this method\" or \"this program\" in a method or class comment does not add any valuable information; we already know you\'re talking about the method/program, so you should just say what it does. You should also avoid saying that a method \"should\" do something. You should comment on what your method does do, not what it should.
:::

::: subsection
#### Implementation Details

As mentioned previously, you should never include **implementation details** in class and method comments. The client does not need to know how your code works, and omitting implementation details allows you to change how you implement your code without changing your code documentation. Here are some examples of things you should never include in comments:

-   Control structure usage (if, for, while)
-   methods used
-   *\"static method\"*
-   *\"calls\"*
-   *\"loop\"*
-   *\"class constant\"*
-   *\"extends\"*

Finally, you should absolutely never refer to the spec in your comments. The spec is for you, and you should assume that a client of your program has no knowledge of it. We also hope that this is clear, but your comments should be your description of your program, so copying text verbatim from the spec **is considered academic misconduct and not allowed**.
:::
:::

::: section
## Forbidden Features {#forbiddenfeatures .side-nav-header data-href="quality.html#forbiddenfeatures" level="0"}

In general, once a class has been discussed, it is available for use by students. (For example, once the String class is introduced, you may assume that you can call any of the available String methods in future programming assignments without asking permission). Unless otherwise specified, language features should not be used before they have been introduced in class (e.g. you should not use if statements in any assignment until you have seen them in class). Students should realize, however, that saying that you are not forbidden from using a certain construct is not the same thing as saying that it is a good idea to use a certain construct. We generally don\'t give advice to students about which constructs to use; you should use your best judgment to decide. (Though if a particular assignment states that you are required to use a construct, you should do so.)

In addition, there are some constructs that you are NEVER allowed to use, as described below. Java has grown to be a complex language with many features, and we don\'t have time to teach all of these features in IT-CS 115. We have a general rule that students should not use \"advanced\" material that we have not covered in class. In addition, we have identified several Java features that we do not want students to use at all. It is not bad style to use these features, but we want to have a level playing field for all students. Since we don\'t teach these features in the class, we do not allow them to be used to avoid giving an advantage to students who have learned about the features on their own.

**The following features should NEVER be used in any graded IT-CS 115 work (unless otherwise specified by the assignment or problem):**

-   `break` or `continue`
-   the `switch` statement
-   `try/catch`
-   annotations
-   the `<>` operator
-   the `var` keyword
-   Java 8 functional features (e.g., lambdas, streams, method references)
-   the `toCharArray`, `join`, and `matches` methods of String
-   the `StringBuilder`, `StringBuffer`, `StringJoiner`, `StringTokenizer` classes
-   the methods `Arrays.fill`, `Arrays.asList`, `Arrays.copyOfRange`, and `Arrays.sort`
-   multi-dimensional arrays
-   the `toArray` and `clone` methods of `ArrayList`
-   the methods `Collections.copy` and `Collections.sort`

(Don\'t worry if you are not familiar with one of the features listed above. You can simply think of these as Java features we have chosen not to teach in this class so that we can focus on other important concepts instead.)
:::
:::
:::
:::
:::


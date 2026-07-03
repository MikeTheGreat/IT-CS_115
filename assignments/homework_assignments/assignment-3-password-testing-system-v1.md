---
title: "Assignment 3 - Password Testing System - Opportunity #1"
published: false
---
[PASTE_SNIPPET_INTO_FRONTMATTER](../../snippets/frontmatter/homework_assignment.yaml) 

## You are not allowed to work in groups this assignment
Reminder: For this assignment, you should start, finish, and do all the work on your own.  If you have questions, please contact the instructor.


## **Purpose**

As you have seen from the exercises on methods and in Assignment 3, there are many benefits of modularity. These benefits include solving overall problem first, and work on the details later, code reusability, easier code maintainability, and finding and fixing errors become much easier. In this assignment, you will have another shot at practicing writing programs in modules. Knowing how to modularize tasks is an important skill set for any programmer.

## **Learning outcomes**

-   Learn: Build basic programs in an appropriate programming language
-   Learn: Participate in exercises (in-class and/or online) designed to develop an understanding of object oriented programming
-   Think: Develop expertise in techniques and approaches to independently fix bugs in program source code
-   Think: Develop and apply computer science knowledge in order to construct solutions to foundational programing problems
-   Think: Demonstrate an intuitive understanding of each programming language construct
-   Communicate: Clearly document problem solutions
-   Communicate: Use written, spoken, and symbolic forms to convey concepts creatively

## **Tasks**

**NOTE: You must limit yourself to the topics and techniques we have covered in this class (or a pre-req class), and within this class you can only use those topics that we were covered when this assignment was first due.**

Write a program to implement a password testing system. Your program will use a loop to prompt a user to enter a password and repeat until the password passes five tests.

1.  It is long enough (8 or more characters)
2.  It contains at least 2 numbers
3.  It does not start with a number
4.  It contains at least two upper case letters
5.  It contains at least 1 lower case letter

### Directions

Create five separate static methods, each to test one of the above requirements. The sixth static method will call the other five methods to test whether a String password passed to it is a valid password. If it is valid, it will display a String *Password accepted* and exit the program, else, it will keep displaying *Invalid password, try again* until the user supplies a valid password. Your main method will create a Scanner and enter a data verification loop ( a repeated while loop) which will input the password and call your ValidPassword() method (the sixth method) until the password passes all the five requirements. Sample output is shown below.

Sample program run:

``` {style="padding-left: 40px;"}
Password: TesT23
Invalid password, try again

Password: TestTin2
Invalid password, try again

Password: 2TesTing2
Invalid password, try again

Password: Testing23
Invalid password, try again

Password: TESTING23
Invalid password, try again

Password: TesTing23
Password accepted
```

***Hint***: To test if a character is upper case, lower case or digit, use the Character methods (Character.isUpperCase(ch), Character.isLowerCase(ch) and Character.isDigit(ch)). 

## **Submission**

Submit your program file through Canvas.

Remember to always [Make Sure That You Submitted The Correct File(s) For Your Homework!](../../pages/course_orientation/how-to-make-sure-that-you-submitted-the-correct-file-s-for-your-homework.md "How To Make Sure That You Submitted The Correct File(s) For Your Homework")

## **Grading Criteria**

This assignment is worth 50 points. Your work will be graded using the attached rubric.

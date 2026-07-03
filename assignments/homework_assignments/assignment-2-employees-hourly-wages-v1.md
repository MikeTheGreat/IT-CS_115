---
title: "Assignment 2 - Employees Hourly Wages - Opportunity #1"
---
[PASTE_SNIPPET_INTO_FRONTMATTER](../../snippets/frontmatter/homework_assignment.yaml)

## You are not allowed to work in groups this assignment
Reminder: For this assignment, you should start, finish, and do all the work on your own.  If you have questions, please contact the instructor.

 

## **Purpose**

The purpose of this assignment is to improve your knowledge of reading input from the keyboard, demonstrate your understanding of how to check inputs for certain conditions, and how to use expressions to calculate the desired answers/results. Knowing how to use these control structures to perform complex computations is very important to writing programs for solving many real-world problems.

 

## **Learning outcomes**

-   Learn: Build basic programs in an appropriate programming language
-   Learn: Participate in exercises (in-class and/or online) designed to develop an understanding of object-oriented programming
-   Think: Develop expertise in techniques and approaches to independently fix bugs in program source code
-   Think: Demonstrate an intuitive understanding of each programming language construct
-   Communicate: Clearly document problem solutions
-   Communicate: Use written, spoken, and symbolic forms to convey concepts creatively

 

## **Tasks**

**NOTE: You must limit yourself to the topics and techniques we have covered in this class (or a pre-req class), and within this class you can only use those topics that we were covered when this assignment was first due.**

Cascadia College needs a program to calculate how much to pay her hourly employees. The US Department of Labor requires that employees get paid time and a half for any hours over 40 that they work in a single week. For example, if an employee works 45 hours, he gets 5 hours of overtime, at 1.5 times his hourly pay. The Washington State Department of Labor and Industries as of January 1, 2021, approved employees to be paid at least \$13.69 an hour. Your program should consider that Cascadia College might requires an employee not work more than 60 hours in a week.

### Summary of Rules

-   An employee gets paid (hours worked) × (hourly pay), for each hour up to 40 hours.
-   For every hour over 40, they get overtime = (hourly pay) × 1.5.
-   The hourly pay must not be less than the minimum wage (\$13.69 an hour). If it is, print an error. If the number of hours is greater than 60, print an error message.

### Directions

Create a new class called *EmployeeHourlyPay*. Write a program that takes the hourly pay and hours worked as inputs and prints the gross pay or an error. Your program should print the gross pay for at least each of the following employees:

| Employee | Hourly Pay | Hours Worked |
|----------|-----------|-------------|
| Employee 1 | $14.25 | 38 |
| Employee 2 | $14.50 | 47 |
| Employee 3 | $15.00 | 52 |
| Employee 4 | $12.69 | 62 |


### Examples

Examples of the program running are provided below: (Your prompt should be the same as the following but the values in your output do not have to be the same )

``` {style="padding-left: 40px;"}
Enter the hourly pay and hours worked  by 4 employees
Enter hourly rate for Employee #1: 14.25
Enter hourly worked for Employee #1: 38
Employee #1 gross pay: $541.50
Enter hourly rate for Employee #2: 14.50
Enter hourly worked for Employee #2: 47
Employee #2 gross pay: $732.25
Enter hourly rate for Employee #3: 15
Enter hourly worked for Employee #3: 52
Employee #3 gross pay: $870.00
Enter hourly rate for Employee #4: 12.69
Enter hourly worked for Employee #4: 62
Error!, it is either you are paid less or you are overworked or both
```

***#2 Run:***

``` {style="padding-left: 40px;"}
Enter the hourly pay and hours worked  by 4 employees
Enter hourly rate for Employee #1: 15.56
Enter hourly worked for Employee #1: 42
Employee #1 gross pay: $669.08
Enter hourly rate for Employee #2: 12.45
Enter hourly worked for Employee #2: 45
Error!, it is either you are paid less or you are overworked or both
Enter hourly rate for Employee #3: 13.98
Enter hourly worked for Employee #3: 50
Employee #3 gross pay: $768.90
Enter hourly rate for Employee #4: 16.67
Enter hourly worked for Employee #4: 40
Employee #4 gross pay: $666.80
```

***Hint***: Do not try to write the entire program in one go. It is much easier to write a small piece and test it, then write another small piece and test it. For example, start by declaring and initializing all the variables you will need for the program, then add the code to do the normal salary computation, without any special rules. Then add each additional rule, one at a time. You should test your program with simple test inputs to check that you handle each case.

## **Submission**

Submit your ***EmployeeHourlyPay*.java** file through Canvas.

Remember to always [Make Sure That You Submitted The Correct File(s) For Your Homework!](../../pages/course_orientation/how-to-make-sure-that-you-submitted-the-correct-file-s-for-your-homework.md "How To Make Sure That You Submitted The Correct File(s) For Your Homework")

 

## **Grading Criteria**

This assignment is worth 50 points. Your work will be graded using the attached rubric.


---
title: "Assignment 4 - College Admission - Opportunity #1"
---
[PASTE_SNIPPET_INTO_FRONTMATTER](../../snippets/frontmatter/homework_assignment.yaml)

## You are not allowed to work in groups this assignment
Reminder: For this assignment, you should start, finish, and do all the work on your own.  If you have questions, please contact the instructor.

 

## **Purpose**

This assignment will give you another opportunity to practice with interactive programs, if/else statements, and methods that return values.  It is complicated to design, write, debug, and understand a program if all of the code is located in one method. To support modularization, the idea that our programs consists of independent modules, each a specialist in what it does, we break up our programs into modules. These modules are called *methods* in Java. In this assignment, you will apply all the concepts that you have learned to creating different methods, each performing independent task, in your programs and then call them.

## **Learning outcomes**

-   Learn: Build basic programs in an appropriate programming language
-   Learn: Participate in exercises (in-class and/or online) designed to develop an understanding of object oriented programming
-   Think: Develop expertise in techniques and approaches to independently fix bugs in program source code
-   Think: Develop and apply computer science knowledge in order to construct solutions to foundational programing problems
-   Think: Demonstrate an intuitive understanding of each programming language construct
-   Communicate: Clearly document problem solutions
-   Communicate: Use written, spoken, and symbolic forms to convey concepts creatively

## **Tasks**

**NOTE: You must limit yourself to the topics and techniques we have covered in this class (or a pre-req class), and within this class you can only use those topics that we were covered when this assignment was first due.**

Write a program that prompts a user for information about two applicants and then computes an overall score for each applicant.  This is a simplified version of a program that might be used for admissions purposes. 

Look at the sample logs of execution to see how your program is should behave. Your program must exactly reproduce the behavior demonstrated in the logs. For each applicant, you prompt for exam scores (either SAT or ACT) and overall GPA. The exam information is turned into a number between 0 and 100 and the GPA information is turned into a number between 0 and 100 and these two scores are added together to get an overall score between 0 and 200. After obtaining scores for each applicant, the program reports which one looks better or whether they look equal.

### **Information**

You will notice that the program asks for each applicant whether to enter SAT scores or ACT scores (SAT scores are integers that vary between 200 and 800, ACT scores are integers that vary between 1 and 36). In the case of SAT scores, the user is prompted for SAT verbal and SAT math subscores.  In the case of ACT scores, the user is prompted for English, math, reading and science subscores. 

These scores are turned into a number between 0 and 100 using the following formulas:

![LaTeX: For\\:SAT\\:Scores\\:=\\:\\frac{2\\times verbal\\:+math}{24}](https://cascadia.instructure.com/equation_images/For%255C%253ASAT%255C%253AScores%255C%253A%253D%255C%253A%255Cfrac%257B2%255Ctimes%2520verbal%255C%253A%252Bmath%257D%257B24%257D "For\:SAT\:Scores\:=\:\frac{2\times verbal\:+math}{24}"){.equation_image equation-content="For\\:SAT\\:Scores\\:=\\:\\frac{2\\times verbal\\:+math}{24}"}

![LaTeX: For\\:ACT\\:Scores\\:=\\:\\frac{2\\times reading\\:+\\:English+math+science}{1.8}](https://cascadia.instructure.com/equation_images/For%255C%253AACT%255C%253AScores%255C%253A%253D%255C%253A%255Cfrac%257B2%255Ctimes%2520reading%255C%253A%252B%255C%253AEnglish%252Bmath%252Bscience%257D%257B1.8%257D "For\:ACT\:Scores\:=\:\frac{2\times reading\:+\:English+math+science}{1.8}"){.equation_image equation-content="For\\:ACT\\:Scores\\:=\\:\\frac{2\\times reading\\:+\\:English+math+science}{1.8}"}

These formulas produce numbers in the range of 0 to 100.  After computing this exam score, we compute a number between 0 and 100 based on the GPA. 

You will notice that the program prompts for the GPA and the maximum GPA.  Both the GPA and maximum GPA are real values (i.e., they can have a decimal part).  You should turn this into a score between 0 and 100 using the following formula:

![LaTeX: \\frac{actual\_{gpa}}{\\max\_{gpa}}\\times100](https://cascadia.instructure.com/equation_images/%255Cfrac%257Bactual_%257Bgpa%257D%257D%257B%255Cmax_%257Bgpa%257D%257D%255Ctimes100 "\frac{actual_{gpa}}{\max_{gpa}}\times100"){.equation_image equation-content="\\frac{actual_{gpa}}{\\max_{gpa}}\\times100"}

At this point your program has two scores that vary from 0 to 100, one from their test score and one from their GPA.  The overall score for the applicant is computed as the sum of these two numbers (exam result + gpa result).  Because each of these numbers is between 0 and 100, the overall score for an applicant ranges from 0 to 200.

### Directions

You do not have to perform any error checking.  We will assume that the user enters numbers and that they are in the appropriate range. In terms of program style, you should use static methods to eliminate redundant code and to break the problem up into logical subtasks.  Your main method should be short so that a person can easily see the overall structure of the program. You are to introduce ***at least five static methods*** other than main to break this problem up into smaller subtasks and you should make sure that no single method is doing too much work.  The following are the names of your methods and the tasks they should do:

1.  *public static double applicant(String studentNumberOrName, Scanner cin*) - This is a static method that returns a double value. It has two parameters (one String and the second is a Scanner object). This method prompts the user to supply either 1 for SAT scores or 2 for ACT scores. If the user input is 1, the computeSAT method is called, otherwise, the computeACT is called. This method also computes applicant\'s second score which is the GPA, by calling computeGPA method.
2.  *public static double computeSAT(Scanner cin)* - This is a static method that returns a double value. It has one parameter (a Scanner object). This method prompts for SAT math, SAT verbal, and computes the SAT scores using the above formula.
3.  *public static double computeACT(Scanner cin)* - This is a static method that returns a double value. It has one parameter (a Scanner object). This method prompts for ACT English, ACT math, ACT reading, and ACT science. It will also computes ACT scores using the above formula. 
4.  *public static double computeGPA(Scanner cin)* - This is a static method that returns a double value. It has one parameter (a Scanner object). This method prompts for the overall GPA, max GPA, and computes the GPA using the above formula.
5.  *public static void reportResults(double var1, double var2)*  - This is a static method that returns nothing. However, it has two double parameters. This method prompts for the applicants overall scores. It then uses if-statement to print the applicant with a better score.
6.  You can create an ***optional*** method to print some introduction info about the program. 

Be sure to include a short comment at the beginning of your program as well as a short comment for each method describing what it does. Also remember that because this program involves both integer data and real data, you need to use appropriate type declarations (type int and calls on nextInt for integer data, type double and calls on nextDouble for real-valued data). Your program should be stored in a file called *CollegeAdmission.java*. 

**[First log of execution (user input underlined)]{.underline}**

``` {style="padding-left: 40px;"}
This program compares two applicants to determine which one seems like the stronger applicant. 
For each candidate I will need either SAT or ACT scores plus a weighted GPA.
Information for the first applicant:
    do you have 1) SAT scores or 2) ACT scores? 1
    SAT math? 450
    SAT verbal? 530
    overall GPA? 3.4
    max GPA? 4.0
Information for the second applicant:
    do you have 1) SAT scores or 2) ACT scores? 2
    ACT English? 25
    ACT math? 20
    ACT reading? 18
    ACT science? 15
    overall GPA? 3.3
    max GPA? 4.0

First applicant overall score  = 147.92
Second applicant overall score = 135.83
The first applicant seems to be better
```

**[Second log of execution (user input underlined)]{.underline}**

``` {style="padding-left: 40px;"}
This program compares two applicants to determine which one seems like the stronger
applicant.  For each candidate I will need either SAT or ACT scores plus a weighted GPA.
Information for the first applicant:
    do you have 1) SAT scores or 2) ACT scores? 2
    ACT English? 20
    ACT math? 19
    ACT reading? 21
    ACT science? 30
    overall GPA? 3.5
    max GPA? 4.0

Information for the second applicant:
    do you have 1) SAT scores or 2) ACT scores? 1
    SAT math? 610
    SAT verbal? 640
    overall GPA? 4.3
    max GPA? 5.0

First applicant overall score  = 149.17
Second applicant overall score = 164.75
The second applicant seems to be better
```

**[Third log of execution (user input underlined)]{.underline}**

``` {style="padding-left: 40px;"}
This program compares two applicants to determine which one seems like the stronger applicant.  
For each candidate I will need either SAT or ACT scores plus a weighted GPA.
Information for the first applicant:
    do you have 1) SAT scores or 2) ACT scores? 1
    SAT math? 510
    SAT verbal? 530
    overall GPA? 3.4
    max GPA? 4.0

Information for the second applicant:
    do you have 1) SAT scores or 2) ACT scores? 1
    SAT math? 570
    SAT verbal? 500
    overall GPA? 3.4
    max GPA? 4.0

First applicant overall score  = 150.42
Second applicant overall score = 150.42
The two applicants seem to be equal
```

**Note:** Please make sure to follow the above format as closely as you can.  Specifically, please make sure to print the two applicants scores at the end of the program, after a blank line, and each score on it\'s own line (followed by the decision about which applicant seems better) (as shown in the examples above).

**Note 2:** Notice that the program asks for ACT scores in the order of English, then Math, then Reading, then Science, but the formula uses two times Reading as it\'s first term

**Note 3:** You can use [this Excel file](../../assets/assignment-related/assignment-4-college-admission/grade-calculator-checker.xlsx) to check the above examples (and to check your own numbers).  You can also upload this Excel file to Google Docs and use the Google Docs Spreadsheet, too

## **Submission**

Submit your program file file through Canvas.

Remember to always [Make Sure That You Submitted The Correct File(s) For Your Homework!](../../pages/course_orientation/how-to-make-sure-that-you-submitted-the-correct-file-s-for-your-homework.md "How To Make Sure That You Submitted The Correct File(s) For Your Homework")

 

## **Grading Criteria**

This assignment is worth 50 points. Your work will be graded using the attached rubric.


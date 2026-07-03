---
title: "Assignment 1 - User's Input - Opportunity #1"
---
[PASTE_SNIPPET_INTO_FRONTMATTER](../../snippets/frontmatter/homework_assignment.yaml)

## You are not allowed to work in groups this assignment
Reminder: For this assignment, you should start, finish, and do all the work on your own.  If you have questions, please contact the instructor.
 

## **Purpose**

Most applications will require input either from the user (via keyboard) or from stored data on files. We have seen how we can hard code input as literal values in the earlier exercises, however, this does not provide the program with any flexibility. Instead, we need to know how to obtain user input. To make things easy, Java provides a Scanner class, to handle common input tasks. In this assignment**, **you will use the Scanner to get input and use various forms of conversions to change data types including casts that we discussed in lecture 4.

## **Learning outcomes**

-   Learn: Build basic programs in an appropriate programming language
-   Learn: Participate in exercises (in-class and/or online) designed to develop an understanding of object oriented programming
-   Think: Develop and apply computer science knowledge in order to construct solutions to foundational programing problems
-   Think: Demonstrate an intuitive understanding of each programming language construct
-   Communicate: Clearly document problem solutions
-   Communicate: Use written, spoken, and symbolic forms to convey concepts creatively

## **Tasks**

**NOTE: You must limit yourself to the topics and techniques we have covered in this class (or a pre-req class), and within this class you can only use those topics that we were covered when this assignment was first due.**

1.  The following is a simple program that obtains different types of input, uses some of the input for a computation and then outputs the results. Create a new Java file called **Assignment1.java**, enter this program, save, compile, and debug it (if you have syntax errors). This is a practice for the program you will write in second part of the exercise:

``` {style="padding-left: 40px;"}
import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      String city1, city2;
      int distance;
      double costPerMile;
      int dollarAmount;
      System.out.print("Enter the starting city: ");
      city1=in.next();
      System.out.print("Enter the ending city: ");
      city2=in.next();
      System.out.print("Enter distance in miles between cities: ");
      distance=in.nextInt();
      System.out.print("Enter the cost of travel per mile: ");
      costPerMile=in.nextDouble();
      dollarAmount=(int)(distance*costPerMile);
      System.out.println("\n\nThe cost of traveling from " + city1 + " to " + city2 + " is $" + dollarAmount);
  }
}
```

**Run** the program inputting Bothell, Olympia, 80 and 0.135. Your output should be \$10.\
Other than running this program there is nothing else that you are required to do.\
That also means that there\'s nothing that you are required to hand in for Part 1.

 2.  You [will write a similar program to the above but call it Assignment1_2. Here, you will compute a car's gas mileage and the amount you spend per mile traveled. In particular, ask the user for the following:]{style="color: var(--ic-brand-font-color-dark); font-family: inherit; font-size: 1rem;"}

-   their first name (or their full name) (String),
-   the price per gallon of gasoline paid at the time of the last fill-up (double),
-   the total amount paid for the fill-up (double),
-   an initial odometer reading (int),
-   a final odometer reading (int)

After inputting these values, compute the total miles driven, the number of gallons of gas used (total amount for fill-up / price per gallon), and the miles per gallon that the car achieved (total miles / number of gallons). Note that the number of gallons and miles per gallon will both be doubles. Print this information using System.out.println (and printf) statements. Below is a sample of the input and the output when running this program:

``` {style="padding-left: 40px;"}
Enter your name: John
Enter price per gallon: 1.99
Enter total price for fill up: 12.84
Enter initial odometer value: 51384
Enter final odometer value: 51577 

John, you drove 193 miles using 6 gallons with an mpg 32.2
```

Write this program (make sure you comment the code as you write it). When you have your program written, save and compile it. If it does not compile, fix your syntax errors. Once it does compile, run it on the above input to see if you get the same output. If you get incorrect output, look through your code and try to fix whatever logical errors you might have.

The output is not particularly readable. Let\'s force the output to look nicer in two ways. First, we will output the number of gallons used as an int. Do this by changing your numberOfGallons variable (whatever you call it) to an int and casting the value you compute for this variable to an int, similar to how we did this with dollarAmount in the previous program. Second, then change the System.out.println (and printf) statement to format the mpg value using your printf with format of ##.#. If you have forgotten how to do this, check lecture 4 notes. Copy and paste your output as comments below your code.

## **Submission**

Submit your **[Assignment1_2.java]{style="color: var(--ic-brand-font-color-dark); font-family: inherit; font-size: 1rem;"}** file through Canvas.

Remember to always [Make Sure That You Submitted The Correct File(s) For Your Homework!](../../pages/course_orientation/how-to-make-sure-that-you-submitted-the-correct-file-s-for-your-homework.md "How To Make Sure That You Submitted The Correct File(s) For Your Homework")
## **Grading Criteria**

This assignment is worth 50 points. Your work will be graded using the attached rubric.

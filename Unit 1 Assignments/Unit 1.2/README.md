# Unit 1.2 Assignment: VariablePractice

## Introduction

This assignment is supposed to give you some hands-on practice using creating/modifying in Java. Before starting this assignment you should be familiar with the following topics:
- Purpose of variables in computer science
- CamelCase Style
- Different Primitive and Reference types
- How to create/modify variables

One of my expectations that I have is that you will look up information that you don't know yet. Some assignments include information that you haven't learned yet. This was done on purpose. Take the time to do your research on them and experiment with them.

**Be very cautious about using AI. It is a powerful tool, but it can lead to blindly copying and pasting directly into code. I ask that if you use AI, prompt it with questions, not commands.**

## Install Instructions

TODO: Write the instructions to install this folder

## Assignment Instructions

Open the VariablePractice.java file and read through the comments. This is where all your code will go. DO NOT MODIFY VariablePracticeTester.java. You will need to create/modify 4 variables based on the description of each section. Let's take a look at the first section:

```java
// Section 1: Look at the README for instructions

System.out.println(myInteger);
System.out.println(myDouble);
System.out.println(myState);
System.out.println(myOutput);
```

In between the comment and the System.out.printlns, create 4 variables (1 integer, 1 double, 1 boolean, 1 string). The values of these variables are: 5, PI to 2 decimal points, false, and "First output".

In the second secton, modify the original 4 variables to hold 71, the new value of myInteger divided by the original value of myDouble to two decimal places (not rounded), true, and "Second output".

In the third section, modify the same variables to: the biggest integer value in Java, the biggest double value in Java, false, and Section 1 string variable + Section 2 string variable. How do you find the biggest integer and double value? How do you do string addition?

## How to check your work?

In your terminal run the following command to see what your output is:

```bash
java VariablePractice.java
```

You can use this to double-check your println statements. If you want to compare your program with answer.txt, you can do that by running the following commands:

```bash
java VariablePractice.java > output.txt
java VariablePracticeTester.java
```

If the output is: "Files are identical.", then you have completed the assignment. If there is a mistake in your program, then it will tell you which line number the program found the mistake at. This ONLY works if you haven't modified the code in PrintPracticeTester.java or changed the answers in answers.txt


## Think you found a bug or a typo?

Please send me an email explaining where you believe you have found either a typo or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.


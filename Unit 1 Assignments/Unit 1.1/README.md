# Unit 1.1 Assignment: PrintPractice

## Introduction

This assignment is suppose to give you some hands-on practice using printlns in Java. Before starting this assignment you should be familiar with the following topics:
- Creating a class in Java 
- Main method in Java 
- System.out.printlns
- Comments
- Understanding the basic syntax

One of my expectations that I have is that you will look up information that you don't know yet. For example, we haven't talked about escape sequences, yet this assignment has you using them. This was done on purpose. Take the time to do your own research on them and do some experimenting.

## Install instructions

TODO: Write the instructions to install this folder

## Assignment Instructions

Open the PrintPractice.java file and read through the comments. This is where all your code will go. DO NOT MODIFY PrintPracticeTester.java. Below each of the comments, write ONE println statement that outputs the comment to the terminal. Let's take a look at the first example:

```java
// Hello World
System.out.println("Hello World")
```

Here we can see that comment wants us to print out "Hello World" (without the double quotes). If you are ever confused on what exactly you should be printing, I have given you a file named answer.txt. You may look at the file, but DO NOT modify this. This file is the exact output you should be getting after all the printlns in your program. The goal of the assignment is to get your println statements to match exactly what answer.txt holds.

## How to check your work?

In your terminal run the following command to see what your output is:

```bash
java PrintPractice.java
```

You can use this to double check your println statements with the comments that I have provided. If you want to compare your program with answer.txt, you can do that by running the following commands:

```bash
java PrintPractice.java > output.txt
java PrintPracticeTester.java
```

If the output is: "Files are identical.", then you have completed the asssignment. If there is a mistake in your program, then it will tell you which line number the program found the mistake at.
This ONLY works if you haven't modify the code in PrintPracticeTester.java or changed the answers in answers.txt

## Think you found a bug or a typo?

Please send me an email explainig where you believe you have found either a type or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.

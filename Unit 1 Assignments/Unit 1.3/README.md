# Unit 1.3 Assignment: ArithmeticPractice

## Introduction

This assignment is suppose to give you some hands-on practice using arithmetic operations in Java. Before starting this assignment you should be familiar with the following topics:
- Different Arithmetic Operations
- Truncating
- Compound Assignment Operators

One of my expectations that I have is that you will look up information that you don't know yet. Some assignments include information that you haven't learned yet. This was done on purpose. Take the time to do your own research on them and do some experimenting.

**Be very caution to use AI. It is a powerful tool, but it can lead to blindly copying and pasting directly into code. I ask that if you use AI, to prompt it with questions, not commands.**

## Install instructions

TODO: Write the instructions to install this folder

## Assignment Instructions

Open the ArithmeticPractice.java file and read through the comments. This is where all your code will go. DO NOT MODIFY ArithmeticTester.java. The following assignment is based on the MIT OpenCourseWare Classical Mechanics Course. If you have taken or are taking AP Physics, this problem might seem familar to you. You do NOT need to know physics in order to complete this assignment.

[Link to the MIT page](https://ocw.mit.edu/courses/8-01sc-classical-mechanics-fall-2016/pages/week-1-kinematics/ps-1-2-shooting-the-apple/)

Read and watch the youtube video provided. You will need to write code that will solve for specific items from the problem given some constants. In the youtube video, you were given equations to solve for the coordinates of the apple and the bullet at a specific time, launch angle, and time of impact. This assignment is simple: use Java to solve the equations using the given constants. You will need to use cosines, sines, etc. How do we implement trig functions in Java? - Keep everything in radians.

On the bottom of the the Java file, there is a section labeled "Outputs". In order to check your work you will need to print out the answers in the following format:

```bash
X-coordinate of the apple: __________ meters
Y-coordinate of the apple: __________ meters
X-coordinate of the bullet: __________ meters
Y-coordinate of the bullet: __________ meters
Theta: __________ radians
Time of contact: __________ seconds
```

How do we print out string literals and varaibles using one System.out.println()? Look into string additon (string concatenation).

Obviously, you could solve the equations on your own using a calculator and then just hard code the numbers. The point of this assignment is to have Java handle the calculations on its own. Let Java be your calculator. Other than the Constants, you shouldn't need to hard-code numbers directly into the program. Only use the variables given.

## How to check your work?

In your terminal run the following command to see what your output is:

```bash
java ArithmeticPractice.java
```

You can use this to double check your println statements. If you want to compare your program with answer.txt, you can do that by running the following commands:

```bash
java ArithmeticPractice.java > output.txt
java ArithmeticTester.java
```

If the output is: "Files are identical.", then you have completed the asssignment. If there is a mistake in your program, then it will tell you which line number the program found the mistake at.
This ONLY works if you haven't modify the code in ArithmeticTester.java or changed the answers in answer.txt

## Think you found a bug or a typo?

Please send me an email explaining where you believe you have found either a typo or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.

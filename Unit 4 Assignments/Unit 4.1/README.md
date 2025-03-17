# Unit 4.1 Assignment: While

## Introduction

This assignment is supposed to give you some hands-on practice creating your methods in a class and solving problems using while loops. Before starting this assignment you should be familiar with the following topics:
- What is iteration?
- Creating While Loops

One of my expectations is that you will look up information that you don't know yet. Some assignments include information that you haven't learned yet. This was done on purpose. Take the time to do your research on them and experiment with them.

**Be very cautious about using AI. It is a powerful tool, but it can lead to blindly copying and pasting directly into code. I ask that if you use AI, prompt it with questions, not commands.**

## Install Instructions

TODO: Write the instructions to install this folder

## Assignment Instructions

Open the While.java file and read through the comments. This is where all your code will go. DO NOT MODIFY WhileTester.java. In this assignment, you must write methods to solve the problems listed below. These problems involve writing some while loops. You will get a brief description of each of the methods and you'll have to use techniques that you learned to complete them. You may ONLY use while loops, do NOT use for loops. The methods are:

**nCopies** - You are given a string and a non-negative integer n, and return a string that is n-copies of the original string.

**nCopiesTwist** - This method is the same as the 'nCopies' function, but with a little twist. Instead of returning n-copies of the original string, you want to return n-copies of the first 3 characters of the original string. If the string has a length less than 3, just return n-copies of the front.

**countZ** - You will want to count the number of "z" in the given string.

**countZZ** - You will want to count the number of "zz" in the given string. Overlapping is allowed (this means that "zzz" contains 2 "zz").

**evenCharacters** - You are given a string, you will want to return a new string made of every other character starting with the first character. "Hello" will return "Hlo".

**stringRemoveX** - You are given a string, and you will want to return a new string where all the "x" have been removed. However, if the "x" is either the first or the last character of the string, you should keep it and not remove it.

The comments should tell you everything you need to know. You know the name of the method, what the parameters should be, and what the method should return. You will need to create 6 methods, each with a description above. I suggest you write your methods right below the comments for better organization.

## How to check your work?

To check to see if your code is correct, run the following commands in your terminal:

```bash
javac While.java
java WhileTester.java
```

If you see "Code looks good!" in the output, then you have completed the assignment.

## Think you found a bug or a typo?

Please send me an email explaining where you believe you have found either a typo or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.

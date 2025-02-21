# Unit 2.4 Assignment: StringMethods

## Introduction

This assignment is supposed to give you some hands-on practice creating your methods in a class and using common string methods. Before starting this assignment you should be familiar with the following topics:
- How to create methods?
- APCSA String methods
- APCSA Math methods

One of my expectations is that you will look up information that you don't know yet. Some assignments include information that you haven't learned yet. This was done on purpose. Take the time to do your research on them and experiment with them.

**Be very cautious about using AI. It is a powerful tool, but it can lead to blindly copying and pasting directly into code. I ask that if you use AI, prompt it with questions, not commands.**

## Install Instructions

TODO: Write the instructions to install this folder

## Assignment Instructions

Open the StringMethods.java file and read through the comments. This is where all your code will go. DO NOT MODIFY StringTester.java. In this assignment, you must write methods that will return a modified version of the original string. You will get a brief description of each of the methods and you'll have to use the string methods that you learned to complete them. The methods are:

**noStartingLetters** - given two strings, you will want to return their concatenation, except that you will want to get rid of the first character of each of the strings beforehand. All strings tested will have a length of at least 1.

**chopOffEnds** - given a string, you want to return the string without the first and last characters. All strings tested will have a length of at least 2.

**spliceMiddleTwo** - given a string with an even length, return the string's middle two characters. All strings tested will have a length of at least 2.

**rotateLeftTwo** - given a string, return the same string rotated left twice, so the first two characters are moved to the end. All strings tested will have a length of at least 2.

**rotateRightTwo** - given a string, return the same string rotated right twice, so the last two characters are moved to the front. All strings tested will have a length of at least 2.

**whereIsWaldo** - given a string, return the index of the first "waldo" sighting in the word. If "waldo" is not found in the word, return -1 for the position.

**generateRandomNumber** - given a minimum and maximum, you want to return a random number in between the minimum and maximum (inclusive).

This comment should tell you everything you need to know. You know the name of the method, what the parameters should be, and what the method should return. You will need to create 6 methods, each with a description above. I suggest you write your methods right below the comments for better organization.

## How to check your work?

To check to see if your code is correct, run the following commands in your terminal:

```bash
javac StringMethods.java
java StringTester.java
```

If you see "Code looks good!" in the output, then you have completed the assignment.

## Think you found a bug or a typo?

Please send me an email explaining where you believe you have found either a typo or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.

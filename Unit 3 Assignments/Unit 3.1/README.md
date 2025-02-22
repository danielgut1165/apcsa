# Unit 3.1 Assignment: Logic1

## Introduction

This assignment is supposed to give you some hands-on practice creating your methods in a class and solving more complex problems using Java's control flow. Before starting this assignment you should be familiar with the following topics:
- How to create methods?
- APCSA String methods
- If-statements

One of my expectations is that you will look up information that you don't know yet. Some assignments include information that you haven't learned yet. This was done on purpose. Take the time to do your research on them and experiment with them.

**Be very cautious about using AI. It is a powerful tool, but it can lead to blindly copying and pasting directly into code. I ask that if you use AI, prompt it with questions, not commands.**

## Install Instructions

TODO: Write the instructions to install this folder

## Assignment Instructions

Open the Logic1.java file and read through the comments. This is where all your code will go. DO NOT MODIFY Logic1Tester.java. In this assignment, you must write methods that will solve slightly more complex problems than before. These problems involve writing some if-statements to add control flow in your programs. You will get a brief description of each of the methods and you'll have to use methods that you learned to complete them. The methods are:

**buzzStrings** - given a string, if the string starts with an "f", you should return "Fizz". If the string ends with a "b", you should return "Buzz". If both of the conditions are true, then return "FizzBuzz". If none of the conditions are true, then return the original string.

**sameLastDigit** - given three integers, return true if two or more of them have the same rightmost digit (the one's place). All integers tested are non-negative.

**sixIsMyFavorite** - I love the number 6, so we're going to write a method specifically for it. Given two numbers, return true if either one is a six, or if either the sum or the difference of the two numbers is 6.

**slotMachines** - given three numbers, each representing a slot in a casino. Each one of these numbers could be one of three numbers (0, 1, 2) labeled num1, num2, and num3 respectively. If they each hold the value 2, then return 10. Otherwise, if they're all the same, then return 5. Otherwise, if num1 is different than both num2 and num3, then return 1. If none of the conditions are true, then return 0.

**shortLongShort** - given two strings, return a new string in the form short+long+short, with the shorter string on the outside ends of the longer string. All strings tested will be different lengths.

**sameEnds** - given two strings, concatenate them together and return the result. However, if the concatenated strings create a "double character", then get rid of one of the characters. Example: "greg" + "greg" -> "grereg"

The comments should tell you everything you need to know. You know the name of the method, what the parameters should be, and what the method should return. You will need to create 6 methods, each with a description above. I suggest you write your methods right below the comments for better organization.

## How to check your work?

To check to see if your code is correct, run the following commands in your terminal:

```bash
javac Logic1.java
java Logic1Tester.java
```

If you see "Code looks good!" in the output, then you have completed the assignment.

## Think you found a bug or a typo?

Please send me an email explaining where you believe you have found either a typo or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.

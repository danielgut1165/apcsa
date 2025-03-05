# Unit 3.2 Assignment: Logic2

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

Open the Logic2.java file and read through the comments. This is where all your code will go. DO NOT MODIFY Logic2Tester.java. In this assignment, you must write methods that will solve slightly more complex problems than before. These problems involve writing some if-statements to add control flow in your programs. You will get a brief description of each of the methods and you'll have to use techniques that you learned to complete them. The methods are:

**speedingTicket** - You are an officer of the law and you trying to determine what size ticket you should give to the people you pull over. Return 0 for no ticket, return 1 for a small ticket, and return 2 for a big ticket. For the people you pull over, if their speed is between 61 and 80 inclusive, you should give them a small ticket. If their speed is 81 or more, give them a big ticket. However, if you check their license and you see that it is their birthday, then you can give the driver more leeway (their speed can be 5 higher in all cases).

**partyTime** - You are a party critic that judges harshly to all parties you go to. If the party is bad, you return a 0. If the party is good, you return a 1. If the party is great, then return 2. A party is good if the number of teas and candy is at least 5. If either the tea or the candy is at least double the amount of the other one, then the party is great. But if neither of these conditions are met, then the party is bad.

**adding2For3** - You are given 3 numbers, return true if there is a combination of adding two of the three numbers that will give you the third, return false if otherwise.

**sharingIsCaring** - Given two numbers, each number is a double-digit number. Return true if there is the same digit in both numbers. Example: 23 and 12 both share the digit 2, so return true. Return false otherwise.

**abFronts** - Given a string, return the same string but without the first two letters. However, if the first character is an "a", then keep it. If the second character is a "b", then keep it. Example: "away" -> "aay" (keep the first "a" because it is the first letter).

**makingDuplicates** - Given a string, you want to return a new string made of 3 copies of the first 2 characters. If the original string is less than 2 in length, then you may use whatever is there to make the duplicates.

The comments should tell you everything you need to know. You know the name of the method, what the parameters should be, and what the method should return. You will need to create 6 methods, each with a description above. I suggest you write your methods right below the comments for better organization.

## How to check your work?

To check to see if your code is correct, run the following commands in your terminal:

```bash
javac Logic2.java
java Logic2Tester.java
```

If you see "Code looks good!" in the output, then you have completed the assignment.

## Think you found a bug or a typo?

Please send me an email explaining where you believe you have found either a typo or a bug in the program. You can email me at daniel.tutors12@gmail.com. Try your best to explain the bug/typo to me and provide screenshots of the code/output if you can.

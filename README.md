Author: Bryce Di Geronimo

CIS 313, Intermediate Data Structures
Fall 2018

CIS 313 Lab 1

This lab involves implementing linear data structures - stacks and queues.

Overview

In isPalindrome, iterate over the characters in the line, and process with Stack and Queue.
Use a Stack and Queue to determine if a string is a palindrome.

Input Description

The input will be a text file, for example inSample.txt below will be provided. The first line will
contain an integer N, which is the number of lines to follow. Each of the N lines contains a string
of numbers not separated by spaces.

For each line, use your stack and queue to determine if the input represents a palindrome.
The input strings are made up of non-negative numbers of different sizes.

5
30325
1133311
613373316
44
56

Output Description

For each line of the input, if the string of numbers reads the same way forward as backwards output
”This is a Palindrome.”, otherwise output: ”Not a Palindrome.” For example, using the sample
input above, your program should output:

Not a Palindrome.
This is a Palindrome.
This is a Palindrome.
This is a Palindrome.
Not a Palindrome.

Extra Credit:

To receive points for the extra credit you must implement a queue using two stacks:

	• Create a new public class file called TwoStackQueue, which has two stacks as member variables
	• The signature of this class should be the same as the Queue class.
		– It should have the same public methods
		– Each public method should match in argument types (argument number, etc), and return
		type.
		– Amortized complexity O(1) for each operation.
	• create an additional public class file called EC
		– All the same functionality as lab1.java
		– use a TwoStackQueue instead of a Queue in the isPalindrome method
	• Note that EC.java will have a main method, while TwoStackQueue.java will not

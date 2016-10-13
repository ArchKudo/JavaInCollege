# JavaInCollege

## 1. Introduction to Java
	1. Write a Java program to print Hello World.(See Programs/BriefIntroduction.java)
	2. Write a Java program to print SquareRoot of a given number.(See Programs/GetSquareroot.java)
	3. Write a Java program to print commandline arguments.(See Programs/CommandLineArguments.java)
	4. Write a Java program to get area of a room using a class.(See Programs/CalculateRoomArea.java)
	5. Write a Java program to check whether a number is +ve, -ve or 0.(See Programs/CheckNumberSign.java)

## 2. Decision making in Java(if-else, switch)
	1. Write a Java program for finding Grade using switch statement.(See Programs/FindGrade.java)
	2. Write a Java program for recognising vowels using switch statement.(See Programs/RecogniseVowels.java)
	3. Write a Java program for finding maximum of 3 nos using if-else statement.(See Programs/GreatestOfThree.java)
	4. Write a Java program to check whether leap year or not.(See Programs/WhetherLeapYear.java)
	5. Write a Java program to find how many even/odd numbers are present in a given array.(See Programs/EvenOddInArray.java)

## 3. Loops and Control statements in java
	1. Write a Java program to check whether a number is a perfect square or not.(See Programs/WhetherPerfectSquare.java)
	2. Write a Java program to draw the following patterns:(See Programs/DrawPatterns.java)
		1.	0
			10
			010
			1010
		2.	*****
			 ****
			  ***
			   **
				*
	3. Write a Java program to check whether a given number is prime or not.(See Programs/WhetherPrime.java)
	4. Write a Java program to find the reverse of a given number.(See Programs/ReverseInt.java)

## 4. Class implementation in Java
	1. 

## 5. Array Implementation in Java
	1. Write a Java program to sort an array of integers in ascending order using bubblesort.
	2. Write a Java program to perform matrix multiplication.
## 6. Strings in Java
	1. Write a Java program to arrange city names in alphabetical order using strings.
	2. Write a Java program to demonstrate various StringBuffer methods.
## 7. Inheritance  in Java
	1. Write a Java program to implement the following inheritance:
		1.       +-----+
			 |Room |
			 +--+--+
			    |
			    v
			+---+---+
			|Bedroom|
			+-------+
		And write methods to calculate the area and volume of the rooms.
		
		2.	+-----+
			|Fruit|
			+--+--+
			   |
			   v
			+--+--+
			|Mango|
			+-----+
		And write methods to calculate the total cost paid for mangoes bought.

## 8. Interface in Java
	1. Write a Java program to implement the following multiple inheritance using interfaces:
		1. 	+-------+
			|Student|
			+---+---+
			    |
			    |
			    v
			 +--+-+      +------+
			 |Test|      |Sports|
			 +--+-+      +------+
			    |	        |
			    |	        |
		            |           |
			    +<----------+
		            |
			    v
			 +--+---+
			 |Result|
			 +------+
		Display the final result of students.
## 9. Multi-threading in Java
	1. Write a Java program to demonstrate run methods in thread class.
	2. Write a Java program to create two threads to:
		1. Calculate the sum of first five integers.
		2. Calculate the factorial of first five integers.

## 10. Applets in Java
	1. Create an applet to display your name.
	2. Write a Java program to demonstrate lifecycle of an applet.

## FAQ

1. Directory Structure?  
	```
	.
	├── bin  
	├── Programs  
	│   ├── ACertainLie.java  
	│   ├── BriefIntroductionAlternative.java  
	│   ├── BriefIntroduction.java  
	│   ├── CalculateRoomArea.java  
	│   ├── CheckNumberSign.java  
	│   ├── CommandLineArguments.java  
	│   ├── DrawPatterns.java  
	│   ├── EvenOddInArray.java  
	│   ├── FindGrade.java  
	│   ├── GetSquarerootAlternative.java  
	│   ├── GetSquareroot.java  
	│   ├── GreatestOfThree.java  
	│   ├── RecogniseVowels.java  
	│   ├── ReverseInt.java  
	│   ├── WhetherLeapYear.java  
	│   ├── WhetherPerfectSquare.java  
	│   └── WhetherPrime.java  
	└── README.md  

	
	```
2. How to compile?  
	(Assuming you have above directory structure)  

	1. For Windows:  
	```
	C:\> cd Projects\Java\JavaInCollege\Programs\  
	C:\Projects\Java\JavaInCollege\Programs\> javac -d ..\bin [ProgramName].java  
	C:\Projects\Java\JavaInCollege\Programs\> java -cp ..\bin [ProgramName]  
	```
	2. For *nix:  
	```
	$ cd Project/Java/JavaInCollege/Programs   
	$ javac -d ../bin [ProgramName].java  
	$ java -cp ../bin [ProgramName]
	```

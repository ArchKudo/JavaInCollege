/**
 * @brief Write a Java program for recognising vowels using switch statement
 * @note Practical No. 002
 * @author ArchKudo
 */

import java.util.Scanner;
class RecogniseVowels {
	public static void main(String[] args) {
		String givenSentence;
		Scanner getInput = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		givenSentence = getInput.nextLine();
		/* String.length() to get length of string */
		for (int i = 0; i < givenSentence.length(); i++) {
			switch (givenSentence.charAt(i)) {
			/* Check for Vowels */
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				/* String.charAt(int index) to return the char value at the specified index */
				/* Integer.toString(int) to convert a Integer to a String */
				System.out.println("Found vowel " + givenSentence.charAt(i) + " at " + Integer.toString(i+1));
				break;

			/* Does nothing really */
			default:
				break;
			}
		}
	}
}

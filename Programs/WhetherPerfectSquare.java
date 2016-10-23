/**
 * @brief Write a Java program to check whether a number is a perfect square or not.
 * @note Practical No. 003
 */
import java.lang.Math;
import java.util.Scanner;

class WhetherPerfectSquare {
		/**
	 * Check's whether a given number is a square or not using for loops.
	 * @param  squareNumber The number to check.
	 * @return              1 if number is perfect square, 0 if it is not.
	 */
	public static int checkSquareUsingForLoop(int squareNumber) {
		for (int i = 0; i < squareNumber; i++) {
			int calcSquare = i * i;
			if (calcSquare == squareNumber) {
				return 1; // True
			}
		}
		return 0; // False
	}
	/**
	 * Check's whether a given number is a square or not using Math.sqrt().
	 * @param  squareNumber The number to check.
	 * @return              1 if number is perfect square, 0 if it is not.
	 */
	public static int checkSquareUsingSqrt(int squareNumber) {
		int squareRoot = (int) Math.sqrt(squareNumber); // Cast double to int (Strip the fractional part)
		if (squareRoot == (squareNumber / squareRoot)) {
			return 1;
		} else {
			return 0;
		}
	}
	public static void main(String[] args) {
		int givenNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		givenNumber = sc.nextInt();
		if (checkSquareUsingForLoop(givenNumber) == 1) {
			System.out.println("The given number " + givenNumber + " is a perfect square.");
		} else {
			System.out.println("The given number " + givenNumber + " is not a perfect square.");
		}

	}
}

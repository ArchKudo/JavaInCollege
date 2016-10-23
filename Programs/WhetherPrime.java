/**
 * @brief Write a Java program to check whether a given number is prime or not.
 * @note Practical No. 003
 */
import java.lang.Math;
import java.util.Scanner;
class WhetherPrime {
	/**
	 * Checks whether a given number is prime or composite.
	 * @param  number The number to check.
	 * @return        0 if the number composite; 1 if the number is prime.
	 */
	public static int isPrime(int number) {
		int numberRoot = (int) Math.sqrt(number);
		for (int i = 2; i < numberRoot; i++) {
			if (number % i == 0) {
				return 0;
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		int givenNumber;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		givenNumber = sc.nextInt();
		if (isPrime(givenNumber) == 1) {
			System.out.println("The given number " + givenNumber + " is prime.");
		} else {
			System.out.println("The given number " + givenNumber + " is composite.");
		}
	}
}

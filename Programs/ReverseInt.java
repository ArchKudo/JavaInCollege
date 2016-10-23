/**
 * @brief  Write a Java program to find the reverse of a given number.
 * @note Practical No. 003
 */
import java.util.Scanner;
class ReverseInt {
	public static int reverseNumber(int number) {
		int reverse = 0, remainder = 0;
		while (number != 0) {
			reverse *= 10;
			remainder = number % 10;
			reverse += remainder;
			number /= 10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		int givenNumber, reverse;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		givenNumber = sc.nextInt();
		reverse = reverseNumber(givenNumber);
		System.out.println("The given number " + givenNumber + " when reversed is " + reverse);
	}
}

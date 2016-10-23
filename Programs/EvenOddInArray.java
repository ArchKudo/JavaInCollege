/**
 * @brief Write a Java program to find how many even/odd numbers are present in a given array.
 * @note Practical No. 002
 */
import java.util.Scanner;

class EvenOddInArray {
	/**
	 * To get an array of integers using Scanner Class.
	 * @return Returns an array of int
	 */
	public static int [] fetchArray() {
		System.out.println("Enter number of inputs:");
		Scanner sc = new Scanner(System.in);
		int countOfNumbers = sc.nextInt();
		sc.nextLine();
		int [] numberArray = new int[countOfNumbers];
		System.out.println("Enter the numbers:");
		String scannedArray = sc.nextLine();
		Scanner numScanner = new Scanner(scannedArray);
		for (int i = 0; i < countOfNumbers; i++) {
			if (numScanner.hasNextInt()) {
				numberArray[i] = numScanner.nextInt();
			} else {
				System.out.println("Insufficient number of inputs!");
				break;
			}
		}
		return numberArray;
	}
	/**
	 * Counts even numbers in an array.
	 * @param  numberArray Count even numbers in this array
	 * @return             Count of even numbers in an array
	 */
	public static int calculateNumberOfEven(int [] numberArray) {
		int countOfEven = 0;
		for (int number : numberArray) {
			if ((number % 2) == 0) {
				countOfEven += 1;
			}
		}
		return countOfEven;
	}
	/**
	 * Count odd numbers in an array.
	 * @param  numberArray Count odd numbers in this array
	 * @return             Count of odd numbers in an array
	 */
	public static int calculateNumberOfOdd(int [] numberArray) {
		int countOfOdd = 0;
		for (int number : numberArray) {
			if ((number % 2) != 0) {
				countOfOdd += 1;
			}
		}
		return countOfOdd;
	}

	public static void main(String[] args) {
		int [] numberArray = fetchArray();
		for (int i : numberArray) {
			System.out.println(i + " ");
		}
		int countOfEven = calculateNumberOfEven(numberArray);
		int countOfOdd = calculateNumberOfOdd(numberArray);

		System.out.printf("The count of Odd numbers:%d\nThe count of Even numbers: %d\n", countOfOdd, countOfEven);

	}
}

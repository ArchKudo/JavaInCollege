/**
 * @brief Write a Java program to sort an array of integers in ascending order using bubblesort.
 * @note Practical No. 005
 */

import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Usage: java BubbleSort [SizeOfArray] [ArrayElements]");
			System.exit(0);
		}

		int sizeOfArray = Integer.parseInt(args[0]);
		int[] numbers = new int[sizeOfArray];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(args[i + 1]);
		}

		bubbleSort(numbers);
	}

	// BubbleSort
	public static void bubbleSort(int[] numbers) {
		System.out.printf("Unsorted array: %s\n", Arrays.toString(numbers));

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length; j++) {
				if (numbers[j] < numbers[j - 1]) {
					swap(numbers, j, j - 1);
				}
			}
		}

		System.out.printf("Sorted Array:%s\n", Arrays.toString(numbers));
	}

	// Swap numbers
	public static void swap(int[] array, int from, int to) {
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}

}

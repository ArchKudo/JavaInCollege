/**
 * @brief Write a Java program to create two threads to:
 *        	1. Calculate the sum of first five integers.
 *         	2. Calculate the factorial of first five integers.
 * @note Practical No. 009
 */
import java.io.*;

class SumOfFive extends Thread {
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum += i;
			System.out.println("Sum:" + sum);
		}
	}
}

class FactFive extends Thread {
	public void run() {
		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
			System.out.println("Fact:" + fact);
		}
		try {
			sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TwoThreads {
	public static void main(String[] args) throws IOException {
		SumOfFive sumOfFiveThread = new SumOfFive();
		FactFive factFiveThread = new FactFive();
		sumOfFiveThread.start();
		factFiveThread.start();
	}
}

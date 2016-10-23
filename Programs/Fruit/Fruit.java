/**
 * @brief Write a Java program to implement the following inheritance:
 * 			+-----+
 *          |Fruit|
 *          +--+--+
 *             |
 *             v
 *          +--+--+
 *          |Mango|
 *          +-----+
 *      And write methods to calculate the total cost paid for mangoes bought.
 * @note Practical No. 007
 */

import java.util.Scanner;

public abstract class Fruit {
	public float unitPrice;
	public int quantity;

	public float totalCost() {
		return quantity * unitPrice;
	}

	public void readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price(per kg.):");
		unitPrice = sc.nextFloat();
		System.out.println("Enter Amount:");
		quantity = sc.nextInt();
	}

	public void displayData() {
		System.out.printf("Unit Price: %.03f\nQuantity: %d\nTotal Cost:%.03f\n",
		                  unitPrice, quantity, totalCost());

	}

}

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

abstract class Fruit {
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

class Mango extends Fruit {
	public static String name, taste;

	public Mango() {}

	public Mango(String name, String taste) {
		this.name = name;
		this.taste = taste;
	}


	public void makeJuice() {
		System.out.println("Peel the fruit,\n" +
		                   "Crush the fruit slices to make the juice.");

	}

	@Override
	public void displayData() {
		System.out.printf("Unit Price: %.03f\nQuantity: %d\nTotal Cost:%.03f\n",
		                  unitPrice, quantity, totalCost());
		System.out.printf("Name: %s\nTaste: %s\n", name, taste);

	}

}

class FruitMain {
	public static void main(String[] args) {
		Mango malgovanMango = new Mango("Malgova", "Sweet");
		malgovanMango.readData();
		malgovanMango.displayData();
		malgovanMango.makeJuice();
	}
}


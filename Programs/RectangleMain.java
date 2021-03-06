/**
 * @brief Write a Java program to declare a class called Rectangle with following members:
 *        	1. Variables:
 *          	* Integer height
 *           	* Integer length
 *          2. Methods:
 *          	* Default Constructor
 *           	* Parameterized Constructor
 *            	* setData()
 *             	* setData1(int height)
 *              * setData2(int height, int length)
 *              * getArea()
 *              * print()
 * @note Practical No. 004
 */

import java.util.Scanner;

class Rectangle {
	int height = 0;
	int breadth = 0;

	public Rectangle() { }

	public Rectangle(int height, int breadth) {
		this.height = height;
		this.breadth = breadth;
	}

	// setData1
	public void setDataHeight(int height) {
		this.height = height;
	}

	// setData2
	public void setData(int height, int breadth) {
		this.height = height;
		this.breadth = breadth;
	}

	//
	public int getArea() {
		return height * breadth;
	}

	// print
	public void printDimensions() {
		System.out.printf("The height of the rectangle is: %d\nThe breadth of the rectangle is: %d\nThe area of the rectangle is: %d\n", height, breadth, getArea());
	}
}


class RectangleMain {
	public static void main(String[] args) {
		int height, breadth, area;
		Rectangle rectangle = new Rectangle();

		System.out.println("Enter Height: ");

		Scanner sc = new Scanner(System.in);
		height = sc.nextInt();

		System.out.println("Enter Width:");
		breadth = sc.nextInt();

		rectangle.setData(height, breadth);
		area = rectangle.getArea();

		rectangle.printDimensions();
	}
}

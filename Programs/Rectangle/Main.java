import java.util.Scanner;

class Main {
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

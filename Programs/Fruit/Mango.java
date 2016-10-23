public class Mango extends Fruit {
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

public class Main {
	public static void main(String[] args) {
		Bank richCustomer = new Bank(12345, "Ritchie Rich", "221B Baker Street", 500000, 911);
		richCustomer.displayData();
		richCustomer.withdraw(1000);
		richCustomer.deposit(1000000);
		richCustomer.displayData();
	}
}

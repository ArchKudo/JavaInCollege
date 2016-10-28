/**
 * @brief Write a Java Program to create a class called Bank that has the following members:
 *        	1. Variables:
 *            	* Integer account
 *             	* String name
 *              * float balance
 *              * String address
 *              * int telephoneNo
 *
 *        	2. Methods:
 *        		* Parametrized Constructor to initialize all members,
 *            	eg: public Bank(int account, String name, float balance, String address, int telephoneNo)
 *             	* deposit(float amount)
 *              * deposit()
 *              * withdraw(float amount)
 *              * withdraw()
 *              * print()
 *
 * @note Practical No. 004
 */
import java.util.Scanner;
public class BankMain {
	public static void main(String[] args) {
		Bank richCustomer = new Bank(12345, "Ritchie Rich", "221B Baker Street", 500000, 911);
		richCustomer.displayData();
		richCustomer.withdraw(1000);
		richCustomer.deposit(1000000);
		richCustomer.displayData();
	}
}

class Bank {
	int accNo;
	String accName;
	String address;
	static int balance = 0;
	int telNo;

	public Bank() {}

	public Bank(int accNo,
	            String accName,
	            String address,
	            int balance,
	            int telNo) {
		this.accNo = accNo;
		this.accName = accName;
		this.address = address;
		this.balance = balance;
		this.telNo = telNo;
	}

	public void displayData() {
		System.out.printf("Account No.: %d\nAccount Name: %s\nAddress: %s\nBalance: %d\nTelephone No.: %d\n",
		                  accNo, accName, address, balance, telNo);
	}

	public static void deposit() {
		System.out.println("Enter Amount: ");
		Scanner sc = new Scanner(System.in);
		int increment = sc.nextInt();
		if (increment > 0) {
			balance += increment;
			System.out.println("Amount deposited: " + increment +
			                   "\nTotal Balance: " + balance);
		} else {
			System.out.println("Try Withdrawing...");
		}
	}

	public static void deposit(int increment) {
		if (increment > 0) {
			balance += increment;
			System.out.println("Amount deposited: " + increment +
			                   "\nTotal Balance: " + balance);
		} else {
			System.out.println("Try Withdrawing...");
		}

	}

	public static void withdraw() {
		System.out.println("Enter Amount: ");
		Scanner sc = new Scanner(System.in);
		int decrement = sc.nextInt();
		if (decrement > 0) {
			balance += decrement;
			System.out.println("Amount deposited: " + decrement +
			                   "\nTotal Balance: " + balance);
		} else {
			System.out.println("Try Depositing...");
		}
	}

	public static void withdraw(int decrement) {
		if (decrement > 0) {
			balance += decrement;
			System.out.println("Amount deposited: " + decrement +
			                   "\nTotal Balance: " + balance);
		} else {
			System.out.println("Try Depositing...");
		}
	}
}

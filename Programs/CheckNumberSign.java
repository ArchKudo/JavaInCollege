/**
 * @brief Write a Java program to check whether a number is +ve, -ve or 0.
 * @note Practical NO. 001
 * @author ArchKudo
 */
class CheckNumberSign {
	public static void main(String args[]) {
		String numberString = args[0];
		int number = Integer.parseInt(numberString); /* Convert String to Integer using parseInt() */
		if (number > 0) {
			System.out.println("The given number " + number + " is positive.");
		} else if (number < 0) {
			System.out.println("The given number " + number + " is negative.");
		} else {
			System.out.println("The given number " + number + " is zero.");
		}
	}
}
/**
 * @brief Write a Java program to check whether leap year or not.
 * @note Practical No. 002
 */
class WhetherLeapYear {
	public static void main(String[] args) {
		int givenYear = Integer.parseInt(args[0]); /* Convert a given String into an Integer */
		if (((givenYear % 4 == 0) && (givenYear % 100 != 0)) || (givenYear % 400 == 0)) {
			System.out.println("The given year " + givenYear + " is " + "a leap year.");
		} else {
			System.out.println("The given year " + givenYear + " is " + "not a leap year.");
		}
	}
}

/**
 * @brief Write a Java program to draw the following patterns:
 *		1.	0
 *			10
 *			010
 *			1010
 *		2.	*****
 *			 ****
 *			  ***
 *			   **
 *				*
 * @note Practical No. 003
 */
class DrawPatterns {
	/**
	 * Draws pattern One
	 * 1.	0
	 *		10
	 *		010
	 * 		1010
	 */
	public static void patternOne() {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= i; j++) {
				int element = (i + j) % 2;
				System.out.print(element + "");
			}
			System.out.println("");
		}
	}

	/**
	 * Draws pattern two:
	 *	2.	*****
	 *		 ****
	 *		  ***
	 *		   **
	 *			*
	 */
	public static void patternTwo() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5 - i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		System.out.println("Pattern One:");
		patternOne();
		System.out.println("Pattern Two:");
		patternTwo();
	}
}

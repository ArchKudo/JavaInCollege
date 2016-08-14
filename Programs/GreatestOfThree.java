class GreatestOfThree {
	public static void main(String[] args) {
		int numberOne = Integer.parseInt(args[0]),
			numberTwo = Integer.parseInt(args[1]),
			numberThree = Integer.parseInt(args[2]),
			greatestNumber = 0;

		if (numberOne > numberTwo) {
			if (numberOne > numberThree) {
				greatestNumber = numberOne;
			}
		} else if (numberTwo > numberOne) {
			if (numberTwo > numberThree) {
				greatestNumber = numberTwo;
			}
		} else {
			greatestNumber = numberThree;
		}
		System.out.println("The greatest of the three is " + greatestNumber + ".");
	}

}

class Result extends Test implements Sports {
	float totalMarks;

	public Result(int rollNo, float firstUTMarks, float secondUTMarks) {
		super(rollNo, firstUTMarks, secondUTMarks);
	}
	public void calculateMarks() {
		totalMarks = getTotal() + sportsMarks;
	}

	public void displayData() {
		displayRollNo();
		displayMarks();
		System.out.println("\nSports Marks: " + sportsMarks);
		System.out.println("Total Marks: " + totalMarks);
	}
}

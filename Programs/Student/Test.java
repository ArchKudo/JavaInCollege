public class Test extends Student {
	float firstUTMarks, secondUTMarks;

	public Test(int rollNo, float firstUTMarks, float secondUTMarks) {
		super(rollNo);
		this.firstUTMarks = firstUTMarks;
		this.secondUTMarks = secondUTMarks;
	}

	public void displayMarks() {
		System.out.printf("Marks in UT1: %.2f\nMarks in UT2: %.2f", firstUTMarks, secondUTMarks);
	}

	public float getTotal() {
		return firstUTMarks + secondUTMarks;
	}
}

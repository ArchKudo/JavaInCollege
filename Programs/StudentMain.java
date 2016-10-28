class Student {
	int rollNo;

	public Student() {}

	public Student(int rollNo) {
		this.rollNo = rollNo;
	}

	public void displayRollNo() {
		System.out.println("Roll No.: " + rollNo);
	}
}

class Test extends Student {
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

interface Sports {
	float sportsMarks = 6.0f;
}

class StudentMain {
	public static void main(String[] args) {
		Result scholarlyStudent = new Result(36, 100f, 100f);
		scholarlyStudent.calculateMarks();
		scholarlyStudent.displayData();
	}
}

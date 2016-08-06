/**
 * @brief 
 */
import java.util.Scanner; /* For Scanner Class */
class findGrade {
	public static void main(String args[]) {
		int marksObtained = 0, numberOfSubjects, averageOfMarks;

		System.out.println("Enter the number of subjects: ");
		Scanner getInfo = new Scanner(System.in);
		numberOfSubjects = getInfo.nextInt();
		getInfo.nextLine();

		System.out.println("Enter the marks: ");
		Scanner getSubjectMarks = new Scanner(getInfo.nextLine());
		for (int i = 0; i < numberOfSubjects; i++) {
			if (getSubjectMarks.hasNextInt()) {
				marksObtained += getSubjectMarks.nextInt();
			} else {
				System.out.println("Marks entered less than number of subjects.");
			}
		}

		averageOfMarks = marksObtained / numberOfSubjects;
		int averageQuotient = averageOfMarks / 10;

		switch (averageQuotient) {
			case 10:
				System.out.println("You got an O.");
				break;
			case 9:
				System.out.println("You got an A.");
				break;
			case 8:
				System.out.println("You got a B.");
				break;
			case 7:
				System.out.println("You got a C.");
				break;
			case 6:
				System.out.println("You got a D.");
				break;
			case 5:
				System.out.println("You got a P.");
				break;
			default: 
				System.out.println("Sorry, You got a F.");
				break;
		}
	}
}
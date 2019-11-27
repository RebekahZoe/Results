package Main;

public class Results {

	static int physicsGrade = 100;
	static int chemistryGrade = 100;
	static int biologyGrade = 100;
	static int totalMark = physicsGrade + chemistryGrade + biologyGrade;

	public static void main(String[] args) {
		displayResults();
		percentage();

	}

	public static void displayResults() {
		System.out.println("Your physics grade is: " + physicsGrade);
		System.out.println("Your chemistry grade is: " + chemistryGrade);
		System.out.println("Your biology grade is: " + biologyGrade);
		System.out.println("Your total mark is: " + totalMark);

	}

	public static void percentage() {
		double percentage = (totalMark * 100) / 450;
		System.out.println("Your overall percentage is: " + percentage + "%");
		passRate(percentage);
	}

	public static void passRate(double percent) {
		int failCount = 0;
		if (physicsGrade < 90) {
			failCount++;
		}
		if (chemistryGrade < 90) {
			failCount++;
		}
		if (biologyGrade < 90) {
			failCount++;
		}

		if (percent > 60 && physicsGrade > 90 && chemistryGrade > 90 && biologyGrade > 90) {
			System.out.println("Congratulations you have passed.");
		} else if (failCount == 1) {
			System.out.println("Unfortunately you have failed due to failing one subject.");
		} else if (failCount == 2) {
			System.out.println("Unfortunately you have failed due to failing two subjects.");
		} else if (failCount == 3) {
			System.out.println("Unfortunately you have failed due to failing all subjects.");
		}
	}

}

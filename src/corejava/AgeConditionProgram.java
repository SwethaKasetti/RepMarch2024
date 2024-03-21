package corejava;

public class AgeConditionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 99;

		if (age <= 2) {
			System.out.println("Infant");
		} else if (age > 2 && age <= 12) {
			System.out.println("Child");
		} else if (age > 12 && age <= 25) {
			System.out.println("Youth");
		} else if (age > 25 && age <= 59) {
			System.out.println("Adults");
		} else if (age > 59 && age <= 100) {
			System.out.println("Senior Citizens");
		}
	}

}

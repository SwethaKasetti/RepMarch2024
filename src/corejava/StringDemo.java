package corejava;

public class StringDemo {

	public static void main(String[] args) {

		int age = 65;
		String gender = "Custom";
//		gender = "Female";
//		gender = "Custom";

		if (gender == "Female" && age >= 60) {
			System.out.println("Congratulations !!! You are eligible for 35% discount on actual price");
		} else if (gender == "Male" && age>=60) {
			System.out.println("Congratulations !!! You are eligible for 25% discount on actual price");
		} else {
			System.out.println("You are eligible for 20% of discount");
		}

	}

}

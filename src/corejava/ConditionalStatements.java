package corejava;

public class ConditionalStatements {
	public static void main(String args[]) {
		int a = 90;
		int b = 70;
		if (a>b) {
			System.out.println("a is the Largest Number");
		}
		
		if (a<100) {
			System.out.println("a is less than 100");
			if (a>50) {
				System.out.println("a is greater than 50");
			}
		}
		
		if (a<50) {
			System.out.println("a is less than 50");
		} 
		else {
			System.out.println("a is greater than or equal to 50");
		}
		
		
	}

}

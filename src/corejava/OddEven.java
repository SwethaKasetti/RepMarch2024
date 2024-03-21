package corejava;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			System.out.print(i);
			System.out.print(" - ");
			
			if(i%2 == 0) {
				System.out.println("The Number is Even Number");
			} else {
				System.out.println("The Number is Odd Number");
			}
		}
		
		
	}

}

package corejava;

public class ArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//String can store only one value at at time
		//We will store Array to store multiple values in a contairanized format
		String abc = "Hi All";
		String[] bcd = {"Hi","Hello","How","are","you?"};
		System.out.println(bcd[4]);
		
		//to print all array values
		for (int i = 0; i < bcd.length; i++) {
			System.out.println(bcd[i]);
		}
	}

}

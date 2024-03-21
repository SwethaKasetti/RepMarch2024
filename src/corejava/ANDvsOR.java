package corejava;

public class ANDvsOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//True || True - True
//True || False - True
//False || True - True
//False || False - False

//True && True - True
//True && False - False
//False && True - False
//False && False - False
		
		if (50>80 || 50<30) {
			System.out.println("False");
		} else {
			System.out.println("True");
		}
		
	}

}

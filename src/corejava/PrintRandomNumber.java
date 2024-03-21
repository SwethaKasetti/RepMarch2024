package corejava;

import java.util.Random;

public class PrintRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-10 - Print any one number randomly

		// Random Class - Default
		Random num = new Random();
		int i = num.nextInt(10);
		System.out.println(i);
		
		
		//I want to print when the system has generated 0(zero) number as output
		//Instead of Zero will replace the value as one(1)
		
		if (i == 0) {
			
			System.out.println("Instead of Zero will replace the value as one(1)");
			i = 1;
			System.out.println(i);
		}
		
	}

}

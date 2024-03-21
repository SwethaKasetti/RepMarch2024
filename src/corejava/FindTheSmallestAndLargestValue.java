package corejava;

public class FindTheSmallestAndLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To find the Largest Value
		int a[] = {34, 56, 999, 2, 0, 46};
		int min = a[0];
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			else if (a[i] > max) {
				max = a[i];
			}

		}
		System.out.println("The Largest Value is" + " " + max);
		System.out.println("The Smallest Value is" + " " + min);

	}

}
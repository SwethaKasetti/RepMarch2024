package corejava;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] abc = { "Hi", "Hold", "sdfghjkrtyui" };
		int length1 = abc[0].length();
		int length2 = abc[1].length();
		int length3 = abc[2].length();

		for (int i = 0; i < abc.length; i++) {
			System.out.println(abc[i]);

		}

		System.out.println(length1);
		System.out.println(length2);
		System.out.println(length3);

		int min = length1;
		int max = length1;

		if (length1 < min) {
			min = length1;
		} else if (length1 > max) {
			max = length1;
		}

		System.out.println("The Largest Length String is -" + max);
		System.out.println("The Smallest Length String is -" + min);

		{

		}
	}

}

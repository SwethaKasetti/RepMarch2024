package corejava;

public class LovalVSGlobal {
	// Variables; Local VS Global

	// Global Variables
	static int a = 100;
	static int b = 80;

	public static void add() {

		// Local Variables
//		int a = 90;
//		int b = 70;
		System.out.println(a + b);
	}

	public static void sub() {

		// Local Variables
		int a = 80;
		int b = 20;
		System.out.println(a - b);
	}

	public static void main(String args[]) {
		add();
		sub();
	}

}

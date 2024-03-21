package corejava;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc;
		abc = "Hi All, My Name is Swetha Poornima Pattapu";

		String cde = "How are You All ???";
		System.out.println(abc);
		System.out.println(cde);

		System.out.println(abc + "," + cde);

		// To print in Upper Case or Lower Case

		System.out.println(cde.toUpperCase());
		System.out.println(abc.toLowerCase());

		// Length of String
		System.out.println(abc.length());

		// To print the character based on the position (Index count starts from
		// 0)(Length count starts from 1)
		// Length - Count Starts from 1
		// Char - Index starts from 0
		System.out.println(abc.charAt(4));

		String b = "Apple";
		String c = "apple";
		// Validate if above two strings are equal

		if (b.equals(c)) {
			System.out.println("Both the Strings are Matching");
		} else {
			System.out.println("Both the Strings are Not Matching");
		}

		// Converts upper case char in to lower case
		if (b.equalsIgnoreCase(c)) {
			System.out.println("Both the Strings are Matching");
		} else {
			System.out.println("Both the Strings are Not Matching");
		}
		// To find a content in a string
		String d = " Hi All, How are you ? We are going to start the Selenium classes ";
		if (d.contains("Selenium")) {
			System.out.println("The String d contains the word Selenium");
		} else {
			System.out.println("The String d does not contain the word Selenium");
		}
		
		String e = "Hi";
		String f = "hi";
		if (e.contentEquals("Hi")) {
			System.out.println("Content Matched");
		} else {
			System.out.println("Content Not Matched");
		}
		
		if (e.contentEquals(f)) {
			System.out.println("Content Matched");
		} else {
			System.out.println("Content Not Matched");
		}
		
		//To remove the white spaces which are there at the starting and ending of the string(blank space)
		System.out.println(d);
		System.out.println(d.trim());
		
		
		int g = 123;
		String h = "456";
		
		System.out.println(g+h); //123456 - but we want 579
		//to convert string to int ; Integer.parseInt(h)
		System.out.println(g+Integer.parseInt(h));
		
		//convert int into string
		System.out.println(Integer.toString(g)+h);
		
		
	}

}

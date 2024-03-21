package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToPrintSystemDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		//ddMMMyyyy_HHmmss
		DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss_a");
		
		//convert timestamp to our own date format
		String timestamp = df.format(d);
		System.out.println(timestamp);
		
	}

}

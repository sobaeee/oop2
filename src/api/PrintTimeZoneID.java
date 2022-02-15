package api;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		//Locale
		//Asia/Seoul
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timeZone);
		System.out.println(now.get(Calendar.HOUR)); //Calender.Year 대신 1을 넣으면 2022가 뜬다. 
		String [] ids = TimeZone.getAvailableIDs();
		for(String id : ids) {
			//System.out.println(id);
		}
	}

}

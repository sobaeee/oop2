package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExam2 {

	public static void main(String[] args) {
		//단위개월을 출력하시오.
		//12-31~1-30
		//1-31~2-30
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance(); //현재 날짜시간 2022-02-16

		rightNow.set(2021, 3-1, 31);
		rightNow.add(Calendar.MONTH, 1);
		rightNow.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(format.format(rightNow.getTime())); 
		rightNow.add(Calendar.MONTH, 1);
		rightNow.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println(format.format(rightNow.getTime())); 
	}

}

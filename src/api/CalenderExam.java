package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderExam {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar rightNow = Calendar.getInstance(); //지정한 날짜시간 2021-12-31 
		Calendar rightNow2 = Calendar.getInstance(); //현재 날짜시간 2022-02-16
		System.out.println(format.format(rightNow.getTime()));
		
		rightNow.add(Calendar.SECOND, 60);
		System.out.println(format.format(rightNow.getTime()));
		rightNow2.roll(Calendar.SECOND, 1); //자기 자리에만 돈다.
		System.out.println(format.format(rightNow2.getTime()));
		
		
		System.out.println("------------------------------");
		
		System.out.println(rightNow.get(Calendar.MONTH)+1+"월"); //월은 항상 +1 해야 현재 달이 나옴 
		
		System.out.println("------------------------------");
		rightNow.set(2021, 11, 31); // 11 = 12-1
		//boolean tf1 = rightNow.before(rightNow2);
		boolean tf1 = rightNow.after(rightNow2);
		System.out.println(tf1);
		
		System.out.println("------------------------------");
		//System.out.println(format.format(rightNow.getTime()));
		//System.out.println(rightNow.getTime()); //현재날짜
		rightNow.add(Calendar.SECOND, -120); //120초 전 날짜 
		rightNow.add(Calendar.DAY_OF_MONTH, 1); //하루가 추가된 날짜 
		rightNow.add(Calendar.MONTH, 1); //한 달 추가 
		System.out.println(rightNow.getTime()); 
	}

}

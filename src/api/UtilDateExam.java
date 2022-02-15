package api;

import java.text.SimpleDateFormat;
import java.util.Date;
//Date는 2가지가 있다. 보통 날짜와 시간을 나타낼 때에는 util을 쓴다.

public class UtilDateExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());
		now.setMonth(11); //0~11의 값이라 11을 넣어주면 12월이 뜬다. 
		System.out.println(now.getMonth()+1); //0~11월로 인식하고 있어서 +1을 해줘야 1~12월이 된다.
		
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초"); 
		//MM 소문자로 쓰면 0나옴. hh로 쓰면 14시가 아닌 2시가 나옴.
		String nowStr = format.format(now);
		System.out.println(nowStr);
	}

}

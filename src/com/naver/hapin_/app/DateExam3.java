package com.naver.hapin_.app;

import java.util.Date;

public class DateExam3 {

	public static void main(String[] args) {
		Date now = new Date();
					//↑메소드x 생성자o
		System.out.println(now);
		
		java.sql.Date date = new java.sql.Date(System.currentTimeMillis()); //import가 위에서 이미 사용을 했기에 import sql를 다 써줘야 한다.
		System.out.println(date);
		
		
	}

}

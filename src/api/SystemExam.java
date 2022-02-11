package api;

import java.sql.Date;
//sql 이 아닌 utill 을 쓰면 초까지 나온다. 

/**
 * System 클래스 
 * @author smart20
 *
 */
public class SystemExam {

	public static void main(String[] args) {
		//1644552193087 <== Timestamp
		long now = System.currentTimeMillis();
		System.out.println(now);
		System.out.println(new Date(now));

	}

}

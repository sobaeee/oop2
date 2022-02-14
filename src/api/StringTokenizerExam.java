package api;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String text = "홍길동,안명진;이순신";
		StringTokenizer token = new StringTokenizer(text, ",;"); // 파이프라인(|) 안해도 됨.
		while(token.hasMoreTokens()) {
			System.out.print(token.countTokens()); // =>숫자가 이름 옆에 뜸. 현재 남아있는 토큰 수를 알려준다.
			System.out.println(token.nextToken());
		}
		//token = new StringTokenizer(text, ",;");    <= 추가하면 홍길동부터 다시 나타난다. 
		while(token.hasMoreTokens()) {
			System.out.print(token.countTokens()); 
			System.out.println(token.nextToken());
		}

	}

}

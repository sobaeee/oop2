package api;

import java.util.Random;

import common.JavaUtil;

public class MathExam {

	public static void main(String[] args) {
		//10~20
		int num = (int) ((Math.random() * 11) + 10);
		//11을 곱해줘야 0부터 10까지 나온다.
		System.out.println("주사위 눈: " + num);
		System.out.println("--------------------------------------");
		
		//선택번호
		int num1 = (int) (Math.random() * 45) +1;
		int[] selectNumber = new int[6];
		Random random = new Random(3);
		System.out.println("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNumber[i] = random.nextInt(11) + 10;
			System.out.println(selectNumber[i] + " ");
		}
		
		System.out.println("--------------------------------------");
		
		
		String str = null;
		//System.out.println(JavaUtil.nullToBlank(str).length());
		//								str가 빈값이면 0 나올거고. 길이도 같이 나옴 
		System.out.println((str == null)?"":str.length());
		// ?,: => 삼항연산자. if else와 비슷. 앞에 값에 따라 뒤의 값을 나타내라~.    1권 p.100
										//str가 null이면 빈칸이 나옴 
		System.out.println(Math.pow(10, 3));
		System.out.println(JavaUtil.round(Math.random(), 3));
		
		System.out.println(Math.round(Math.random()*1000)/1000.); 
		//-> 정수 / 정수는 -> 정수. 1000뒤에 .을 붙여서 실수로 만든 후 정수랑 계산하면 실수가 나음.
		System.out.println(Math.random());

	}

}

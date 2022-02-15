package api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		System.out.println(random.nextInt(11));
		//값이 있으면 0부터 11까지 나온다.
		System.out.println(Math.abs(random.nextInt(11)));
		System.out.println(Math.abs(random.nextInt()));    //abs => 양수만 보여줌 
		
		System.out.println("----------------------");
		//10~20
		System.out.println(random.nextInt(11)+10);

	}

}

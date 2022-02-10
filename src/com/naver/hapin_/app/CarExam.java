package com.naver.hapin_.app;

public class CarExam {

	public static void main(String[] args) {
		
		CarExam [] ce = new CarExam[2];
		ce[0] = new CarExam();
		ce[1] = new CarExam();
		System.out.println(ce);
		System.out.println(ce[0]);
		System.out.println(ce[1]);
		//↑해시태그 결과 값이 다르다. 각각 지니고 있는 값이 다르기 때문.
		
		
//		int [] i = new int[2];
//		i[0] = 10;
//		System.out.println(i[0]);

	}

}

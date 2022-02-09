package com.naver.hapin_.app;

public class ConstC extends ConstP {
	public ConstC() {
		super("문자열"); //상속관계에서 super는 부모를 가리킨다. 나 자신은 this 라고 부름 
		System.out.println("ConstC 생성자");
	}
}

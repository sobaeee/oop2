package com.naver.hapin_.app;

public class MethodP {
	public MethodP() {
		System.out.println("methodP()");
	}

	void show() {
	//부모님 public 없애도 오류가 안남.
		System.out.println("부모메소드");
	}

}

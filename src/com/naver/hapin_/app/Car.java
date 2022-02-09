package com.naver.hapin_.app;

public class Car {
	
	Tire t1;
	static Tire t2;
	
	public Car() {
		t1 = new HankookTire();
		t2 = new KumhoTire();
	}

	public static void main(String[] args) {
		
		Car car = new Car();
		car.t1.setInch(15);
		System.out.println(car.t1.getInch());
		
		Car car2 = new Car();
		car2.t1.setInch(20);
		System.out.println(car.t1.getInch());
		
		Car.t2.setInch(23);
		System.out.println(Car.t2.getInch());
						//↑static Tire 의 static이 붙어서 변수.속성 메소드가 아닌 클래스.속성 메소드로 바로 출력할 수 있다.
		
		//com.hankook.Tire tire = new com.hankook.Tire();
		//↑임포트를 사용하지 않았을땐 이렇게 직접 다 입력 해야함. 
		//Tire tire = new Tire();
		//↑임포트를 썼을때는 이렇게 적음 
	}
}

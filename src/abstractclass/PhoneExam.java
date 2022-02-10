package abstractclass;

public class PhoneExam {

	public static void main(String[] args) {
		// Phone phone = new Phone();
		SmartPhone smartphone = new SmartPhone("김길동");

		// 홍길동 출력을 해보세요.
		System.out.println(smartphone.owner); //owner는 필드. 객체명.필드; 로  사용. 

		smartphone.trunOn();
		smartphone.internetSearch();
		smartphone.trunOff();

	}

}

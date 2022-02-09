
public class SmartPhoneExam3 {

	public static void main(String[] args) {//한프로젝트당 main은 하나다.
		//객체선언 및 생성
		//new 객체생성하면 sp(객체)를 인스턴스화한다.라고함
		SmartPhone sp = new SmartPhone(null,null,null,null,"010-8654-3420");//디폴드 생성자 를통해서 객체 생성
		SmartPhone sp2 = new SmartPhone();
		
		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "white";
		sp2.caseColor = "black";
		//객체값출력
		System.out.println("SP휴대폰색상:" + sp.caseColor);
		System.out.println("SP전화번호:" + sp.phoneNumber);
		System.out.println("SP2휴대폰색상:" + sp2.caseColor);
		System.out.println("SP2전화번호:" + sp2.phoneNumber);
		//객체메소드호출
		
		sp = sp2 = null;//메모리에 있던 자료를 다 지워 버린다-참조 연끊기.메모리누수를 막을수있다
		System.gc();

	}

}

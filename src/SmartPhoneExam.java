
public class SmartPhoneExam {

	public static void main(String[] args) {//한프로젝트당 main은 하나다.
		//객체선언
		SmartPhone sp = null;
		//객체생성
		sp = new SmartPhone();//디폴드 생성자
		//객체초기값
		//속성 : 객체명.속성
		sp.caseColor = "black";
		//객체값출력
		System.out.println("휴대폰색상:" + sp.caseColor);
		//객체메소드호출
		sp.takingPictures();
		//가비지컬랙션 호출
		sp = null;//메모리에 있던 자료를 다 지워 버린다-참조 연끊기.메모리누수를 막을수있다
		System.gc();

	}

}

/*
 * 스마트 클래스
 */
public class SmartPhone {//클래스(class)는 객체 지향 프로그래밍(OOP)에서 특정 객체를 생성하기 위해 변수와 메소드를 정의하는 일종의 틀이다.
	//멤버변수
	String caseColor;//폰케이스색상
	String cameraPixel;//카메라화소
	String lcdSize;//화면크기
	String modelName;//모델명
	String phoneNumber;//전화번호
	//멤버메소드
	
	//디폴트 생성자-사용하든 안하든 만들어 둬야 에러가없다.
	public SmartPhone() {
		System.out.println("디폴트생성자를 호출했어요.");
	}
	
	
	
	
	
	public SmartPhone(String caseColor,String cameraPixel,
			String lcdSize, String modelName, 
			String phoneNumber) {
	
		this.caseColor = caseColor;
		this.cameraPixel = cameraPixel;
		this.lcdSize = lcdSize;
		this.modelName = modelName;
		this.phoneNumber = phoneNumber;
	}





	/*
	 * 사진을 찍다
	 */
	void takingPictures() {
		System.out.println("사진을 찍다.");
		 
	}
	/*
	 * 전화걸기
	 */
	void makeACall(String toPhoneNumber) {
		System.out.println(toPhoneNumber+"번호로 전화를 겁니다.");
	}
	/*
	 * 앱실행
	 */
	void playApp(String appName) {
		System.out.println(appName+"카카오톡 앱을 실행합니다.");
	}
	
}

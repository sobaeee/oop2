package abstractclass;

/**
 * 추상 클래스 몸체(중괄호 안) : 필드, 상수, 구현된메소드, 추상메소드 포함
 * 
 * @author smart20
 *
 */
public abstract class Phone {
	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		super();
		this.owner = owner;
	}

	// 메소드
	public void trunOn() {
		System.out.println("폰 전원을 켭니다.");

	}

	public void trunOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	public abstract void call();
}

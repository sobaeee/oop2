package abstractclass;

public abstract class Animal {
	public String king;
	
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	//추상[abstract]메소드 몸체{}가 없습니다.
	public abstract void sound();
}

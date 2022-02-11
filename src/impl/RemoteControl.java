package impl;

/**
 * 인터페이스 구성은 상수, 추상메소드만 사용가능하다.
 * @author smart20
 *
 */
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public final int MIN_VOLUME = 0;
	//인터페이스에는 변수가 올 수가 없음. 인터페이스에는 몸체가 올 수 없다.
	
	public abstract void trunOn();
	public void trunOff();
	public void setVolume(int volume);
	
	//final이나 abstract이나 붙이지 않아도 자동으로 오게 된다. 
}

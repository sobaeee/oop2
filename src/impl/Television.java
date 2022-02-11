package impl;

public class Television implements RemoteControl {
	// ↑구현한다 (구현클래스)

	@Override
	public void trunOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void trunOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("현재 TV볼륨: " + volume);
	}

}

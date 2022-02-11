package impl;

public class RemoteControlExam {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.trunOn();
		rc.setVolume(5);
		rc.trunOff();
	}

}

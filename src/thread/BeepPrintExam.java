package thread;
/**
 * 단일 스레드
 * 위쪽 작업이 끝나고 아래쪽 작업이 시작된다.
 */
import java.awt.Toolkit;

public class BeepPrintExam {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

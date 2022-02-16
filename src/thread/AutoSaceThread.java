package thread;

public class AutoSaceThread extends Thread {
	private void save() {
		System.out.println("작업 내용을 저장함.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			save();
		}
	}

}

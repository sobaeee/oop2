package thread;

public class DaemonExam {

	public static void main(String[] args) {
		AutoSaceThread ast = new AutoSaceThread();
		ast.setDaemon(true); // 스레드 종료 시키면 자식 스레드도 같이 멈춤 
		ast.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("메인스레드 종료");
	}

}

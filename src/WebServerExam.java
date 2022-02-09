
public class WebServerExam {

	public static void main(String[] args) {
		//has a 방식 (is a방식도 있다.)
		WebServer ws = new WebServer();
		ws.port = 80;
		System.out.printf("현재 웹서버포트는 %d입니다.%n",ws.port);
		//ws.start();
		//ws.stop();
		ws.reStart();

	}

}

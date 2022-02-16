package thread;

import java.lang.Thread.State;

public class ThreadStateExam {

	public static void main(String[] args) {
		StatePrintThread spt = new StatePrintThread(new TargetThread());
		spt.start();
	}

}

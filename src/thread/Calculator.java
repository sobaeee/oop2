package thread;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// 동기화 메소드 synchronized
	// public synchronized void setMemory(int memory) {
	public void setMemory(int memory) {
		//↓동기화 블록 user1이 일이 끝날때까지 user2 접근 금지 
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + this.memory);
		}
	}
}
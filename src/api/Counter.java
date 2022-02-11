package api;
/**
 * 메모리 누수 방지
 * @author smart20
 *
 */

public class Counter {
	
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}

	@Override  //부모에게 상속받은걸 재조명 했다.
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}

}

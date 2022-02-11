package excep;

public class B {

	public void throwMethod() {
		A a = new A();
		try {
			a.throwMethod();
		} catch (InterruptedException e) {
		}
		System.out.println("B");
		
	}

}

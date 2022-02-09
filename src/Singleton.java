
public class Singleton {
	
	private static Singleton singgleton= 
			new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singgleton;
	}

}

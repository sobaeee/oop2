
public class Const {
	
	
	
	
	static int a;//필드 추가
	String b;
	
	public Const() {
		//this(10, "abc");
		
		this("abc", 10 );
		System.out.println("아래 다른 생성자호출에 에러가 납니다.");
		//생성자에서 다른생성자를 호출할 때 this를 사용한다.
		
		
	}
	
	public Const(int a, String b) {
		
		this.a = a;
		this.b = b;
	}
	
public Const( String b, int a) {
		
		this.a = a;
		this.b = b;
	}

	public Const(int a) {
		super();
		this.a = a;
	}

	public Const(String b) {
		super();
		this.b = b;
	}
	
	static void print(int i/*파라메타*/) {
		System.out.println("출력값 INT:"+i);
		
	}
	
	void print(double i) {
		System.out.println("출력값 DOUBLE:"+i);
		
	}
	
	void print(String i) {
		System.out.println("출력값 STRING:"+i);
		
	}

	public void print(int i, double d, String s) {
		/*
		 * ==, equals, instanceof 현제클래스에서 만들어진객체냐
		 * 오버로딩 : 같은 함수명을 사용한다.
		 * 매개변수의 수가 다르거나, 타입이 다르면 사용할수 있다.
		 * 매개변수의 수가 같고, 타입의 순서가 다르면 사용할수 있다.
		 */
		print(i);
		print(d);
		print(s);
//		if(Integer.valueOf(i) instanceof Integer);{
//			print(i);
//		}
//		if(Double.valueOf(d) instanceof Double);{
//			print(d);
//		}
//		if(s instanceof String);{
//			print(s);
//		}
		
		
	}
	
	//함수명을 같이 하면서 다양하게 쓸수 있다- 오버로딩
	
	
	//디폴트생성자 void
	
	
//public Const() {
//	
//	
//	}
//	
//	
//	public Const(int a, String b) {
//		this.a = a;
//		this.b = b;
//	}

	
	
}

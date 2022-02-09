
public class ConstExam {

	public static void main(String[] args) {
		// new 생성자();
		
		Const c = new Const();
		Const c2 = new Const(10, "abc");
		c.a = 10;
		c2.a = 20;
		System.out.println(c.a);
		System.out.println(c2.a);
		
		
//		c.print(10/*인자*/);
//		c.print(10.1);
//		c.print("Hi");
		c.print(10,10.1,"Hi");
		
	}

}

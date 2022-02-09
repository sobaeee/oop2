import java.util.Date;

public class Test {

	public static void main(String[] args) {
		//java.sql.Date
		Date date
		= new java.sql.Date(System.currentTimeMillis());
		
		System.out.println(date);
		
		//java.util.Date
		java.util.Date date2
		= new java.util.Date(System.currentTimeMillis());
		
		System.out.println(date2);
		

	}

}

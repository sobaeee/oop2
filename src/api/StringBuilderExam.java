package api;

public class StringBuilderExam {

	public static void main(String[] args) {
		StringBuilder sql = new StringBuilder().append(" select ")
				.append(" * ")
				.append(" from member ");
		
		//바로 객체 뒤에 . 을 찎어서 추가할 수도 있다. 
		
//		StringBuffer sql = new StringBuffer();
//		sql.append(" select ");
//		sql.append(" * ");
//		sql.append(" from member ");
		//기본적으로 양쪽을 다 띄워줘야한다. 아니면 다 붙어버림
		
		//StringBuffer => String 클래스 만들기
		String sqlStr = sql.toString();   //toString => String을 리턴해준다.
		System.out.println(sqlStr);

	}

}

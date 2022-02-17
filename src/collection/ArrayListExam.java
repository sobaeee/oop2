package collection;

import java.util.*;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); //3번으로 밀려남
		list.add(2,"Database"); //2번으로 값이 들어감
		list.add("iBATIS");
		System.out.println("-------------------------------");
		System.out.println("iterator 이용 출력문");
		Iterator<String> it = list.iterator(); //객체 생성
		
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		System.out.println("-------------------------------");
		it = list.iterator();   
		// ↑ 이게 있어야 한번 더 출력이 된다. (hasNext는 한번 출력한 것들은 없애서 출력될게 없다. 그러므로 한번 더 값을 주어 출력 될 내용을 만들어준다.
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
		
		System.out.println("-------------------------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수 : "+list.size());
		System.out.println("-------------------------------");
		
		list.remove(0);
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println(list.isEmpty());
		System.out.println("총 객체수 : "+list.size());
	}

}

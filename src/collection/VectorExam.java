package collection;

import java.util.*;

public class VectorExam {

	public static void main(String[] args) {
		Vector<String> list = new Vector<String>();
		System.out.println("용량: "+list.capacity());
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP"); //3번으로 밀려남
		list.add(2,"Database"); //2번으로 값이 들어감
		list.add("iBATIS");
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

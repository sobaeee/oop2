package collection;

import java.util.*;

public class HashSetExam {

	public static void main(String[] args) {
		// Set<String> set = new HashSet<String>(); //중복값을 허용하지 않음.
		List<String> set = new ArrayList<String>(); // 중복값을 허용한다.

		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);
		}
	}

}

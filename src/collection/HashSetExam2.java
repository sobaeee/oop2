package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam2 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		// 같은 패키지라서 쓸 수 있음.

		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
		
		Iterator<Member> iterator = set.iterator();
		while(iterator.hasNext()) {
			Member data = iterator.next();
			System.out.println(data.getName());
			System.out.println(data.getAge());  // => getter,setter 추가 해야함 
		}

		// Member 창에 equals 오버라이드를 해둬서 객체수가 1로 뜸. 오버라이드 해둔걸 없애면 객체 수는 2개가 되어 버린다.
	}

}

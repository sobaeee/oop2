package collection;

import java.util.*;

public class HashMapExam2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();

		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 객체수 : " + map.size());
		Set<String> keyset = map.keySet();
		Iterator<String> it = keyset.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print(key);
			System.out.print(":");
			System.out.println(map.get(key));
		}
		//System.out.println(map.get("홍길동"));
	}
}

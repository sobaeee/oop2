package api;

public class Member implements Comparable<Member>{
											//↑T(제네릭-타입) 를 member로 수정 
	String name;
	int age;
	
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Member o) {
		//return name.compareTo(o.name);  => 이름순
		return o.age - age;   // => 나이순 (높은대서 낮은대로)
		//return age - o.age; => 나이순 (낮은대서 높은대로)
	}
	
	
	
}

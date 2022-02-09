package ext2;

public class Main {

	public static void main(String[] args) {
		//String name, int age, int hight, int weight, 
		//String studentID, int grade, double gPA
		Student student1 = new Student("홍길동", 21, 170, 80, "20220208", 1, 4.5);
		Student student2 = new Student("이순신", 20, 180, 70, "20220207", 1, 3.5);
		
		System.out.println(student1.toString()); 
		System.out.println(student2);
		
		
		
		Teacher teacher = new Teacher("임금님", 42, 175, 75, "20220808");
				System.out.println(teacher);
	}

}

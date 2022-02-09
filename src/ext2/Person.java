package ext2;

public class Person {

	private String name; //이름
	private int age; //나이
	private int hight; //키
	private int weight; //몸무게
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Person(String name, int age, int hight, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
	}
	

}

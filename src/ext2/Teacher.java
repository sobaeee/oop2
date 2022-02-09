package ext2;

public class Teacher extends Person {
	
	private String profesorID;

	public String getProfesorID() {
		return profesorID;
	}

	public void setProfesorID(String profesorID) {
		this.profesorID = profesorID;
	}

	public Teacher(String name, int age, int hight, int weight, String profesorID) {
		super(name, age, hight, weight);
		this.profesorID = profesorID;
	}

	@Override
	public String toString() {
		return "Person [name=" + getName() + ", age=" + getAge() + ", hight=" + getHight() + ", weight=" + getWeight() + "] Teacher [profesorID=" + profesorID + "]";
	}
	
	
}

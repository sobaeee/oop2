package ext2;

public class Student extends Person {
	
	private String studentID; //학번
	private int grade; //학년
	private double GPA; //학점 
	
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
		//변수의 첫글자는 소문자 
	}
	
	public Student(String name, int age, int hight, int weight, String studentID, int grade, double gPA) {
		super(name, age, hight, weight);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	@Override
	//오버라이딩 
	public String toString() {
		return "Person [name=" + super.getName() + ", age=" + getAge() + ", hight=" + getHight() + ", weight=" + getWeight() + "] Student [studentID=" + studentID + ", grade=" + grade + ", GPA=" + GPA + "]";
								//super. 생략가능
	}
	

	
}

package thread;

public class MainThreadExam {

	public static void main(String[] args) {
		Calculator calc = new Calculator(); // <= has a 방식 '가지고 있다'
		User1 user1 = new User1();
		user1.setCalculator(calc);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calc);
		user2.start();

	}

}

package abstractclass;

public class AnimalExam {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("------------------");
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
		System.out.println("------------------");

		// 메소드 다형성
		// 메인 메소드가 stactic이라 아래 메소드도 static으로 통일
		animalSound(new Dog());
		animalSound(new Cat());
		animalSound(new Ham());
	}

	private static void animalSound(Animal animal) {
		animal.sound();
	}
//		
//	
//	private static void animalSound(Cat cat) {
//		cat.sound();
//		
//	}
//
//	private static void animalSound(Dog dog) {
//		dog.sound();
//		
//	}
// animal.sound 가 있을땐 아래 두개는 필요가 없다.
// 두가지 있다면 (animalSound(new Dog());와 animalSound(new Cat()); 아래것들에 연결이 된다.

}

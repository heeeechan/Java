package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
	
	// 변수의 자동 타입 변환(upcasting)
	Animal animal = null;
	animal = new Dog(); // Dog 클래스로 인스턴스 생성 => Animal 클래스 타입으로 업캐스팅
	animal.sound(); // Dog 클래스에서 메소드 재정의 했기 때문에 Dog 클래스의 sound() 메소드 호출
	animal = new Cat();
	animal.sound();
	System.out.println("-----");
	
	// 메소드의 다형성
	animalSound(new Dog());
	animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
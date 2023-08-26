package sec03.exam02;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
	
	// ������ �ڵ� Ÿ�� ��ȯ(upcasting)
	Animal animal = null;
	animal = new Dog(); // Dog Ŭ������ �ν��Ͻ� ���� => Animal Ŭ���� Ÿ������ ��ĳ����
	animal.sound(); // Dog Ŭ�������� �޼ҵ� ������ �߱� ������ Dog Ŭ������ sound() �޼ҵ� ȣ��
	animal = new Cat();
	animal.sound();
	System.out.println("-----");
	
	// �޼ҵ��� ������
	animalSound(new Dog());
	animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
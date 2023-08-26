package sec03.exam01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); // 추상클래스는 직접 생성자 호출하여 객체 생성할 수 없음
		
		SmartPhone smartPhone = new SmartPhone("김희찬");
		
		smartPhone.turnOn(); // Phone의 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // Phone의 메소드
	}
}
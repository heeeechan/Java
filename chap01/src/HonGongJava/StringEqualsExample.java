package HonGongJava;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "김희찬";
		String strVar2 = "김희찬";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
	}
}
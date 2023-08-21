package ex6;

public class SutdaCard {
	int num = 1;
	boolean isKwang = true;
	
	String info() {
		return num + (isKwang ? "K" : "");
	}
}

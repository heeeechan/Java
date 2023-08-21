package ex6;

public class Ex1_2 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
		card1.num = 3;
		card1.isKwang = false;
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
	}
}
package ex7;

public class Ex2 {
	public static void main(String args[]) {
		SutdaDeck deck = new SutdaDeck();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.println(deck.cards[i] + ",");
			System.out.println();
			System.out.println();
		}
	}
}
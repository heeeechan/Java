interface Fightable {
	void fight();
}

interface Helping {
	void help();
}

abstract class Unit {
	public void move() {

	}
}

class Fighter extends Unit implements Fightable {
	@Override
	public void fight() {
	}

	@Override
	public void move() {
	}
}

class Helper extends Unit implements Helping {
	@Override
	public void help() {
	}

	@Override
	public void move() {
	}
}

public class InterfaceTest1 {
	public static void main(String[] args) {
		// Fightable fighter = new Fighter(); // upcasting
		// fighter.fight();
		// fighter.move(); // 레퍼런스 타입에 없는 메소드 호출은 불가능

		Fighter fighter = new Fighter();
		Fightable fighter1 = fighter;
		Unit unit = fighter;
		// Object obj = fighter;

		Helper helper = new Helper();
	}
}
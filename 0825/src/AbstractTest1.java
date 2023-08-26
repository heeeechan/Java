abstract class Player {
	int currentPos;

	public Player() {
		currentPos = 0;
	}

	abstract void play(int pos);

	abstract void stop();

	void play() {
		play(currentPos);
	}
}

// abstract class�� ��ӹ����� abstract method�� �ݵ�� �������� ������
// ��ӹ��� �ڽ� Ŭ������ abstract Ŭ�������� �Ѵ�.

class DPlayer extends Player {
	@Override
	void play(int pos) {
		System.out.println("DPlayer play(int POS)");
	}
	
	@Override
	void stop() {
		System.out.println("DPlayer stop()");
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		// Player player = new Player(); // abstract class�� ��ü ���� �Ұ���
		DPlayer dPlayer = new DPlayer();
		dPlayer.play(10);
		dPlayer.stop();
		
		Player player = new DPlayer(); // upcasting
		dPlayer.play(10);
		dPlayer.stop();
	}
}
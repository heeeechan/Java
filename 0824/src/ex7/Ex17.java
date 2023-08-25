package ex7;

abstract class Unit {
	int x, y; // ���� ��ġ

	abstract void move(int x, int y); // ������ ��ġ�� �̵�

	void stop() { // ���� ��ġ�� ����

	}
}

class Marine extends Unit { // ����
	void move(int x, int y) {}

	void stimPack() {
	/* �������� ����Ѵ�. */}
}

class Tank extends Unit { // ��ũ
	void move(int x, int y) {}

	void changeMode() {
	/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit { // ���ۼ�
	void move(int x, int y) {}
	
	void load() {
	/* ���õ� ����� �¿��. */ }

	void unload() {
	/* ���õ� ����� ������. */ }
}
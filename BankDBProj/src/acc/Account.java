package acc;

import exc.BankError;
import exc.BankException;

public class Account {
	String id;
	String name;
	int balance;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// ������
	public Account() {
	}

	public Account(String id, String name, int money) {
		this.id = id;
		this.name = name;
		this.balance = money;
	}

	// �޼ҵ�
	@Override
	public String toString() {
		return String.format("���¹�ȣ:%s,�̸�:%s,�ܾ�:%d", id, name, balance);
	}

	// ����ó��
	public void deposit(int money) throws BankException {
		if (money <= 0) {
			throw new BankException("�Աݿ���", BankError.MINUS);
		}
		balance += money;
	}

	// ����ó��
	public void withdraw(int money) throws BankException {
		if (balance < money) {
			throw new BankException("��ݿ���", BankError.LACK);
		}
		balance -= money;
	}
}
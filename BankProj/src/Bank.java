import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	List<Account> accs = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	int menu() throws BankException {
		System.out.println("[�ڽ�Ÿ ����]");
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. ������ȸ");
		System.out.println("5. ��ü������ȸ");
		System.out.println("0. ����");
		System.out.print("����>>");
		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel >= 0 && sel <= 5)) {
			throw new BankException("�޴�����", BankError.MENU);
		}
		return sel;
	}

	void selAccMenu() throws BankException {
		System.out.println("[���°���]");
		System.out.println("1.�Ϲݰ���");
		System.out.println("2.Ư������");
		System.out.print("����>>");
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
		default:
			throw new BankException("�޴�����", BankError.MENU);
		}
	}

	void makeAccount() throws BankException {
		System.out.println("[�Ϲݰ��� ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			throw new BankException("���¿���", BankError.EXISTID);
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		accs.add(new Account(id, name, money));
	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[Ư������ ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			throw new BankException("���¿���", BankError.EXISTID);
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("���(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// �߰�
		accs.add(new SpecialAccount(id, name, money, grade));
	}

	Account searchAccById(String id) {
		for (Account acc : accs) {
			if (acc.getId().equals(id)) {
				return acc;
			}
		}
		return null;
	}

	void deposit() throws BankException {
		System.out.println("[�Ա�]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}

	void withdraw() throws BankException {
		System.out.println("[���]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.print("��ݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}

	void accountInfo() throws BankException {
		System.out.println("[������ȸ]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null)
			throw new BankException("���¿���", BankError.NOID);
		System.out.println(acc);
	}

	void allAccountInfo() {
		System.out.println("[��ü ���� ��ȸ]");
		Iterator<Account> it = accs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0)
					break;
				switch (sel) {
				case 1:
					bank.selAccMenu();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accountInfo();
					break;
				case 5:
					bank.allAccountInfo();
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("�Է������� ���� �ʽ��ϴ�. �ٽ� �����ϼ���.");
			} catch (BankException e) {
				System.out.println(e);
			}
		}
	}
}
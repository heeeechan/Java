import java.util.Scanner;
import acc.Account;
import acc.SpecialAccount;

public class Bank {
	Account[] accs = new Account[100];
	int accCnt;
	Scanner sc = new Scanner(System.in);

	int menu() {
		System.out.println("[�ڽ�Ÿ ����]");
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. ������ȸ");
		System.out.println("5. ��ü������ȸ");
		System.out.println("0. ����");
		System.out.print("����>>");
		int sel = 0;
		try {
			sel = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
		}
		return sel;
	}

	void selAccMenu() {
		System.out.println("[���°���]");
		System.out.println("1.�Ϲݰ���");
		System.out.println("2.Ư������");
		System.out.print("����>>");
		int sel = Integer.parseInt(sc.nextLine());
		if (sel == 1)
			makeAccount();
		else
			makeSpecialAccount();
	}

	void makeAccount() {
		System.out.println("[�Ϲݰ��� ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc != null) {
			System.out.println("���¹�ȣ�� �ߺ��˴ϴ�.");
			return;
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		accs[accCnt++] = new Account(id, name, money);
	}

	void makeSpecialAccount() {
		System.out.println("[Ư������ ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("���(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// �߰�
		accs[accCnt++] = new SpecialAccount(id, name, money, grade);
	}

	Account searchAccById(String id) {
		for (int i = 0; i < accCnt; i++) {
			if (accs[i].getId().equals(id)) {
				return accs[i];
			}
		}
		return null;
	}

	void deposit() {
		System.out.println("[�Ա�]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�.");
			return;
		}
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
	}

	void withdraw() {
		System.out.println("[���]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�.");
			return;
		}
		System.out.print("��ݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
	}

	void accountInfo() {
		System.out.println("[������ȸ]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�.");
			return;
		}
		System.out.println(acc.info());
	}

	void allAccountInfo() {
		for (int i = 0; i < accCnt; i++) {
			System.out.println(accs[i].info());
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
			}
		}
	}
}
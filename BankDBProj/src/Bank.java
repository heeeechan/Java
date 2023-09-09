import java.sql.Connection;
import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import dao.AccountDAO;
import exc.BankError;
import exc.BankException;

public class Bank {
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
			break;
		default:
			throw new BankException("�޴�����", BankError.MENU);
		}
	}

	void makeAccount() throws BankException {
		Connection conn = AccountDAO.getConnection();
		System.out.println("[�Ϲݰ��� ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = AccountDAO.selectAccount(conn, id);
		if (acc != null) {
			AccountDAO.close(conn);
			throw new BankException("���¿���", BankError.EXISTID);
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		AccountDAO.insertAccount(conn, new Account(id, name, money));
		AccountDAO.close(conn);
	}

	void makeSpecialAccount() throws BankException {
		Connection conn = AccountDAO.getConnection();
		System.out.println("[Ư������ ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = AccountDAO.selectAccount(conn, id);
		if (acc != null) {
			AccountDAO.close(conn);
			throw new BankException("���¿���", BankError.EXISTID);
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("���(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// �߰�
		AccountDAO.insertAccount(conn, new SpecialAccount(id, name, money, grade));
		AccountDAO.close(conn);
	}

	void deposit() throws BankException {
		Connection conn = AccountDAO.getConnection();
		System.out.println("[�Ա�]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = AccountDAO.selectAccount(conn, id);
		if (acc == null) {
			AccountDAO.close(conn);
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		acc.deposit(money);
		AccountDAO.updateAccount(conn, acc);

		AccountDAO.close(conn);
	}

	void withdraw() throws BankException {
		Connection conn = AccountDAO.getConnection();
		System.out.println("[���]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = AccountDAO.selectAccount(conn, id);
		if (acc == null) {
			AccountDAO.close(conn);
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.print("��ݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		acc.withdraw(money);
		AccountDAO.updateAccount(conn, acc);
		AccountDAO.close(conn);
	}

	void accountInfo() throws BankException {
		Connection conn = AccountDAO.getConnection();
		System.out.println("[������ȸ]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		Account acc = AccountDAO.selectAccount(conn, id);
		if (acc == null) {
			AccountDAO.close(conn);
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.println(acc);
		AccountDAO.close(conn);
	}

	void allAccountInfo() {
		System.out.println("[��ü ���� ��ȸ]");
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0) {
					break;
				}
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
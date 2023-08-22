import java.util.Scanner;

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
		return Integer.parseInt(sc.nextLine());
	}
	
	void makeAccount() {
		System.out.println("[���� ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		accs[accCnt++]=new Account(id,name,money);
	}
	
	Account searchAccById(String id) {
		for(int i=0; i<accCnt; i++) {
			if(accs[i].id.equals(id)) {
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
		if(acc==null) {
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
		if(acc==null) {
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
		if(acc==null) {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�.");
			return;
		}
		System.out.println(acc.info());
	}
	
	void allAccountInfo() {
		for(int i=0; i<accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		int sel;
		while(true) {
			sel = bank.menu();
			if(sel==0) break;
			switch(sel) {
			case 1: bank.makeAccount(); break;
			case 2: bank.deposit(); break;
			case 3: bank.withdraw(); break;
			case 4: bank.accountInfo(); break;
			case 5: bank.allAccountInfo(); break;
			}
		}
	}
}
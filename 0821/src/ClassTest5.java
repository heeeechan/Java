class Account {
	String id;
	String name;
	int balance;
	
	Account() {}
	Account(String id, String name, int money) {
		id = this.id;
		name = this.name;
		money = balance;
	}
	
	String info() {
		return String.format("���¹�ȣ:%s, �̸�:%s, �ܾ�:%d", id, name, balance);
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		if (balance >= money) {
			balance -= money;
		}
	}
}

class Bank {
	Account[] accs = new Account[100];
	int accCnt;
	
	void makeAccount(String id, String name, int money) {
		Account acc = new Account(id, name, money);
		accs[accCnt++] = acc;
	}
	
	void allAccountInfo() {
		for (int i=0; i<accCnt; i++) {
			System.out.println(accs[i].info());
		}
	}
	
	void accountInfo(String id) {
		for (int i=0; i<accCnt; i++) {
			if (id == accs[i].id) {
				System.out.println(accs[i].info());
			} else {
				continue;
			}
		}
	}
	
	void deposit(String id, int money) {
		for (int i=0; i<accCnt; i++) {
			if (id == accs[i].id) {
				accs[i].balance += money;
			} else {
				continue;
			}
		}
	}
	
	void withdraw(String id, int money) {
		for (int i=0; i<accCnt; i++) {
			if (id == accs[i].id) {
				if (accs[i].balance < money) {
					System.out.println("�ܾ� ����");
				} else {
					accs[i].balance -= money;
				}
			} else {
				continue;
			}
		}
	}
	
}

public class ClassTest5 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.makeAccount("10001", "��浿", 100000);
		bank.makeAccount("10002", "��浿", 200000);
		
		bank.allAccountInfo();
		// ���¹�ȣ:10001, �̸�:��浿, �ܾ�: 100000 
		// ���¹�ȣ:10002, �̸�:��浿, �ܾ�: 200000
		
		bank.accountInfo("10001");
		// ���¹�ȣ:10001, �̸�:��浿, �ܾ�: 100000
		
		bank.deposit("10001", 10000);
		bank.accountInfo("10001");
		// ���¹�ȣ:10001, �̸�:��浿, �ܾ�: 110000
		
		bank.withdraw("10001", 5000);
		bank.accountInfo("10001");
		// ���¹�ȣ:10001, �̸�:��浿, �ܾ�: 105000
		
		
//		Account acc1 = new Account();
//		acc1.id = "10001";
//		acc1.name = "��浿";
//		acc1.balance = 100000;
//		System.out.println(acc1.info());
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		acc1.withdraw(20000);
//		System.out.println(acc1.info());
	}
}

class Account {
	String id;
	String name;
	int balance;
	
	String info() {
		return String.format("���¹�ȣ:%s, �̸�:%s, �ܾ�:%d", id, name, balance);
	}
	
	int deposit(int x) {
		return balance += x;
	}
	
	int withdraw(int x) {
		return balance -= x;
	}
}

public class ClassTest5 {

	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.id = "10001";
		acc1.name = "��浿";
		acc1.balance = 100000;
		System.out.println(acc1.info());
		acc1.deposit(10000);
		System.out.println(acc1.info());
		acc1.withdraw(20000);
		System.out.println(acc1.info());
	}
}

// ���¹�ȣ:10001, �̸�:��浿, �ܾ�:100000
// ���¹�ȣ:10001, �̸�:��浿, �ܾ�:110000
// ���¹�ȣ:10001, �̸�:��浿, �ܾ�:90000
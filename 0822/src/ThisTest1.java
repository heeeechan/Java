class Account {
	String id;
	String name;
	int balance;
	
	Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	String info() {
		return "���¹�ȣ:" + id + ", �̸�:" + name + ", �ܾ�:" + balance;
	}
}

public class ThisTest1 {
	public static void main(String[] args) {
		Account acc1 = new Account("10001", "ȫ�浿", 100000);
		System.out.println(acc1.info());
	}
}
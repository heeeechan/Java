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
		return "계좌번호:" + id + ", 이름:" + name + ", 잔액:" + balance;
	}
}

public class ThisTest1 {
	public static void main(String[] args) {
		Account acc1 = new Account("10001", "홍길동", 100000);
		System.out.println(acc1.info());
	}
}
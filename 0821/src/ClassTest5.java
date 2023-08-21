class Account {
	String id;
	String name;
	int balance;
	
	String info() {
		return String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance);
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
		acc1.name = "고길동";
		acc1.balance = 100000;
		System.out.println(acc1.info());
		acc1.deposit(10000);
		System.out.println(acc1.info());
		acc1.withdraw(20000);
		System.out.println(acc1.info());
	}
}

// 계좌번호:10001, 이름:고길동, 잔액:100000
// 계좌번호:10001, 이름:고길동, 잔액:110000
// 계좌번호:10001, 이름:고길동, 잔액:90000
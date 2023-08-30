import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class Account {
	String id;
	int balance;

	Account() {}

	Account(String id, int balance) {
		this.id = id;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("°èÁÂ¹øÈ£:%s,ÀÜ¾×:%d", id, balance);
	}
}

class IdCompare implements Comparator<Account> {
	@Override
	public int compare(Account o1, Account o2) {
		return o1.id.compareTo(o2.id);
	}
}

public class ArrayListTest3 {
	public static void main(String[] args) {
		List<Account> accs = new ArrayList<>();
		accs.add(new Account("10004", 100));
		accs.add(new Account("10002", 300));
		accs.add(new Account("10003", 200));

		Collections.sort(accs, new IdCompare());
		// for (Account acc : accs) {
		// 	System.out.println(acc);
		// }
		
		// for(int i=0; i<accs.size(); i++) {
		// 	System.out.println(accs.get(i));
		// }

		Iterator<Account> it = accs.iterator(); // ¹Ýº¹ÀÚ
		while (it.hasNext()) {
			Account acc = it.next();
			System.out.println(acc);
		}
	}
}
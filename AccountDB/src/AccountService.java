import java.sql.Connection;
import java.util.List;

public class AccountService {
	public void accountInfo(String id) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id);
		if (acc == null) {
			System.out.println("���� �����Դϴ�.");
		} else {
			System.out.println(acc);
		}
		Dao.close(conn);
	}

	public void makeAccount(Account acc) {
		Connection conn = Dao.getConnection();
		Account racc = Dao.selectAccount(conn, acc.getId());
		if (racc != null) {
			System.out.println("�ߺ� ���¹�ȣ�Դϴ�.");
		} else {
			int cnt = Dao.insertAccount(conn, acc);
			if (cnt > 0) {
				System.out.println(cnt + "�� ���°� �����Ǿ����ϴ�.");
			}
		}
		Dao.close(conn);
	}

	public void deposit(String id, int money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id);
		if (acc == null) {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�.");
			return;
		}
		acc.deposit(money);
		if (Dao.updateAccount(conn, acc) > 0) {
			System.out.printf("%s���� �ܾ��� %d�� �Դϴ�.", acc.getId(), acc.getBalance());
		}
		Dao.close(conn);
	}

	public void withdraw(String id, int money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id);
		if (acc == null) {
			System.out.println("���¹�ȣ�� Ʋ���ϴ�.");
			return;
		}
		if (acc.getBalance() < money) {
			System.out.println("�ܾ��� �����մϴ�.");
			return;
		}
		acc.withdraw(money);
		if (Dao.updateAccount(conn, acc) > 0) {
			System.out.printf("%s���� �ܾ��� %d�� �Դϴ�.", acc.getId(), acc.getBalance());
		}
		Dao.close(conn);
	}

	public void allAccountInfo() {
		Connection conn = Dao.getConnection();
		List<Account> accs = Dao.selectAccountList(conn);
		for (Account acc : accs) {
			System.out.println(acc);
		}
		Dao.close(conn);
	}
}
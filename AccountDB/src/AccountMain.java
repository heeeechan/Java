public class AccountMain {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		// ���� ��ȸ
		// service.accountInfo("10004");

		// ���� ����
		// Account acc = new Account("10004", "������", 100000, "Gold");
		// service.makeAccount(acc);

		// �Ա�
		// service.deposit("10001", 95000);

		// ���
		// service.withdraw("10002", 50000);

		// ��ü ���� ��ȸ
		service.allAccountInfo();
	}
}
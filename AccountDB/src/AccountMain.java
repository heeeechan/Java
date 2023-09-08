public class AccountMain {
	public static void main(String[] args) {
		AccountService service = new AccountService();
		// 계좌 조회
		// service.accountInfo("10004");

		// 계좌 개설
		// Account acc = new Account("10004", "박희찬", 100000, "Gold");
		// service.makeAccount(acc);

		// 입금
		// service.deposit("10001", 95000);

		// 출금
		// service.withdraw("10002", 50000);

		// 전체 계좌 조회
		service.allAccountInfo();
	}
}
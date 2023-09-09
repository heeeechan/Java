package exc;

public class BankException extends Exception {
	private BankError errCode;

	public BankException(String message, BankError errCode) {
		super(message);
		this.errCode = errCode;
	}

	@Override
	public String toString() {
		String msg = "[" + super.getMessage() + "]";
		switch (errCode) {
		case NOID:
			msg += "���¹�ȣ �����Դϴ�.";
			break;
		case EXISTID:
			msg += "���¹�ȣ�� �ߺ��˴ϴ�.";
			break;
		case LACK:
			msg += "�ܾ��� �����մϴ�.";
			break;
		case MINUS:
			msg += "�Աݾ� �����Դϴ�.";
			break;
		case MENU:
			msg += "�߸� �����߽��ϴ�.";
			break;
		default:
			msg += "�Ϲ� �����Դϴ�.";
			break;
		}
		return msg;
	}
}
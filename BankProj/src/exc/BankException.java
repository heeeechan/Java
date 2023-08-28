package exc;

public class BankException extends Exception {
	private BankError errCode;

	public BankException(String message, BankError errCode) {
		super(message);
		this.errCode = errCode;
	}

	@Override
	public String toString() {
		String msg = "";
		switch (errCode) {
		case NOID:
			msg += "���¹�ȣ�� Ʋ���ϴ�.";
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
			msg += "�޴� ���� �����Դϴ�.";
			break;
		default:
			msg += "�Ϲ� �����Դϴ�.";
		}
		return msg;
	}
}
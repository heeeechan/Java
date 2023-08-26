interface IClick {
	void iclick();
}

class BasicButton {
	String title;
	IClick iClick;

	void click() {
		System.out.println("��ư �⺻ ó��");
		if (iClick != null) {
			iClick.iclick();
		}
	}

	void addClickEventHandler(IClick iClick) {
		this.iClick = iClick;
	}
}

class LoginClick implements IClick {
	@Override
	public void iclick() {
		System.out.println("�α��� ó��");
	}
}

public class InterfaceTest3 {
	public static void main(String[] args) {
		BasicButton loginBtn = new BasicButton();
		loginBtn.addClickEventHandler(new LoginClick());
		loginBtn.click();
		BasicButton joinBtn = new BasicButton();
		joinBtn.addClickEventHandler(new IClick() {
			@Override
			public void iclick() {
				System.out.println("ȸ������ ó��");
			}
		});
	}
}
class MyButton {
	String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void click() {
		System.out.println("�⺻ ��ư Ŭ��");
	}
}

class LoginButton extends MyButton {
	@Override
	void click() {
		super.click();
		System.out.println("�α��� ó��");
	}
}

public class InterfaceTest2 {
	public static void main(String[] args) {
		MyButton loginBtn = new LoginButton();
		loginBtn.setTitle("�α���");
		loginBtn.click();
	}
}
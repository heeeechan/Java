import java.io.IOException;

public class ExceptionTest6 {
	static void method1() throws IOException, Exception {
		boolean flag = true;
		if (flag) {
			throw new IOException("����� ����");
		} else {
			throw new Exception("��� ����");
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class ExceptionTest4 {
	public static void method1() throws Exception {
		String str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("method1���� ó��");
			throw new Exception("���� �ٽ� ����");
		}
	}

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			System.out.println("main���� ó��");
		}
		System.out.println("main ������ ó��");
	}
}
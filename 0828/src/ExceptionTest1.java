public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = "kim";
		int[] arr = new int[5];
		try {
			System.out.println(str.toString());
			for (int i = 0; i <= arr.length; i++) {
				arr[i] = i * 10;
			}
		} catch (NullPointerException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Á¾·á");
	}
}
package ex9;

class Ex7 {
	public static boolean contains(String src, String target) {
		int idx = src.indexOf(target);
		if(idx >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
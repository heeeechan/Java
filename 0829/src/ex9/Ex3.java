package ex9;

class Ex3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java";
		System.out.println(fullPath);
		int idx = fullPath.lastIndexOf('\\');
		System.out.println("path:" + fullPath.substring(0, idx));
		System.out.println("fileName:" + fullPath.substring(idx + 1));
	}
}
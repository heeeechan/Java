package ex9;

class Ex9 {
	public static String delChar(String src, String delCh) {
		if (src == null || delCh == null) {
			return src;
		}
		StringBuilder sb = new StringBuilder(src);
		for(int i=0; i<delCh.length(); i++) {
			int idx = sb.indexOf(delCh.charAt(i)+"");
			if(idx >= 0) {
				sb.deleteCharAt(idx);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}

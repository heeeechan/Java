package ex9;

class Ex10 {
	public static String format(String str, int length, int alignment) {
		if (length < str.length()) {
			return str.substring(0, length);
		}
		
		char[] carr = new char[length];
		for (int i=0; i <carr.length; i++) {
			carr[i] = ' ';
		}
		
		if(alignment == 0) {
			System.arraycopy(str.toCharArray(), 0, carr, 0, str.length());
		} else if (alignment == 1) {
			int space = (length - str.length()) / 2;
			System.arraycopy(str.toCharArray(), 0, carr, space, str.length());
 		} else if (alignment == 2) {
 			int space = length - str.length();
 			System.arraycopy(str.toCharArray(), 0, carr, space, str.length());
 		}
		return new String(carr);
	}
		
	/*
	 * (1) format�޼��带 �ۼ��Ͻÿ�.
	 * 1. length�� ���� str�� ���̺��� ������ length��ŭ�� �߶� ��ȯ�Ѵ�.
	 * 2. 1�� ��찡 �ƴϸ�, lengthũ���� char�迭�� �����ϰ� �������� ä���.
	 * 3. ��������(alignment)�� ���� ���� ���ڿ�(str)�� ������ ��ġ�� �����Ѵ�. (System.arraycopy()���)
	 * 4. 2���� ������ char�迭�� ���ڿ��� ���� ��ȯ�Ѵ�.
	*/
	
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str, 7, 0)); // ���� ����
		System.out.println(format(str, 7, 1)); // ��� ����
		System.out.println(format(str, 7, 2)); // ������ ����
	}
}
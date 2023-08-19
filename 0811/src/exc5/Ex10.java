package exc5;

public class Ex10 {
	public static void main(String[] args) {
		char[] abcCode =
			{ '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
			  '(', ')', '-', '_', '+', '=', '|', '[',']', '{', '}',
			  ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		
		String src = "abc123";
		String result = "";
		
		// ���ڿ� src�� ���ڸ� charAt()���� �ϳ��� �о ��ȯ �� result�� ����
		// 'a' => '`' : abcCode['a' - 'a']
		// 'f' => '$' : abcCode['f' - 'a']
		// '5' => 'y' : numCode['5' - '0']
		
		// 'a' : abcCode[0] : abcCode['a' - 'a'] == abcCode[97 - 97] == abcCode[0]
		// 'b' : abcCode[1] : abcCode['b' - 'a'] == abcCode[98 - 97] == abcCode[1]
		// 'c' : abcCode[2] : abcCode['c' - 'a'] == abcCode[99 - 97] == abcCode[2]
		// 'z' : abcCode[25]: abcCode['z' - 'a'] == abcCode[122 - 97] == abcCode[25]
		// '0' : numCode[0] : numCode['0' - '0'] == numCode[48 - 48] == numCode[0]
		// '9' : numCode[8] : numCode['9' - '0'] == numCode[56 - 48] == numCode[8]
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				result += abcCode[ch - 'a'];
			} else if (ch >= '0' && ch <= '9') {
				result += numCode[ch - '0'];
			}
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
	}
}
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("apple banana orange"); // �����ڸ� ��������� ���� ����, ���ϸ� space�� ����
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
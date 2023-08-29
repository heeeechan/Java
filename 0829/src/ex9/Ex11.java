package ex9;

public class Ex11 {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("���� �ܰ� �� ��, �� ���� ������ �Է����ּ���.\n" + "USAGE : GugudanTest 3 5");
		}

		int s = Integer.parseInt(args[0]);
		int e = Integer.parseInt(args[1]);

		if (s > e) {
			int t = s;
			s = e;
			e = t;
		}

		if (s < 2 || e > 9) {
			System.out.println("���� ������ 2�� 9������ ���̾�� �մϴ�.\n" + "USAGE : GugudanTest 3 5");
		}

		for (int i = s; i <= e; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(String.format("%d*%d=%d", i, j, i * j));
			}
			System.out.println();
		}
	}
}
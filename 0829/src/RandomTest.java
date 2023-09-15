public class RandomTest {

	public static void main(String[] args) {
		// 2~8 랜덤값 구하기
		int r = (int) (Math.random() * (8 - 2 + 1)) + 2;
		// (int) (Math.random() * (최댓값 - 최솟값 + 1)) + 최솟값
		System.out.println(r);
	}
}
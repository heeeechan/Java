public class RandomTest {

	public static void main(String[] args) {
		// 2~8 ·£´ı°ª ±¸ÇÏ±â
		int r = (int) (Math.random() * (8 - 2 + 1)) + 2;
		// (int) (Math.random() * (ÃÖ´ñ°ª - ÃÖ¼Ú°ª + 1)) + ÃÖ¼Ú°ª
		System.out.println(r);
	}
}
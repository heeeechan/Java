package chap02;

public class Exercise2_8 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;

		int temp1 = x;
		int temp2 = y;

		x = temp2;
		y = z;
		z = temp1;

		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}

// x=2, y=3, z=1이 되도록 코드 작성
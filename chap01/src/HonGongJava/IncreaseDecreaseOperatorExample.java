package HonGongJava;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("--------------");
		x++;
		++x;
		System.out.println("x=" + x);

		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("--------------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------");
		z = ++x;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("--------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		char var1 = 'A' + 1;
		char var2 = 65;
		System.out.println(var1);
		System.out.println(var2);
	}
}
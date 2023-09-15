class Shape {
	String color;

	void draw() {
		System.out.println("shape");
	}
}

class Circle extends Shape {
	int x;
	int y;
	int r;

	@Override
	void draw() {
		System.out.println("circle");
	}
}

public class PolinoTest1 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.color = "green";
		c.r = 20;
		c.x = c.y = 10;
		c.draw();

		Shape s = new Circle(); // upcasting 자식 객체를 부모 참조 변수에 넣음
		c.color = "red";
		// c.x = 10;
		s.draw(); // 다형성
	}
}
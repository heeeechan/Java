package shape;

public class Triangle extends Shape {
	Point p1;
	Point p2;
	Point p3;

	public Triangle() {
		super("black");
		p1 = new Point();
		p2 = new Point();
		p3 = new Point();
	}

	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public Triangle(String color, int x1, int y1, int x2, int y2, int x3, int y3) {
		super(color);
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		p3 = new Point(x3, y3);
	}

	@Override
	public void draw() {
		System.out.println(String.format("[�ﰢ��:��(%s),��1%s,��2%s,��3%s]", getColor(), p1.info(), p2.info(), p3.info()));
	}
}
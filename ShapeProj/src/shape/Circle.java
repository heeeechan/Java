package shape;

public class Circle extends Shape {
	Point center;
	int radius;

	public Circle() {
		super("black");
		center = new Point();
	}

	public Circle(String color, int x, int y, int radius) {
		super(color);
		center = new Point(x, y);
		this.radius = radius;
	}

	public Circle(String color, Point center, int radius) {
		super(color);
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println(String.format("[��:��(%s),�߽���%s,������(%d)]", getColor(), center.info(), getRadius()));
	}
}

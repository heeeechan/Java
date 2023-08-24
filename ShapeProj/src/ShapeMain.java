import shape.Circle;
import shape.ShapeSet;
import shape.Point;
import shape.Rectangle;
import shape.Triangle;

public class ShapeMain {
	public static void main(String[] args) {
		ShapeSet ss = new ShapeSet();
		ss.add(new Circle("red", 10, 10, 20));
		ss.add(new Circle("pink", new Point(5, 5), 10));
		ss.add(new Triangle("blue", new Point(5, 5), new Point(10, 5), new Point(15, 30)));
		ss.add(new Triangle("sky", 3, 3, 5, 5, 7, 7));
		ss.add(new Rectangle("green", 30, 30, 100, 50));
		ss.add(new Rectangle("yellow", new Point(5, 5), 30, 15));
		ss.allShapeDraw();
	}
}

/*
[��:��(red),�߽���(10,10),������(20)]
[��:��(pink),�߽���(5,5),������(10)]
[�ﰢ��:��(blue),��1(5,5),��2(10,5),��3(15,30)]
[�ﰢ��:��(sky),��1(3,3),��2(5,5),��3(7,7)]
[�簢��:��(green),������(30,30),�ʺ�(100),����(50)]
[�簢��:��(yellow),������(5,5),�ʺ�(30),����(15)]
 */
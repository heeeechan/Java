package ex7;

class Ex23 {
	public static double sumArea(Shape[] arr) {
		double totalArea = 0;

		for (Shape shape : arr) {
			totalArea += shape.calcArea();
		}

		return totalArea;
	}

	public static void main(String[] args) {
		Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1) };
		System.out.println("면적 총합: " + sumArea(arr));
	}
}
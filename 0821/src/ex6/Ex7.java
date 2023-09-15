package ex6;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double getDistance(int x1, int y1) {
		double distance = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
		return distance;
	}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		// p(1,1)과 (2,2) 사이의 거리
		System.out.println(p.getDistance(2, 2));
	}
}
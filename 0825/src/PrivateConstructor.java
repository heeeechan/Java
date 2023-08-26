class MyArray { // singleton object
	private int[] arr = new int[10];
	private static MyArray myArray;

	private MyArray() {}

	public static MyArray getMyArrayRefernce() {
		if (myArray == null) {
			myArray = new MyArray();
		}
		return myArray;
	}
	public void setData(int idx, int data) {
		arr[idx] = data;
	}
	public int getData(int idx) {
		return arr[idx];
	}
}

public class PrivateConstructor {
	public static void main(String[] args) {
		MyArray ma1 = MyArray.getMyArrayRefernce();
		MyArray ma2 = MyArray.getMyArrayRefernce();
		System.out.println(ma1 == ma2);
		ma1.setData(0, 100);
		System.out.println(ma2.getData(0));
	}
}
class Data<T> {
	T data;

	void setData(T data) {
		this.data = data;
	}

	T getData() {
		return data;
	}
}

public class GenericTest {
	public static void main(String[] args) {
		Data<String> d = new Data<>();
		d.setData("hong");
		String s = d.getData();
		System.out.println(s);
		
		Data<Integer> d2 = new Data<>();
		d2.setData(200);
		int n = d2.getData();
		System.out.println(n);
	
		Data<Person> d3 = new Data<>();
		d3.setData(new Person("james", 30));
		Person p = d3.getData();
		System.out.println(p);
		
		// d2 = d; //X, �ٸ� Ÿ������ ������ ���ʸ� ��ü�� ������ Ŭ������ �ƴϴ�. (��Ӱ��赵 �ƴϴ�.)
		Data<Person> d4 = new Data();
		// d3 = d4; //O, ���� Ÿ������ ������ ���ʸ� ��ü�� ������ Ŭ������.
	}
}
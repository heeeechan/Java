import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(); // 중복 허용 X, 차례대로 들어가지 않음.
		hs.add(234);
		hs.add(14);
		hs.add(45);
		hs.add(8);
		hs.add(11);
		hs.add(45);
		for (Integer n : hs) {
			System.out.println(n);
		}

		HashSet<Person> ahs = new HashSet<>();
		ahs.add(new Person("손흥민", 23));
		ahs.add(new Person("김민재", 30));
		ahs.add(new Person("이강인", 33));
		ahs.add(new Person("조규성", 40));
		ahs.add(new Person("이강인", 33));

		for (Person p : ahs) {
			System.out.println(p);
		}
	}
}
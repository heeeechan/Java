import java.util.HashMap;
import java.util.Map;

public class HashMapTest1 {
	public static void main(String[] args) {
		Map<String, Integer> hmap = new HashMap<>();

		hmap.put("1001", 35); // ������ ����(key, value)
		if (hmap.containsKey("1001") == false) { // key ���翩�� Ȯ��
			hmap.put("1001", 40);
		}
		hmap.put("1002", 20);
		hmap.put("1003", 33);
		hmap.put("1004", 27);

		Integer value = hmap.get("1001"); // key�� value ��ȸ

		System.out.println(value);

		System.out.println("============");
		for (Integer n : hmap.values()) { // value ��ü ��� ��ȸ
			System.out.println(n);
		}

		System.out.println("============");
		for (String k : hmap.keySet()) { // key ��ü ��� ��ȸ
			System.out.println(k);
		}

		System.out.println("============");
		for (String k : hmap.keySet()) { // key ��ü ����� ����
			System.out.println(hmap.get(k)); // value ��ȸ
		}

		hmap.remove("1004");

		System.out.println("============");
		for (Map.Entry<String, Integer> entry : hmap.entrySet()) {
			System.out.println(String.format("key:%s, value:%d", entry.getKey(), entry.getValue()));
		}
	}
}
import java.util.*;

public class StringTest2 {
	public static void main(String[] args) {
		String str = "Good Luck";
		int idx = str.indexOf('L');
		System.out.println(idx);
		int idx2 = str.indexOf("Luck");
		System.out.println(idx2);

		String str2 = "apple place";
		int idx3 = str2.indexOf('p');
		int idx4 = str2.lastIndexOf('p');
		System.out.println(idx3);
		System.out.println(idx4);
		String str3 = str2.replace('p', 't');
		System.out.println(str3);
		System.out.println(str2);
		String str4 = str2.replace("place", "banana");
		System.out.println(str4);

		String fruitStr = "apple,banana,pineapple,melon,strawberry";
		String[] fruitArr = fruitStr.split(",");
		for (int i = 0; i < fruitArr.length; i++) {
			System.out.println(fruitArr[i]);
		}

		String pineapple = fruitStr.substring(13, 22);
		System.out.println(pineapple);

//		System.out.println("Y/N�� �����ϼ���:");
//		Scanner sc = new Scanner(System.in);
//		String answer = sc.nextLine();
//		if(answer.toLowerCase() == "y") {
//			System.out.println("Yes ����");
//		} else if (answer.toUpperCase().equals("y")) {
//			System.out.println("No ����");
//		}

		String str5 = "Hello     ".trim();
		System.out.println(str5);
		String str6 = String.valueOf(100);
		String str7 = "" + 100;
		System.out.println(str6);
		System.out.println(str7);
	}
}
public class Student {
		String name;
		String address;
		int grade; 
		int num;
		
		String info() {
			return String.format("�̸�:%s, �ּ�:%s, �г�:%d, �й�:%d", name, address, grade, num);
		}
}
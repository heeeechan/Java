import java.io.File;

public class ExceptionTest7 {
	public static void main(String[] args) {
		File f = createFile(args);
		System.out.println(f.getName() + "������ ���������� �����Ǿ����ϴ�.");
	}

	static File createFile(String fileName) {
		try {
			if (fileName == null || fileName.length() == 0) {
				throw new Exception("���� �̸��� ��ȿ���� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			fileName = "temp.txt";
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}

	static void createNewFile(File f) {
		try {
			f.createNewFile();
		} catch (Exception e) {

		}
	}
}
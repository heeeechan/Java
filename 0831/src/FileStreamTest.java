import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream("dog.jpg");
			fos = new FileOutputStream("dog2.jpg");
//			int data;
//			while ((data = fis.read()) != -1) {
//				fos.write(data);
//			}

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			byte[] buff = new byte[1024];
			int len;
			while ((len = bis.read(buff)) != 0) {
				bos.write(buff, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
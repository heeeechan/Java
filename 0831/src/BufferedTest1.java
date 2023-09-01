import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest1 {
	static void write(Person p) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		;
		try {
			fw = new FileWriter("per.txt");
			bw = new BufferedWriter(fw);
			String perStr = p.getName() + "," + p.getAge() + "," + p.getHeight() + ",";
			perStr += p.isMarried() ? "Y" : "N";
			bw.write(perStr);
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	static Person read() {
		Person per = null;
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("per.txt");
			br = new BufferedReader(fr);
			String perStr = br.readLine();
			String[] perProp = perStr.split(",");
			String name = perProp[0];
			int age = Integer.parseInt(perProp[1]);
			double height = Double.parseDouble(perProp[2]);
			boolean married = perProp[2].charAt(0) == 'Y' ? true : false;
			per = new Person(name, age, height, married);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return per;
	}

	public static void main(String[] args) {
		Person p = new Person("kim", 30, 178.5, false);
		write(p);
	}
}
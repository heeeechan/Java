import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import acc.Account;
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Map<String, Account> accs = new TreeMap<>();
	Scanner sc = new Scanner(System.in);

	int menu() throws BankException {
		System.out.println("[�ڽ�Ÿ ����]");
		System.out.println("1. ���°���");
		System.out.println("2. �Ա�");
		System.out.println("3. ���");
		System.out.println("4. ������ȸ");
		System.out.println("5. ��ü������ȸ");
		System.out.println("0. ����");
		System.out.print("����>>");
		int sel = Integer.parseInt(sc.nextLine());
		if (!(sel >= 0 && sel <= 5)) {
			throw new BankException("�޴�����", BankError.MENU);
		}
		return sel;
	}

	void selAccMenu() throws BankException {
		System.out.println("[���°���]");
		System.out.println("1.�Ϲݰ���");
		System.out.println("2.Ư������");
		System.out.print("����>>");
		int sel = Integer.parseInt(sc.nextLine());
		switch (sel) {
		case 1:
			makeAccount();
			break;
		case 2:
			makeSpecialAccount();
			break;
		default:
			throw new BankException("�޴�����", BankError.MENU);
		}
	}

	void makeAccount() throws BankException {
		System.out.println("[�Ϲݰ��� ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("���¿���", BankError.EXISTID);
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
//		accs.add(new Account(id, name, money));
		accs.put(id, new Account(id, name, money));
	}

	void makeSpecialAccount() throws BankException {
		System.out.println("[Ư������ ����]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("���¿���", BankError.EXISTID);
		}
		System.out.print("�̸�:");
		String name = sc.nextLine();
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("���(VIP-V,Gold-G,Silver-S,Normal-N):");
		String grade = sc.nextLine();
		// �߰�
		accs.put(id, new SpecialAccount(id, name, money, grade));
	}

	void deposit() throws BankException {
		System.out.println("[�Ա�]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.print("�Աݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).deposit(money);
	}

	void withdraw() throws BankException {
		System.out.println("[���]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		if (!accs.containsKey(id)) {
			throw new BankException("���¿���", BankError.NOID);
		}
		System.out.print("��ݾ�:");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).withdraw(money);
	}

	void accountInfo() throws BankException {
		System.out.println("[������ȸ]");
		System.out.print("���¹�ȣ:");
		String id = sc.nextLine();
		if (!accs.containsKey(id))
			throw new BankException("���¿���", BankError.NOID);
		System.out.println(accs.get(id));
	}

	void allAccountInfo() {
		System.out.println("[��ü ���� ��ȸ]");
		Iterator<Account> it = accs.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public void store_b() {
		DataOutputStream dao = null;
		try {
			dao = new DataOutputStream(new FileOutputStream("accs.bin"));
			dao.writeInt(accs.size()); // ���� ���� ����
			for (Account acc : accs.values()) {
				if (accs instanceof SpecialAccount) { // ���� ���� ���а�
					dao.writeChar('S');
				} else {
					dao.writeChar('N');
				}
				dao.writeUTF(acc.getId()); // ���¹�ȣ
				dao.writeUTF(acc.getName()); // �̸�
				dao.writeInt(acc.getBalance()); // �ܾ�
				if (acc instanceof SpecialAccount) {
//					SpecialAccount sacc = (SpecialAccount) acc;
//					dao.writeUTF(sacc.getGrade());
					dao.writeUTF(((SpecialAccount) acc).getGrade().charAt(0) + ""); // ���
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dao != null)
					dao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void store_t() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("accs.txt"));
			for (Account acc : accs.values()) {
				String accStr = acc.getId();
				accStr += "," + acc.getName();
				accStr += "," + acc.getBalance();
				if (acc instanceof SpecialAccount) {
					accStr += "," + ((SpecialAccount) acc).getGrade().charAt(0) + "";
				}
				bw.write(accStr);
				bw.newLine();
			}
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

	public void load_t() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("accs.txt"));
			String accStr = null;
			while ((accStr = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(accStr);
				String id = st.nextToken();
				String name = st.nextToken();
				int balance = Integer.parseInt(st.nextToken());
				if (st.countTokens() != 0) {
					String grade = st.nextToken();
					accs.put(id, new SpecialAccount(id, name, balance, grade));
				} else {
					accs.put(id, new Account(id, name, balance));
				}
//				String[] accProp = accStr.split(",");
//				String id = accProp[0];
//				String name = accProp[1];
//				int balance = Integer.parseInt(accProp[2]);
//				if (accProp.length == 4) {
//					String grade = accProp[3];
//					accs.put(id, new SpecialAccount(id, name, balance, grade));
//				} else {
//					accs.put(id, new Account(id, name, balance));
//				}
			}
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
	}

	public void load_b() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("accs.bin"));
			int count = dis.readInt(); // ���� ����
			for (int i = 0; i < count; i++) {
				char sect = dis.readChar(); // ���� ���� ���а�
				String id = dis.readUTF(); // ���¹�ȣ
				String name = dis.readUTF(); // �̸�
				int balance = dis.readInt(); // �ܾ�
				if (sect == 'S') {
					String grade = dis.readUTF(); // ���
					accs.put(id, new SpecialAccount(id, name, balance, grade));
				} else {
					accs.put(id, new Account(id, name, balance));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (dis != null)
					dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void store_s() {

	}

	public void load_s() {

	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.load_b();
		int sel;
		while (true) {
			try {
				sel = bank.menu();
				if (sel == 0) {
					bank.store_b();
					break;
				}
				switch (sel) {
				case 1:
					bank.selAccMenu();
					break;
				case 2:
					bank.deposit();
					break;
				case 3:
					bank.withdraw();
					break;
				case 4:
					bank.accountInfo();
					break;
				case 5:
					bank.allAccountInfo();
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("�Է������� ���� �ʽ��ϴ�. �ٽ� �����ϼ���.");
			} catch (BankException e) {
				System.out.println(e);
			}
		}
	}
}
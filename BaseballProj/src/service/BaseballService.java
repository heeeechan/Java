package service;

import java.util.Scanner;

public class BaseballService {
	// �����
	public void regTeam() {
		System.out.println("[�����]");
		System.out.println("����:");
		String teamName = sc.nextLine();
		System.out.println("������:");
		String local = sc.nextLine();
	}
	// Ư������ȸ(��������)
	// �������ȸ

	// �������
	public void regPlayer() {
		System.out.println("[�������]");
		System.out.println("������:");
		String playerNameString = sc.nextLine();
		System.out.println("���ȣ:");
		Integer backNum = Integer.parseInt(sc.nextLine());
		System.out.println("<������>");
		// 1.SSG������
		// 2.Ű���������
		// 3.LGƮ����
		// 4.KT����
		System.out.println("����>>");
	}

	// Ư��������ȸ (�̸�����)
	// Ư��������ȸ (���ȣ��)
	// Ư��������ȸ (��ȣ��)
	// Ư���� �Ҽ� ���� ��� ��ȸ
	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("[�߱� ��/���� ���/��ȸ]");
		System.out.println("1. �����");
		System.out.println("2. Ư������ȸ");
		System.out.println("3. �������ȸ");
		System.out.println("--------------");
		System.out.println("4. �������");
		System.out.println("5. Ư��������ȸ(�̸�����)");
		System.out.println("6. Ư��������ȸ(���ȣ��)");
		System.out.println("7. Ư��������ȸ(��ȣ��)");
		System.out.println("8. Ư�������������ȸ");
		System.out.println("����>>");
		return Integer.parseInt(sc.nextLine());
	}
}
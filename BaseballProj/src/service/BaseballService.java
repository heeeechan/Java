package service;

import java.util.List;
import java.util.Scanner;

import dao.PlayerDAO;
import dao.TeamDAO;
import dto.Player;
import dto.Team;

public class BaseballService {
	private PlayerDAO playerDAO = new PlayerDAO();
	private TeamDAO teamDAO = new TeamDAO();

	public BaseballService() {
		playerDAO = new PlayerDAO();
		teamDAO = new TeamDAO();
	}

	// �����
	public void regTeam() {
		System.out.println("[�����]");
		System.out.print("����:");
		String teamName = sc.nextLine();
		System.out.print("������:");
		String local = sc.nextLine();
		teamDAO.insertTeam(new Team(null, teamName, local));
	}

	// Ư������ȸ(��������)
	public void teamInfo() {
		System.out.println("[����ȸ]");
		System.out.print("����:");
		String teamName = sc.nextLine();
		Team team = teamDAO.selectTeam(teamName);
		System.out.println(team);
	}

	// �������ȸ
	public void teamListInfo() {
		System.out.println("[����ȸ]");
		List<Team> teamList = teamDAO.selectTeamList();
		for (Team team : teamList) {
			System.out.println(team);
		}
	}

	// �������
	public void regPlayer() {
		System.out.println("[�������]");
		System.out.print("������:");
		String playerName = sc.nextLine();
		System.out.print("���ȣ:");
		Integer backNum = Integer.parseInt(sc.nextLine());
		System.out.println("<������>");
		List<Team> teamList = teamDAO.selectTeamList();
		for (Team team : teamList) {
			System.out.println(team.shortString());
		}
		System.out.print("����>>");
		Integer teamNum = Integer.parseInt(sc.nextLine());
		playerDAO.insertPlayer(new Player(null, playerName, backNum, teamNum, null));
	}

	// Ư��������ȸ (�̸�����)
	public void playerInfoByName() {
		System.out.println("[������ȸ(�̸�����)]");
		System.out.print("������:");
		String playerName = sc.nextLine();
		List<Player> playerList = playerDAO.selectPlayerByName(playerName);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

	// Ư��������ȸ (���ȣ��)
	public void playerInfoByBacknum() {
		System.out.println("[������ȸ(���ȣ��)]");
		System.out.print("������:");
		Integer backNum = Integer.parseInt(sc.nextLine());
		List<Player> playerList = playerDAO.selectPlayerByBacknum(backNum);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

	// Ư��������ȸ (��ȣ��)
	public void playerInfoByNum() {
		System.out.println("[������ȸ(��ȣ��)]");
		System.out.print("������:");
		Integer num = Integer.parseInt(sc.nextLine());
		List<Player> playerList = playerDAO.selectPlayerByBacknum(num);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

	// Ư���� �Ҽ� ���� ��� ��ȸ
	public void playerListInTeam() {
		System.out.println("[������ȸ(��)]");
		System.out.print("���̸�:");
		String teamName = sc.nextLine();
		List<Player> playerList = playerDAO.selectPlayerByTeam(teamName);
		for (Player player : playerList) {
			System.out.println(player);
		}
	}

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
		System.out.println("0. ����");
		System.out.print("����>>");
		return Integer.parseInt(sc.nextLine());
	}
}
package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // �Ű����� Member Ÿ������ Ȯ��
			Member member = (Member) obj; // Member Ÿ������ ���� ��ȯ ��, id �ʵ尪�� �������� �̻� ��, �����ϸ� true ����
			if (id.equals(member.id)) {
				return true;
			}
		}
	return false; // �Ű����� Member Ÿ���� �ƴϰų�, id �ʵ尪�� �ٸ� ��� false ����
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
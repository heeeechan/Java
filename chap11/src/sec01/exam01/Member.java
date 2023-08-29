package sec01.exam01;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) { // 매개값이 Member 타입인지 확인
			Member member = (Member) obj; // Member 타입으로 강제 변환 후, id 필드값이 동일한지 겁사 후, 동일하면 true 리턴
			if (id.equals(member.id)) {
				return true;
			}
		}
	return false; // 매개값이 Member 타입이 아니거나, id 필드값이 다른 경우 false 리턴
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
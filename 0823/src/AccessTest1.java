import pac.Number;

public class AccessTest1 {
	public static void main(String[] args) {
		Number n1 = new Number();
		// �ٸ� Ŭ������ private ����� ���� �Ұ�
		// n1.pnum = 100;
		// n1.pethod();
	
		// n1.dnum = 100;
		n1.setDnum(100);
		n1.dmethod();
		
		n1.punum = 100;
		n1.pumethod();
		
		// �ڽĵ� �ƴϰ� ���� ��Ű���� �ƴ�. protected ���� �Ұ�
		// n1.prnum = 100;
	}
}
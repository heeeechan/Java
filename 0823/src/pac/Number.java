package pac;

public class Number {
	private int pnum;

	private void pmethod() {
		pnum = 10;
	}

	int dnum;
	public int getDnum() {
		return dnum;
	}
	public void setDnum(int data) {
		dnum = data;
	}
	public void dmethod() {
		System.out.println(pnum);
	}
	public int punum;
	public void pumethod() {
		System.out.println(pnum);
	}
	
	protected int prnum;
	public void prmethod() {}
}
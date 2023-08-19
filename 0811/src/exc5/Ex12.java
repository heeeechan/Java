package exc5;

public class Ex12 {
	public static void main(String[] args) {
		// 3m 짜리 우물 바닥에 달팽이가 있다.
		// 달팽이는 낮동안 55cm 올라올 수 있다.
		// 하지만 날이 지면 잠을 자야 한다.자는 동안 3cm를 미끄러져 내려온다.
		// 달팽이가 우물 밖으로 나오는 데 몇일이 걸릴까?
		// 반복문과 조건문을 이용하여 프로그램을 작성하시오.
		
		int SnailMoving = 0; // 달팽이가 오르는 높이
        int WellHeight = 300; // 우물의 높이
        int DayCount = 0; // 일 수

	    // 달팽이가 우물 밖으로 나올 때까지 반복
	    while (SnailMoving < WellHeight) {
	    	SnailMoving += 55; // 낮동안 55cm 올라감
	        DayCount++; // 일 수 증가

	        if (SnailMoving >= WellHeight) {
	        	break; // 달팽이가 우물 밖으로 나오면 반복 종료
	        }

	        SnailMoving -= 3; // 밤에 3cm 미끄러져 내려감
	    }

	    System.out.println(DayCount + "일");
	}
}

//		int depth = 300, height = 0;
//		final int up = 55;
//		final int down = 3;
//		int days = 0;
//		
//		while (true) {
//			days++;
//			height += up;
//			if(height >= depth) break;
//			days++;
//			height -= down;
//		}
//		System.out.println(days);

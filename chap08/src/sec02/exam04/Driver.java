package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle 변수가 참조하는 객체가 Bus 인지 조사
			Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제 타입 변환
			bus.checkFare(); // 해당 메서드를 호출하기 위해 강제 타입 변환함
		}
		vehicle.run();
	}
}
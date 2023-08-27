package sec02.exam04;

import sec02.exam03.Bus;
import sec02.exam03.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle ������ �����ϴ� ��ü�� Bus ���� ����
			Bus bus = (Bus) vehicle; // Bus ��ü�� ��� �����ϰ� ���� Ÿ�� ��ȯ
			bus.checkFare(); // �ش� �޼��带 ȣ���ϱ� ���� ���� Ÿ�� ��ȯ��
		}
		vehicle.run();
	}
}
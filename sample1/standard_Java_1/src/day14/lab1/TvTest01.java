package day14.lab1;

public class TvTest01 {
	public static void main(String[] args) {

		// LTV�� remote controller
		LTV user1 = new LTV();
		user1.on();
		user1.off();

		// STV�� remote controller
		STV user2 = new STV();
		user2.powerOn();
		user2.powerOff();

		// user1=new STV(); ���� �Ф�
		// ���о��� �ϳ��� ���������� �ڵ鸵�ϰ������...?
		// =>day14.lab2.Test02 ����!	
	}
}

class LTV {
	void on() {
		System.out.println("LTV power on");
	}

	void off() {
		System.out.println("LTV power off");
	}
}

class STV {
	void powerOn() {
		System.out.println("STV power on");
	}

	void powerOff() {
		System.out.println("STV power off");
	}
}
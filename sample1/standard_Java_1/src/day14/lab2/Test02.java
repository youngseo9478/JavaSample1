package day14.lab2;

public class Test02 {
	public static void main(String[] args) {
		TV user = null;
		
		//args�� �Է¾����� ��
		if (args.length==0){
			System.out.println("args���� �Է����ּ���");
			return;
		}
		
		//���� ���ε� (� ���� �Ѿ���Ŀ� ���� ��ü�� Ÿ���� �ٲ��)
		//��ü�� Ÿ���� �ٲ�� ������ �������̵��� �޼ҵ带 ����ϱ⶧����
		//�ش��ϴ� ������ ������ �� �ִ�. =>"������"
		if (args[0].equalsIgnoreCase("P")) {
			user = new PTV();
		} else if (args[0].equalsIgnoreCase("L")) {
			user = new LTV();
		} else if (args[0].equalsIgnoreCase("S")) {
			user = new STV();
		} else{
			System.out.println("���ǵ� Ŭ������ �������� �ʽ��ϴ�");
			return;
		}
		
		user.powerOn();
		user.powerOff();
	}
}

// ���� Ƽ�� ������鿡�� �޼ҵ� ������ ���� ���ڰ� ��� => �������̽��� ��� ��Ʈ�Ѱ�������
interface TV {
	void powerOn();

	void powerOff();
}

class LTV implements TV {
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + " powerOn()");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + " powerOff()");
	}
}

class STV implements TV {
	@Override
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + " powerOn()");
	}

	@Override
	public void powerOff() {
		System.out.println(getClass().getSimpleName() + " powerOff()");
	}
}

class PTV implements TV {
	public void powerOn() {
		System.out.println(getClass().getSimpleName() + " powerOn()");
	}

	public void powerOff() {
		System.out.println(getClass().getSimpleName() + " powerOff()");
	}
}

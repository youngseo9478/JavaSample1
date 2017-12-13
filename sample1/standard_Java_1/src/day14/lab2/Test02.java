package day14.lab2;

public class Test02 {
	public static void main(String[] args) {
		TV user = null;
		
		//args값 입력안했을 때
		if (args.length==0){
			System.out.println("args값을 입력해주세요");
			return;
		}
		
		//동적 바인딩 (어떤 값이 넘어오냐에 따라서 객체의 타입이 바뀐다)
		//객체의 타입이 바뀌면 각각의 오버라이딩된 메소드를 사용하기때문에
		//해당하는 동작을 수행할 수 있다. =>"다형성"
		if (args[0].equalsIgnoreCase("P")) {
			user = new PTV();
		} else if (args[0].equalsIgnoreCase("L")) {
			user = new LTV();
		} else if (args[0].equalsIgnoreCase("S")) {
			user = new STV();
		} else{
			System.out.println("정의된 클래스가 존재하지 않습니다");
			return;
		}
		
		user.powerOn();
		user.powerOff();
	}
}

// 여러 티비 제조사들에서 메소드 네임을 같게 하자고 약속 => 인터페이스로 모두 컨트롤가능해짐
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

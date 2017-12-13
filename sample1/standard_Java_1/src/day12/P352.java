package day12;

public class P352 {
	public static void main(String[] args) {
		// SingleTone()생성 불가
		// new SingleTone();

		// 이렇게는 생성자 생성 가능
		// 딱 한번만 생성하게 된다.
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
	}
}

class SingleTone {

	// 내부에서도 생성자 생성 가능
	private static SingleTone s = new SingleTone();

	// 생성자 함수의 private처리하면 SingleTone안에서만 생성가능해짐. P352에서 생성불가
	private SingleTone() {
		System.out.println("SingleTone() 생성");
	}

	public static SingleTone getInstance() {
		return s;
	}
}
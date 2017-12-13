package day14;

public class Test01 {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		// a=b; 타입이 달라서 에러=>부모타입으로 가면 어떨까?

		A c = new AA(); // A는 AA의 부모(인터페이스)
		c = new BB();
		// 이 상태론 a()밖에 사용 못함 (A,B,C 모두 부모라서 어느타입으로 선택할지 불편)
		// 인터페이스의 통합이 필요한 상황 => 인터페이스는 다중 상속이 가능하기때문에 통합 가능!

		// I f = new AA();
		I f = new CC();

		//AA,BB모두 a,b,c모두 구현하고 있는데 해당 타입으로 받으면 제한이 생긴다.
		//그래서 I로 통합인터페이스를 만들어서 a,b,c모두 사용가능하도록 만들어 준다.
		A[] aaa = { new AA(), new BB() }; 
		B[] bbb = { new AA(), new BB() };
		C[] ccc = { new AA(), new BB() };
		I[] iii2 = { new CC(), new BB() };
		
		// I[] iii = {new AA(), new BB()};
		// AA는 I를 상속받지 않았기 때문에 I의 자식이 아니다.
		// 그러므로 I타입에 AA클래스를 담을 수 없다.

		for (int i = 0; i < aaa.length; i++) {
			aaa[i].a(); // a만 가능
			bbb[i].b(); // b만 가능
			ccc[i].c(); // c만 가능

			// a,b,c 모두 가능
			iii2[i].a();
			iii2[i].b();
			iii2[i].c();
		}
	}
}

class AA extends Object implements A, B, C {

	@Override
	public void c() {

	}

	@Override
	public void b() {

	}

	@Override
	public void a() {

	}

}

class BB extends Object implements I {

	@Override
	public void c() {

	}

	@Override
	public void b() {

	}

	@Override
	public void a() {

	}

}

class CC implements I {

	@Override
	public void a() {
	}

	@Override
	public void b() {
	}

	@Override
	public void c() {
	}

}

// 인터페이스는 다중상속 가능 (인터페이스 통합이 목적)
interface I extends A, B, C {

}

interface A {
	void a();
}

interface B {
	void b();
}

interface C {
	void c();
}
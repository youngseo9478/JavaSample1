package day14;

public class Test01 {
	public static void main(String[] args) {
		AA a = new AA();
		BB b = new BB();
		// a=b; Ÿ���� �޶� ����=>�θ�Ÿ������ ���� ���?

		A c = new AA(); // A�� AA�� �θ�(�������̽�)
		c = new BB();
		// �� ���·� a()�ۿ� ��� ���� (A,B,C ��� �θ�� ���Ÿ������ �������� ����)
		// �������̽��� ������ �ʿ��� ��Ȳ => �������̽��� ���� ����� �����ϱ⶧���� ���� ����!

		// I f = new AA();
		I f = new CC();

		//AA,BB��� a,b,c��� �����ϰ� �ִµ� �ش� Ÿ������ ������ ������ �����.
		//�׷��� I�� �����������̽��� ���� a,b,c��� ��밡���ϵ��� ����� �ش�.
		A[] aaa = { new AA(), new BB() }; 
		B[] bbb = { new AA(), new BB() };
		C[] ccc = { new AA(), new BB() };
		I[] iii2 = { new CC(), new BB() };
		
		// I[] iii = {new AA(), new BB()};
		// AA�� I�� ��ӹ��� �ʾұ� ������ I�� �ڽ��� �ƴϴ�.
		// �׷��Ƿ� IŸ�Կ� AAŬ������ ���� �� ����.

		for (int i = 0; i < aaa.length; i++) {
			aaa[i].a(); // a�� ����
			bbb[i].b(); // b�� ����
			ccc[i].c(); // c�� ����

			// a,b,c ��� ����
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

// �������̽��� ���߻�� ���� (�������̽� ������ ����)
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
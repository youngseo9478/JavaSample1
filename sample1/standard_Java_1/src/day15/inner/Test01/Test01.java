package day15.inner.Test01;

public class Test01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A()); //A�� �ּҸ� �˷������
		b1.print();
	}
}

class A{
	String name = "A";
}

class B{
	
	//AŬ������ ����� ����� ������ �ּҰ� �־����
	A a; //���� �ּҴ� �������� ���� ����.. AŸ���� ���� �� �ִ� ������ ����
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	void print(){
//		System.out.println(name); //name�� �ּҸ� �𸣱⶧���� ���� �Ұ�
//		System.out.println(a.name); //get/set�� ���ٸ� nullPointException
		System.out.println(a.name); //main���� b������ A�� �ּҸ� �����߱⿡ ����
	}
}
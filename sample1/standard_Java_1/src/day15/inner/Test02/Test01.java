package day15.inner.Test02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();
		b.print();
		
		new A().pp(); //���� ���� ���
		
		//static �̸� Ŭ��������.�̳�Ŭ���� �ؼ� �����Ѵ�
		A.S s = new A.S();
		s.print();
		
	}
}

class A{
	String name = "A";
	void pp(){
		//B�� ���� print() ȣ���ϰ������? ��ü�����ϰ� �޼ҵ�ȣ��
		new B().print();
	}
	class B{
		void print(){
			System.out.println(name);
		}
	}
	static class S{
		void print(){
//			System.out.println(name); 
//			static�̶� �ν��Ͻ����� ��� �Ұ� => �ּҸ�
			System.out.println("~~~~~~~~~~~~~~~~");
		}
	}
}

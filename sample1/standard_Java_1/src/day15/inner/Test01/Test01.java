package day15.inner.Test01;

public class Test01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A()); //A의 주소를 알려줘야함
		b1.print();
	}
}

class A{
	String name = "A";
}

class B{
	
	//A클래스의 멤버를 맘대로 쓰려면 주소가 있어야함
	A a; //아직 주소는 배정되지 않은 상태.. A타입을 담을 수 있는 변수만 존재
	
	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	void print(){
//		System.out.println(name); //name의 주소를 모르기때문에 접근 불가
//		System.out.println(a.name); //get/set이 없다면 nullPointException
		System.out.println(a.name); //main에서 b를통해 A의 주소를 셋팅했기에 가능
	}
}
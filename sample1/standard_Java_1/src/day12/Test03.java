package day12;

import day12_access.A;

public class Test03{
	public static void main(String[] args) {
		A a = new A();
		//B b; 디폴트라 패키지가 달라서 쓸 수 없다.
	}
}


class C extends A{
	void print(){
	
	}
}
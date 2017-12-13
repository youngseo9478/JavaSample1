package day15.inner.Test02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();
		b.print();
		
		new A().pp(); //위와 같은 결과
		
		//static 이면 클래스네임.이너클래스 해서 접근한다
		A.S s = new A.S();
		s.print();
		
	}
}

class A{
	String name = "A";
	void pp(){
		//B가 가진 print() 호출하고싶으면? 객체생성하고 메소드호출
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
//			static이라서 인스턴스변수 사용 불가 => 주소모름
			System.out.println("~~~~~~~~~~~~~~~~");
		}
	}
}

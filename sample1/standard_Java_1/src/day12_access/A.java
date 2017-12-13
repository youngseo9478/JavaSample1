package day12_access;

public class A {
	//어디서든 볼 수 있다.
	public String name1 = "A";
	//다른패키지라도 상속관계라면 볼 수 있다.
	protected String name2 = "AA";
	//같은 패키지에서만 볼 수 있다.
	String name3 = "AAA"; //default
	//같은 패키지 다른 클래스에서는 name4는 볼 수 없다.
	private String name4 = "AAAA";
}

class B{
	A a;
	void print(){
	}
}
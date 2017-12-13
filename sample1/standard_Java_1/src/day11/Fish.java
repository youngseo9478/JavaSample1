package day11;

public class Fish extends Animal{

	String name ;
	
	public Fish() {
		super();
	}
	
	
	public Fish(String name) {
		super();
		this.name = name;
	}
	public Fish(String kind, String name) {
		super(kind);
//		super.setKind(kind); super();가 생략된 것.결국 위에 처럼 한줄로 처리하는게 효율적
		this.name = name;
	}

	//오버라이딩 하지 않아도 에러가 안남 (강제성이 없는 상태)
	@Override //컴파일타임을 지나도 사라지지않는 주석(선언부 다르면 알려줌,검증가능)
	public void breath(){
		System.out.println("아가미로 숨쉬기");
	}
	
	public void display(){
		System.out.printf("Fish[ %s %s ]%n",name, super.getKind());
	}
	
}

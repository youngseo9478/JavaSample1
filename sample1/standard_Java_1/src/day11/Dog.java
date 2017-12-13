package day11;

public class Dog extends Animal {

	String name;
	String kind = "강아지종류";
	
	public Dog() {
//		super(); 생략해도 무조건 갔다옴 
//		그래서 Animal에 디폴트생성자가 꼭! 존재해야한다(상속관계에서는 특히!).
	}
	public Dog(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}
	public Dog(String name, String kind, String superK) {
		super(superK); 
		//디폴트가 아닌 파라미터하나짜리 생성자함수를 수행시키면 아래 주석처리해놓은 코드와 같은 의미
//		super(); 위에서 생성자함수 수행했기때문에 디폴트 생성자는 수행되지 않게됨.
		this.name = name;
		this.kind = kind;
//		super.setKind(superK); 이렇게 해도 되지만 Animal클래스에 생성자를 통해서도 가능
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void display(){
		System.out.printf("Dog[ %s %s %s ]%n",super.getKind(),kind, name);
	}
	
}

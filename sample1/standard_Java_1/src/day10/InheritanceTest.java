package day10;

public class InheritanceTest {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		
		System.out.println("------------------");
		
		Dog d1 = new Dog();
		d1.breath();
		d1.bike();
		d1.display();
		System.out.println("-----------------");
		System.out.println(d1.name);
		System.out.println(d1.kind); //강아지종류
		System.out.println(((Animal)d1).kind); //동물의종류->((Animal)d1)->이렇게 괄호로 두번 애워쌈
		System.out.println("-----------------");
		//Is a 관계
//		new Dog(); 이렇게만 써도 메모리에 뜸 이 주소를 어떤것에 넣어줄지가 왼쪽에 오는 코드인 것
//		new Dog().breath();
//		그래서 .이용해서 안으로 들어갈 수 있다. 이것은 temporary변수! (일시적임)
		
		Animal e = new Dog();
		e.breath();
//		e.bike(); e의 주소로는 접근할 수 없는 메소드인 것.
		((Dog)e).bike(); //down casting 
		System.out.println(e.kind); //동물의종류
		
		System.out.println("---------------------");
		
		Fish f = new Fish();
		f.breath();
		System.out.println(f.kind);
//		Animal type으로 캐스팅 했는데...애니멀의 breath()가 피쉬의 메소드가 호출됨
		((Animal)f).breath();
//		애니멀의 메소드를 호출하고 싶다면 super쓰는 방법밖에 없다.그러나 여기는 main...
		
		
		
	}
}

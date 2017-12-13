package day10;

public class InheritanceTest2 {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();
		
		Animal ff = new Fish();
		ff.breath();//'폐'일 줄 알았는데 '아가미' ㅠㅠ 오버라이딩해서 자식메소드를 호출하기 때문..!
//		이는 곳 부모타입으로 선언해도 자식객체에 접근이 가능해진다는 얘기..?
	}
}

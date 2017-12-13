package day13;

public class ShapeTest {
	public static void main(String[] args) {
		
		Point p1 = new Point(10, 10);
		
		Circle c1 = new Circle("Red", p1, 3);
		
		System.out.println(c1);
		
		c1.draw();
		((Shape)c1).draw(); //윗줄과 똑같이 작동함(메소드 오버라이딩했기때문)
		
		Object obj = c1;
		System.out.println(obj); //toString이 오버라이딩되어있기때문에..Circle처럼나옴
		//toString, equals메소드는 Object타입의 메소드이므로 이후에 오버라이딩되면 
		//새로 작성된 포맷대로 출력된다.
	}
}

package day7;

public class MethodEx_ClacTest {
	public static void main(String[] args) {

		MethodEx_Clac calc1 = new MethodEx_Clac();
		MethodEx_Clac calc2 = new MethodEx_Clac();
		MethodEx_Clac calc3 = new MethodEx_Clac();
		
//		이렇게 해도 안에 static 메소드는 이미 메모리에 떠서 사용 가능
		MethodEx_Clac c1 = null;
		
//		공용으로 쓰는 경우에는 static으로 메소드를 만들어서 사용한다. static메소드는
//		인스턴스 메소드가 아님->클래스메소드! 그래서 객체명 사용 X, 클래스명사용
//		static은 heap영역의 데이터 끌어다 쓸 수 없다.
//		calc1.add(455,243);
//		calc2.add(455,243);
//		calc3.add(455,243);
		
		System.out.println(MethodEx_Clac.add(455, 243));
//		c1에 객체가 생성되지 않았어도 메소드가 static이라서 그냥 사용 가능
		System.out.println(c1.add(455, 243));

	}
}

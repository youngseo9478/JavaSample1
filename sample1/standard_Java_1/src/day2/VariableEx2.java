package day2;

public class VariableEx2 {
	public static void main(String[] args) {
//		float f = 55.8;
		float f = 55.8f;
		System.out.println(f);
		System.out.printf("f : %5.2f %n",f);
		System.out.println("==============");
//		참고로 아래와 같은 코드는 사용하지 말 것
//		객체생성을 하는 방법이기 때문에 성능저하에 원인
//		**스트링과 연산 하지 말기**
		System.out.println("f = "+f);
		
		//////////////////////////////////////
		
		System.out.println(5/2);
		System.out.println(5/2.);
		System.out.println(5./2);
	}
}

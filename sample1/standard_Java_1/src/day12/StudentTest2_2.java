package day12;

import java.util.Date;

public class StudentTest2_2 {
	
	// == : 값(주소가 곧 값인 것) 비교
	// .equals() : 주소를 찾아간 곳의 값 비교
	
	public static void main(String[] args) {
		String name = new String("java Test~~~");
		String name2 = new String("java Test~~~");
		System.out.println(name==name2); //false 주소값이 서로 달라서 값이 다르다고 false
		System.out.println(name.equals(name2)); //true 해당 주소에 담긴 값들이 서로 같다고 true
		// 원래 name은 주소를 담고 있어야하는데 String으로 출력됨
		// toString 메소드가 오버라이딩 되어 있기 때문이다.

		Date date = new Date();
		Date date2 = new Date();
		System.out.println(date==date2);//false
		System.out.println(date.equals(date2)); //true

		Student s = new Student("홍길동", 22, 1);
		Student s2 = new Student("홍길동", 22, 1);
		Student s3 = s2;
		System.out.println(s==s2);	//false
		System.out.println(s2==s3);	//f
		System.out.println(s.equals(s2)); //false
		System.out.println(s2.equals(s3)); //오버라이딩 전에는 false인데 이제 true
		System.out.println(s2.equals(date)); //다른 타입의 객체(주소)를 비교해도 된다. 물론 false
		
		// 이거는 주소가 찍힘 ->Student의 toString을 오버라이딩 하지 않았기때문

	}
}

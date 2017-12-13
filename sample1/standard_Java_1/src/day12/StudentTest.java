package day12;

import java.util.Date;

public class StudentTest {
	public static void main(String[] args) {
		String name = new String("java Test~~~");
		System.out.println(name);
		// 원래 name은 주소를 담고 있어야하는데 String으로 출력됨
		// toString 메소드가 오버라이딩 되어 있기 때문이다.

		Date date = new Date();
		System.out.println(date);

		Student s = new Student("홍길동", 22, 1);
		System.out.println(s);
		// 이거는 주소가 찍힘 ->Student의 toString을 오버라이딩 하지 않았기때문

		
	}
}

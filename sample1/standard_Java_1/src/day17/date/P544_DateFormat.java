package day17.date;

import java.util.Calendar;
import java.util.Date;

public class P544_DateFormat {

	// 모든 연산이 끝난 후에 format을 적용해준다.
	public static void main(String[] args) {

		String name = "홍길동";
		System.out.printf("%s, %s, %d, %.2f%n", name, "~~~~~~", 90, 5.5);

		String msg = String.format("%s, %s, %d, %.2f%n", name, "~~~~~~", 90, 5.5);
		System.out.println(msg);

		String df = String.format("%.15f", Math.PI);
		System.out.println(df);

		System.out.println();
		System.out.println("___________________________________");

		// 시스템기반 날짜정보
		// Date d = new Date();
		// Date d = new Date(2017,11,21); //대체기능으로 써라~ 이거쓰지마라
		// System.out.println(d);
		// System.out.println(d.getYear()); // 다른 메소드를 만들었으니 이제 이건 쓰지 말아라...
		// 기존에 앱에 영향주지않기위해 살려뒀을 뿐 새로운 대체 기능으로 사용하라고 밑줄 그어지는 것임

		// calendar는 new(생성자)로 객체생성 불가능! =>getInstance를 이용!
		// calendar는 abstract이라 직접 객체 생성이 불가능 한 것
		// ***MONTH 는 0~11로 관리되고있음을 주의!! set할때도 원하는 달의 -1로 표현해야하는것!
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar); // 그레고리엄 달력 기준
		System.out.println(calendar.get(calendar.YEAR));
		// calendar.set(2016, 10, 21);
		// System.out.println(calendar);
		// System.out.println(calendar.get(calendar.YEAR));

		System.out.println();
		System.out.println("___________________________________");

		df = String.format("%ty년 %tm월 %te일 %n ", calendar,calendar,calendar);
		System.out.println(df);
		df = String.format("%tY년 %tm월 %te일 %n ", calendar,calendar,calendar);
		System.out.println(df);
		//1$는 첫번째 변수를 의미하는 것! 여기서는 첫번째 자리에 있는 calendar라는 변수를 끌어다 쓴다는 의미
		df = String.format("%1$tY년 %1$tm월 %1$te일 %1$ta요일%n ", calendar);
		System.out.println(df);
		
		
		
	}

}

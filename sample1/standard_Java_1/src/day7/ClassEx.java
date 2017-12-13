package day7;

public class ClassEx {
	public static void main(String[] args) {
		int[] score;
		String name;

		// 이렇게하면 compile 타임에는 에러를 안내지만
		// null은 아직 주소가 배정되지 않았다는 의미이므로
		// nullPointerException을 발생시킨다.
		// Employee emp = null;

		// 메모리에 띄워야 Object가 된다. "Object==Instance==주소"
		// new는 객체를 생성해서 메모리를 갖게 해주는 것
		// new안해도 사용할 수 있는 자원은 static 자원, 아니면 instance 자원
		Employee emp = new Employee();
		emp.num = "001";
		emp.name = "홍길동";
		emp.dept = "기획부";
		emp.display();
		
		Employee emp2 = new Employee();
		emp2.num = "002";
		emp2.name = "고길동";
		emp2.dept = "개발부";
		emp2.display();
	}
}

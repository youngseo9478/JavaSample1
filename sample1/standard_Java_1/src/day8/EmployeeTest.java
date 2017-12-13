package day8;

public class EmployeeTest {
	public static void main(String[] args) {

		// 이렇게 하기가 너무 번거롭고 귀찮다! 생성자함수에서 초기화를 가능하게 해주자!
		// Employee emp1 = new Employee();
		// emp1.num="001";
		// emp1.name="홍길동";
		// emp1.dept="기획부";

		// overloading통해서 생성자 함수의 매개변수로 초기화하고싶은 데이터를 넣어준다.
		Employee emp1 = new Employee("홍길동", "001", "기획부");
		Employee emp2 = new Employee("이길동", "002", "개발부");
		Employee emp3 = new Employee("최길동", "003", "법무부");

		emp1.display();
		emp2.display();
		emp3.display();
	}
}

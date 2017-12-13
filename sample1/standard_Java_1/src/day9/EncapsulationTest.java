package day9;

public class EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationEx emp1 = new EncapsulationEx();
		
		emp1.setName("youngseo");
		emp1.setSalary(4000);
		emp1.setSsn("00000-00000");
		emp1.display();
		System.out.println(emp1.getSalary()*0.01);
		
	/*	
	 * private 변수는 이렇게 접근 불가(같은 클래스내에서만 접근 가능)
	 * emp1.name=	"홍길동";
		emp1.salary=50000;
		emp1.ssn = "111-11111";
		emp1.display();
		System.out.println(emp1.salary*0.01);*/
	}
}

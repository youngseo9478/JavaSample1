package day8;

/**********
 * 
 * @author youngseolous
 * @since 2017.11.08
 * 
 *
 */
// public 꼭 붙여야함
public class Employee {
	String name;
	String num;
	String dept;

	public Employee() {
		this("000","사원명","부서명");
//		System.out.println("Employee() 생성자 함수");
		
		
		/*아래 코드와 중복됨 생성자에서 다른 생성자를 불러줘야 함
		 * this.num="000";
		this.name="사원명";
		this.dept="부서명";*/
		
		
	}

	public Employee(String name, String num, String dept) {
		this.name = name;
		this.num = num;
		this.dept = dept;
	}

	// public 꼭 붙여야함
	/**
	 * Employee 정보 출력
	 */
	public void display() {
		System.out.printf("Employee[%s %s %s]\n", num, name, dept);
	}

}

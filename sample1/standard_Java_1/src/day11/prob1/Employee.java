package day11.prob1;

public class Employee extends Person {

	private String dept = "행정과";

	public Employee() {
		super();
	}

	public Employee(String dept) {
		super();
		this.dept = dept;
	}

	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void print() {
		System.out.printf("이름 : %s	 나이 : %d	 부    서 : %s%n", super.getName(), super.getAge(), dept);
	}// 그냥 getName()해도 자식에게 같은 이름의 메소드 없기때문에 person꺼를 갖다 쓰게 되어있음
}

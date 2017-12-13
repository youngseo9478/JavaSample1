package day11.prob1;

public class Employee extends Person {

	private String dept = "������";

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
		System.out.printf("�̸� : %s	 ���� : %d	 ��    �� : %s%n", super.getName(), super.getAge(), dept);
	}// �׳� getName()�ص� �ڽĿ��� ���� �̸��� �޼ҵ� ���⶧���� person���� ���� ���� �Ǿ�����
}

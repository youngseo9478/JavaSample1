package day8;

/**********
 * 
 * @author youngseolous
 * @since 2017.11.08
 * 
 *
 */
// public �� �ٿ�����
public class Employee {
	String name;
	String num;
	String dept;

	public Employee() {
		this("000","�����","�μ���");
//		System.out.println("Employee() ������ �Լ�");
		
		
		/*�Ʒ� �ڵ�� �ߺ��� �����ڿ��� �ٸ� �����ڸ� �ҷ���� ��
		 * this.num="000";
		this.name="�����";
		this.dept="�μ���";*/
		
		
	}

	public Employee(String name, String num, String dept) {
		this.name = name;
		this.num = num;
		this.dept = dept;
	}

	// public �� �ٿ�����
	/**
	 * Employee ���� ���
	 */
	public void display() {
		System.out.printf("Employee[%s %s %s]\n", num, name, dept);
	}

}

package day8;

public class EmployeeTest {
	public static void main(String[] args) {

		// �̷��� �ϱⰡ �ʹ� ���ŷӰ� ������! �������Լ����� �ʱ�ȭ�� �����ϰ� ������!
		// Employee emp1 = new Employee();
		// emp1.num="001";
		// emp1.name="ȫ�浿";
		// emp1.dept="��ȹ��";

		// overloading���ؼ� ������ �Լ��� �Ű������� �ʱ�ȭ�ϰ���� �����͸� �־��ش�.
		Employee emp1 = new Employee("ȫ�浿", "001", "��ȹ��");
		Employee emp2 = new Employee("�̱浿", "002", "���ߺ�");
		Employee emp3 = new Employee("�ֱ浿", "003", "������");

		emp1.display();
		emp2.display();
		emp3.display();
	}
}

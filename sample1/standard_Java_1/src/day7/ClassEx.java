package day7;

public class ClassEx {
	public static void main(String[] args) {
		int[] score;
		String name;

		// �̷����ϸ� compile Ÿ�ӿ��� ������ �ȳ�����
		// null�� ���� �ּҰ� �������� �ʾҴٴ� �ǹ��̹Ƿ�
		// nullPointerException�� �߻���Ų��.
		// Employee emp = null;

		// �޸𸮿� ����� Object�� �ȴ�. "Object==Instance==�ּ�"
		// new�� ��ü�� �����ؼ� �޸𸮸� ���� ���ִ� ��
		// new���ص� ����� �� �ִ� �ڿ��� static �ڿ�, �ƴϸ� instance �ڿ�
		Employee emp = new Employee();
		emp.num = "001";
		emp.name = "ȫ�浿";
		emp.dept = "��ȹ��";
		emp.display();
		
		Employee emp2 = new Employee();
		emp2.num = "002";
		emp2.name = "��浿";
		emp2.dept = "���ߺ�";
		emp2.display();
	}
}

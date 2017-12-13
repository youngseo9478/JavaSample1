package day11.prob1;

public class Test_Inheritance {
	public static void main(String[] args) {

		Object s = new Student("ȫ�浿", 20, 1);
		if (s instanceof Student)
			((Student) s).print();
		s = "Hello"; // ������Ʈ Ÿ���� ��� Ÿ���� ���� �� ����. String��ü�� ������
		if (s instanceof Student)
			((Student) s).print();
		// s�� ���� ���ڿ���ü�� �ּҸ� ������ �����Ƿ� ����ó�� ĳ������ �� �����Ƿ� ���X

		String name = "OOO";
		Student s1 = new Student("�浿", 20, 1);
		Teacher t1 = new Teacher("ȫ��", 40, "java");
		Employee e1 = new Employee("ȫ�浿", 44, "������");
		// Person ��ü(�ּ�)�� ������ ���� �� �ִ� �迭. name�� StringŸ���̴ϱ� PersonŸ�� X =>ERROR!
		// Person[] p {name, s1, t1, e1};
		Person[] p = { s1, t1, e1, new Student("��浿", 28, 3) };
		// ���� p ���� Ÿ���� �ٸ� ��ü���� ����ִ�. ������ ��ü���� ������ ��� ������
		// ��ü���� �����ϰ� �ִ� print()�޼ҵ尡 �ٸ���.
		// ��� �ϸ� �ش��ϴ� print()�� ȣ���� �� ������?

		// 1. instanceof ����ؼ� �����ذ�
		// if���ȿ��� ���� �ε����� � Ÿ���� ��ü�� �����ִ��� ���ǽ��� ���� �Ǻ��� ����
		// �ش��ϴ� ��ü�� print()�޼ҵ带 ����ϵ��� ����
		System.out.println("***********************************************");
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Student)
				((Student) p[i]).print();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).print();
			if (p[i] instanceof Employee)
				((Employee) p[i]).print();
		}
		// 2. Overriding ���ؼ� �����ذ�
		// PersonŸ�Կ� print()�޼ҵ带 ����� ���� �ڽ�Ŭ�������� �������̵��ؼ� ����ϸ�
		// 1�� ���� �����ϴ� ���� �� �� �ִ�. (�� �����ϰ� ȿ����)
		System.out.println("***********************************************");
		for (int i = 0; i < p.length; i++) {
			p[i].print();
		}
		System.out.println("***********************************************");
		Person pp = s1;
		pp.print();

		System.out.println("***********************************************");
		// Object�� �ּҸ� ��� �迭�̹Ƿ� � ���̵� ���� �� ����
		Object[] obj = { name, s1, t1, e1 };
		// obj�߿� personŸ���� �͸� print() �Ϸ���?
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof Person)
				((Person) obj[i]).print();
			// �������̵��Ǿ��־ person���� ĳ�����ϸ� ��
		}

	}
}

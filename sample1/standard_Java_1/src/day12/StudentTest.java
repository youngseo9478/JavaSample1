package day12;

import java.util.Date;

public class StudentTest {
	public static void main(String[] args) {
		String name = new String("java Test~~~");
		System.out.println(name);
		// ���� name�� �ּҸ� ��� �־���ϴµ� String���� ��µ�
		// toString �޼ҵ尡 �������̵� �Ǿ� �ֱ� �����̴�.

		Date date = new Date();
		System.out.println(date);

		Student s = new Student("ȫ�浿", 22, 1);
		System.out.println(s);
		// �̰Ŵ� �ּҰ� ���� ->Student�� toString�� �������̵� ���� �ʾұ⶧��

		
	}
}

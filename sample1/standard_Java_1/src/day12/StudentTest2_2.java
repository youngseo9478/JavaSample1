package day12;

import java.util.Date;

public class StudentTest2_2 {
	
	// == : ��(�ּҰ� �� ���� ��) ��
	// .equals() : �ּҸ� ã�ư� ���� �� ��
	
	public static void main(String[] args) {
		String name = new String("java Test~~~");
		String name2 = new String("java Test~~~");
		System.out.println(name==name2); //false �ּҰ��� ���� �޶� ���� �ٸ��ٰ� false
		System.out.println(name.equals(name2)); //true �ش� �ּҿ� ��� ������ ���� ���ٰ� true
		// ���� name�� �ּҸ� ��� �־���ϴµ� String���� ��µ�
		// toString �޼ҵ尡 �������̵� �Ǿ� �ֱ� �����̴�.

		Date date = new Date();
		Date date2 = new Date();
		System.out.println(date==date2);//false
		System.out.println(date.equals(date2)); //true

		Student s = new Student("ȫ�浿", 22, 1);
		Student s2 = new Student("ȫ�浿", 22, 1);
		Student s3 = s2;
		System.out.println(s==s2);	//false
		System.out.println(s2==s3);	//f
		System.out.println(s.equals(s2)); //false
		System.out.println(s2.equals(s3)); //�������̵� ������ false�ε� ���� true
		System.out.println(s2.equals(date)); //�ٸ� Ÿ���� ��ü(�ּ�)�� ���ص� �ȴ�. ���� false
		
		// �̰Ŵ� �ּҰ� ���� ->Student�� toString�� �������̵� ���� �ʾұ⶧��

	}
}

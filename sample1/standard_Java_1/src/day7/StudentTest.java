package day7;

public class StudentTest {
	public static void main(String[] args) {

//		������ 3�������� 100���̶�� �ϸ� Ŭ���� �迭�� ����ϴ°� ȿ����!
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.naming("ȫ�浿");
		student2.naming("��浿");
		student3.naming("�̱浿");
		
//		������ �ٷ� �����ϴ� ���
//		student1.score=new int[] {88,76,49};
		
//		�޼ҵ带 �̿��� �����ϴ� ���
		student1.score(new int[] {88,89,69});
		student2.score(new int[] {98,49,77});
		student3.score(new int[] {44,89,67});
		
		student1.process();
		student2.process();
		student3.process();
		
		student1.display();
		student2.display();
		student3.display();
		
	}
}

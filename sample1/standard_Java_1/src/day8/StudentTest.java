package day8;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("������", "ComputerScience", 3.5);
		Student student2 = new Student("�����", "Music", 4.0);
		Student student3 = new Student("�迬��", "Dance", 4.5);
		
		student1.display();
		student2.display();
		student3.display();
	}
}

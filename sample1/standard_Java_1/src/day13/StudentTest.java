package day13;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student("A", 9);
		System.out.println(s);
		System.out.println(s.getClass());
		Student s1 = s;
		System.out.println(s.equals(s1));
		s1 = null;
		System.out.println(s.equals(s1));

		Student[] students = { s, new Student("B", 1), new Student()};
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
//			System.out.println(students[i].toString()); 이거랑 같은거!
		}
	}
}

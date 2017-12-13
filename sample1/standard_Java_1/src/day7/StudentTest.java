package day7;

public class StudentTest {
	public static void main(String[] args) {

//		지금은 3명이지만 100명이라고 하면 클래스 배열을 사용하는게 효율적!
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.naming("홍길동");
		student2.naming("고길동");
		student3.naming("이길동");
		
//		변수에 바로 대입하는 방법
//		student1.score=new int[] {88,76,49};
		
//		메소드를 이용해 접근하는 방법
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

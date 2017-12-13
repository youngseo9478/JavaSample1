package day8;

public class Student {

	String name;
	String major;
	double score;

	public Student() {
		this("OOO", "OO전공", 0.0);
	}

	public Student(String name, String major, double score) {
		this.name = name;
		this.major = major;
		this.score = score;
	}

	public void display() {
		System.out.println("=========학생 정보==========");
		System.out.printf("이름 : %s\n전공 : %s\n학점 : %.1f\n", name, major, score);
		System.out.println("============================");
	}
}

package day8;

public class Student {

	String name;
	String major;
	double score;

	public Student() {
		this("OOO", "OO����", 0.0);
	}

	public Student(String name, String major, double score) {
		this.name = name;
		this.major = major;
		this.score = score;
	}

	public void display() {
		System.out.println("=========�л� ����==========");
		System.out.printf("�̸� : %s\n���� : %s\n���� : %.1f\n", name, major, score);
		System.out.println("============================");
	}
}

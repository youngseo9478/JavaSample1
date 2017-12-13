package day7;

import java.util.Scanner;

public class StudentTest2 {
	public static void main(String[] args) {
		// Student[] student = new Student[5];

		// 배열 선언과 생성을 동시에 하는 방법
		Student[] student = {

				new Student(), new Student(), new Student() };

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < student.length; i++) {

			System.out.println("학생 이름을 입력해주세요");
			student[i].naming(sc.nextLine());

			System.out.println("학생의 성적을 입력해주세요. (000 000 000)");
			String[] num = new String[3];
			num = sc.nextLine().split(" ");

			for (int j = 0; j < num.length; j++) {
				student[i].score[j] = Integer.parseInt(num[j]);
			}
		}
		sc.close();

		for (int i = 0; i < student.length; i++) {
			student[i].process();
			student[i].display();
		}
	}
}

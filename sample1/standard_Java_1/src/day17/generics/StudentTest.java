package day17.generics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import day17.generics.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[100];
		int count = 0;

		try (Scanner sc = new Scanner(new File("student.txt"))) {

			while (sc.hasNextLine()) {
				String readLine = sc.nextLine();
				String[] data = readLine.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;
			}

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("student.txt 파일을 준비하세요...");
			}
			System.out.println(e.getMessage());
		} finally {
		}

		try {
			Arrays.sort(students, 0, count); // comparable의 자식이 아니라서 안됌 sort
		} catch (ClassCastException e) {
			System.out.println("정렬 기준키 설정이 필요합니다.");
		}

		/*
		 * if (students instanceof Comparable) { Arrays.sort(students); }
		 */

		for (int i = 0; i < count; i++) {
			System.out.println(students[i]);
			System.out.println("____________________________");
		}
		String[] i = { "j", "a", "f" };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));

		System.out.println();
		System.out.println("_______main end________");
	}
}


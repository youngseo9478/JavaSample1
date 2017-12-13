package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest02 {
	public static void main(String[] args) {
		// 학번, 이름
		Map<Integer, Student> students = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Student[] s = { 
				new Student(20132323, "홍길동", "영문과"), 
				new Student(20124356, "이길동", "전기공학과"),
				new Student(20102223, "박길동", "식품영양과"), 
				new Student(20103324, "최길동", "간호학과"),
				new Student(20175463, "임길동", "체육교육과"), 
				new Student(20165465, "원길동", "예술과"),
				new Student(20131234, "김길동", "컴퓨터과"), 
				new Student(20151437, "서길동", "국문과") 
		};

		for (int i = 0; i < s.length; i++) {
			students.put(s[i].getNum(), s[i]);
		}

		while (true) {
			String check = "";
			System.out.println("[OO대학 정보조회]");
			System.out.println("1.전체 재학생 조회");
			System.out.println("2.나의 정보 조회");
			System.out.println("3.끝내기");
			System.out.println("____________");
			System.out.print("선택하세요_");
			check = sc.nextLine().trim();
			if (check.equals("1")) {
				System.out.println();
				System.out.println("[전체 재학생 조회]");
				Set<Integer> keys = students.keySet();
				Iterator<Integer> it = keys.iterator();
				while (it.hasNext()) {
					int num = it.next();
					System.out.printf("%d 학번/%s/%s%n", num, students.get(num).name, students.get(num).dept);
				}
				System.out.println();
			} else if (check.equals("2")) {
				System.out.println();
				System.out.println("[나의 정보 조회]");
				System.out.print("학번을 입력해주세요_");
				int num = Integer.parseInt(sc.nextLine().trim());
				if (students.containsKey(num)) {
					System.out.printf("%d 학번/%s/%s%n", num, students.get(num).name, students.get(num).dept);
					System.out.println();
				} else {
					System.out.println("존재하지 않는 학번 입니다.");
					System.out.println();
				}
			} else if (check.equals("3")) {
				break;
			} else {
				System.out.println("1,2,3 중에 선택해 주세요.");
				System.out.println();
			}
		}
	}
}

class Student {

	int num;
	String dept;
	String name;

	public Student() {
		number();
	}

	public int number() {
		return num;
	}

	public Student(int num, String dept, String name) {
		super();
		this.num = num;
		this.dept = dept;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
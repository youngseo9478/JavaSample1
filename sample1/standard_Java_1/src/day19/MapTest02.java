package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest02 {
	public static void main(String[] args) {
		// �й�, �̸�
		Map<Integer, Student> students = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Student[] s = { 
				new Student(20132323, "ȫ�浿", "������"), 
				new Student(20124356, "�̱浿", "������а�"),
				new Student(20102223, "�ڱ浿", "��ǰ�����"), 
				new Student(20103324, "�ֱ浿", "��ȣ�а�"),
				new Student(20175463, "�ӱ浿", "ü��������"), 
				new Student(20165465, "���浿", "������"),
				new Student(20131234, "��浿", "��ǻ�Ͱ�"), 
				new Student(20151437, "���浿", "������") 
		};

		for (int i = 0; i < s.length; i++) {
			students.put(s[i].getNum(), s[i]);
		}

		while (true) {
			String check = "";
			System.out.println("[OO���� ������ȸ]");
			System.out.println("1.��ü ���л� ��ȸ");
			System.out.println("2.���� ���� ��ȸ");
			System.out.println("3.������");
			System.out.println("____________");
			System.out.print("�����ϼ���_");
			check = sc.nextLine().trim();
			if (check.equals("1")) {
				System.out.println();
				System.out.println("[��ü ���л� ��ȸ]");
				Set<Integer> keys = students.keySet();
				Iterator<Integer> it = keys.iterator();
				while (it.hasNext()) {
					int num = it.next();
					System.out.printf("%d �й�/%s/%s%n", num, students.get(num).name, students.get(num).dept);
				}
				System.out.println();
			} else if (check.equals("2")) {
				System.out.println();
				System.out.println("[���� ���� ��ȸ]");
				System.out.print("�й��� �Է����ּ���_");
				int num = Integer.parseInt(sc.nextLine().trim());
				if (students.containsKey(num)) {
					System.out.printf("%d �й�/%s/%s%n", num, students.get(num).name, students.get(num).dept);
					System.out.println();
				} else {
					System.out.println("�������� �ʴ� �й� �Դϴ�.");
					System.out.println();
				}
			} else if (check.equals("3")) {
				break;
			} else {
				System.out.println("1,2,3 �߿� ������ �ּ���.");
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
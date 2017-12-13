package day17.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();

		 ArrayList<Student> list = new ArrayList<Student>();



		// 리스트는 중복허용하니까 이게 가능(근데 보통 중복된 값을 관리하지는 않는다=>primary key 존재)
		list.add(new Student("고길동", 90, 99));
		list.add(new Student("이길동", 90, 99));
		list.add(new Student("박길동", 90, 99));
		list.add(new Student("김길동", 90, 99));
		list.add(new Student("홍길동", 90, 99));
		list.add(new Student("홍길동5", 90, 99));
		list.add(new Student("홍길동1", 90, 99));
		list.add(new Student("홍길동8", 90, 99));
		list.add(new Student("홍길동2", 90, 99));

		// list.remove(0);
		// System.out.println(list);
		// //주소를 이용해 remove하는 방법...
		// list.remove(list.get(1));

		System.out.println("____________1.index구하기_____________");
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			Student data = list.get(i);
			// data.avg();

			// 삭제하는 순간 size에 변화가 생겨서 문제발생
			// list.remove(data);
			// System.out.println(list.size());

			if (data.name.equals("이길동")) {
				index = i;
			}
		}
		// list.remove(index);
		System.out.println(list);
		System.out.println();
		System.out.println();
		System.out.println("____________2.새로운 for문 사용_____________");
		// 새로운 for문
		for (Student data : list) {
			data.avg();
			// list.remove(data); remove하면 인덱스를 정확히 알아야 해서 오류날 확률이 많아진다....
			// iterator를 써야하는 것.
			System.out.println(data);
		}
		System.out.println();
		System.out.println();
		System.out.println("_____________3. Iterator 사용____________");

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			data.avg();
			System.out.println(data.name.contains("홍길동"));
			if (data.name.equals("홍길동")) {
				it.remove();
				System.out.println("홍길동 삭제했습니다.");
				break; // return;하면 main자체가 종료됨..
			}
			if (it.hasNext() == false && data.name.equals("홍길동")) {
				System.out.println("홍길동은 존재하지 않는 데이터입니다.");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("___________4.contains사용(Student의 equals() override___________");
		System.out.println("******");
		System.out.println(list.contains(new Student("박길동", 90, 99)));
		System.out.println("******");

		System.out.println();
		System.out.println();
		System.out.println("___________5.sorting method___________");
		// ArrayList를 배열로 바꾸는 것이 가능하다
		// Arrays.sort메소드는 배열밖에 다룰 수 없다
		// temp를 정렬할 뿐 list가 정렬되지는 않는다.
		Student[] temp = (Student[]) list.toArray();
		
		Arrays.sort(temp);

		// list가 정렬된다 =>Student에 implements comparable을 해서 compareTo를 오버라이딩해야한다.
		Collections.sort(list); // list를 정렬하려면 ArrayList자체를 소트해야 정렬이 변경됨

		for (Student data : list) {
			System.out.println(data);
		}
	}
}

class Student implements Comparable<Student> {
	String name;
	int ko;
	int math;
	double avg;

	public Student() {
		super();
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	public void avg() {
		avg = (ko + math) / 2.0;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	// 여기서 avg()까지 포함시켜버리면 문제가 발생하게됨
	// 연산 전과 후에 결과가 다르기 때문에 서로 다르다라고 인식하게됨
	// 적절하게 넣고 빼고 해야한다.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}
}
package day17.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();


		List<Student> list = new Vector<Student>();
		// ArrayList와 Vector모두 List의 자식이라 이렇게 해도 같은 결과!
		// Vector와 ArrayList는 거의 똑같이 작동한다(내부적으로 차이는 있다)

		// 리스트는 중복허용하니까 이게 가능(근데 보통 중복된 값을 관리하지는 않는다=>primary key 존재)
		list.add(new Student("이길동", 90, 99));
		list.add(new Student("고길동", 90, 99));
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
//		Student[] temp = (Student[]) list.toArray();
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2);
		Arrays.sort(temp2);
		System.out.println(Arrays.toString(temp2));
		//list는 정렬되지않고 temp2만 정렬되는 것~ list는 건드리지않음
		
		System.out.println();
		System.out.println();
		System.out.println("___________6.Collection sorting method___________");
		// list가 정렬된다 =>Student에 implements comparable을 해서 compareTo를 오버라이딩해야한다.
//		Collections.sort(list); // list를 정렬하려면 ArrayList자체를 소트해야 정렬이 변경됨

		for (Student data : list) {
			System.out.println(data);
		}
	}
}


package day17.collection;

import java.util.ArrayList;

import day17.generics.Student;

public class ArrayListTest {
	public static void main(String[] args) {
		int[] i;
		String[] s;
		Student[] ss;
		Object[] obj;

		ArrayList list1 = new ArrayList(); // Object(무엇이든 가능)
		//get메소드 이용해서 데이터 빼오면 모두 오브젝트타입이기때문에 다운캐스팅이 필요=>불편 ㅠㅠ
		list1.add(new Student("hong", 23));
		list1.add("hello java");
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(((String)list1.get(1)).toUpperCase());
		
		ArrayList<String> list2 = new ArrayList<String>(); // String만 가능
		//이제 이 어레이리스트는 스트링타입만 가능하기때문에 get해도 string타입으로 나오게 됨(캐스팅X)
		for (int j = 0; j < 200; j++) {
			list2.add("test "+j);
		}
		list2.add(3, "error");
		list2.remove(1);
		list2.remove("test 0");
		System.out.println(list2);
		System.out.println(list2.size());
		for (int j = 0; j < list2.size(); j++) {
//			System.out.println(list2.get(j).substring(list2.get(j).length()-2));
			System.out.println(list2.get(j).toUpperCase());
		}
		System.out.println(list2.get(0).charAt(0));
		
		
	}
}

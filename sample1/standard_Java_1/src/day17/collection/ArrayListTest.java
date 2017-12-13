package day17.collection;

import java.util.ArrayList;

import day17.generics.Student;

public class ArrayListTest {
	public static void main(String[] args) {
		int[] i;
		String[] s;
		Student[] ss;
		Object[] obj;

		ArrayList list1 = new ArrayList(); // Object(�����̵� ����)
		//get�޼ҵ� �̿��ؼ� ������ ������ ��� ������ƮŸ���̱⶧���� �ٿ�ĳ������ �ʿ�=>���� �Ф�
		list1.add(new Student("hong", 23));
		list1.add("hello java");
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(((String)list1.get(1)).toUpperCase());
		
		ArrayList<String> list2 = new ArrayList<String>(); // String�� ����
		//���� �� ��̸���Ʈ�� ��Ʈ��Ÿ�Ը� �����ϱ⶧���� get�ص� stringŸ������ ������ ��(ĳ����X)
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

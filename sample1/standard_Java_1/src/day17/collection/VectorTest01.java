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
		// ArrayList�� Vector��� List�� �ڽ��̶� �̷��� �ص� ���� ���!
		// Vector�� ArrayList�� ���� �Ȱ��� �۵��Ѵ�(���������� ���̴� �ִ�)

		// ����Ʈ�� �ߺ�����ϴϱ� �̰� ����(�ٵ� ���� �ߺ��� ���� ���������� �ʴ´�=>primary key ����)
		list.add(new Student("�̱浿", 90, 99));
		list.add(new Student("��浿", 90, 99));
		list.add(new Student("�ڱ浿", 90, 99));
		list.add(new Student("��浿", 90, 99));
		list.add(new Student("ȫ�浿", 90, 99));
		list.add(new Student("ȫ�浿5", 90, 99));
		list.add(new Student("ȫ�浿1", 90, 99));
		list.add(new Student("ȫ�浿8", 90, 99));
		list.add(new Student("ȫ�浿2", 90, 99));

		// list.remove(0);
		// System.out.println(list);
		// //�ּҸ� �̿��� remove�ϴ� ���...
		// list.remove(list.get(1));

		System.out.println("____________1.index���ϱ�_____________");
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			Student data = list.get(i);
			// data.avg();

			// �����ϴ� ���� size�� ��ȭ�� ���ܼ� �����߻�
			// list.remove(data);
			// System.out.println(list.size());

			if (data.name.equals("�̱浿")) {
				index = i;
			}
		}
		// list.remove(index);
		System.out.println(list);
		System.out.println();
		System.out.println();
		System.out.println("____________2.���ο� for�� ���_____________");
		// ���ο� for��
		for (Student data : list) {
			data.avg();
			// list.remove(data); remove�ϸ� �ε����� ��Ȯ�� �˾ƾ� �ؼ� ������ Ȯ���� ��������....
			// iterator�� ����ϴ� ��.
			System.out.println(data);
		}
		System.out.println();
		System.out.println();
		System.out.println("_____________3. Iterator ���____________");

		Iterator<Student> it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			data.avg();
			System.out.println(data.name.contains("ȫ�浿"));
			if (data.name.equals("ȫ�浿")) {
				it.remove();
				System.out.println("ȫ�浿 �����߽��ϴ�.");
				break; // return;�ϸ� main��ü�� �����..
			}
			if (it.hasNext() == false && data.name.equals("ȫ�浿")) {
				System.out.println("ȫ�浿�� �������� �ʴ� �������Դϴ�.");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("___________4.contains���(Student�� equals() override___________");
		System.out.println("******");
		System.out.println(list.contains(new Student("�ڱ浿", 90, 99)));
		System.out.println("******");

		System.out.println();
		System.out.println();
		System.out.println("___________5.sorting method___________");
		// ArrayList�� �迭�� �ٲٴ� ���� �����ϴ�
		// Arrays.sort�޼ҵ�� �迭�ۿ� �ٷ� �� ����
		// temp�� ������ �� list�� ���ĵ����� �ʴ´�.
//		Student[] temp = (Student[]) list.toArray();
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2);
		Arrays.sort(temp2);
		System.out.println(Arrays.toString(temp2));
		//list�� ���ĵ����ʰ� temp2�� ���ĵǴ� ��~ list�� �ǵ帮������
		
		System.out.println();
		System.out.println();
		System.out.println("___________6.Collection sorting method___________");
		// list�� ���ĵȴ� =>Student�� implements comparable�� �ؼ� compareTo�� �������̵��ؾ��Ѵ�.
//		Collections.sort(list); // list�� �����Ϸ��� ArrayList��ü�� ��Ʈ�ؾ� ������ �����

		for (Student data : list) {
			System.out.println(data);
		}
	}
}


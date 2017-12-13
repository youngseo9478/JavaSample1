package day17.date;

import java.util.Calendar;
import java.util.Date;

public class P544_DateFormat {

	// ��� ������ ���� �Ŀ� format�� �������ش�.
	public static void main(String[] args) {

		String name = "ȫ�浿";
		System.out.printf("%s, %s, %d, %.2f%n", name, "~~~~~~", 90, 5.5);

		String msg = String.format("%s, %s, %d, %.2f%n", name, "~~~~~~", 90, 5.5);
		System.out.println(msg);

		String df = String.format("%.15f", Math.PI);
		System.out.println(df);

		System.out.println();
		System.out.println("___________________________________");

		// �ý��۱�� ��¥����
		// Date d = new Date();
		// Date d = new Date(2017,11,21); //��ü������� ���~ �̰ž�������
		// System.out.println(d);
		// System.out.println(d.getYear()); // �ٸ� �޼ҵ带 ��������� ���� �̰� ���� ���ƶ�...
		// ������ �ۿ� ���������ʱ����� ������� �� ���ο� ��ü ������� ����϶�� ���� �׾����� ����

		// calendar�� new(������)�� ��ü���� �Ұ���! =>getInstance�� �̿�!
		// calendar�� abstract�̶� ���� ��ü ������ �Ұ��� �� ��
		// ***MONTH �� 0~11�� �����ǰ������� ����!! set�Ҷ��� ���ϴ� ���� -1�� ǥ���ؾ��ϴ°�!
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar); // �׷����� �޷� ����
		System.out.println(calendar.get(calendar.YEAR));
		// calendar.set(2016, 10, 21);
		// System.out.println(calendar);
		// System.out.println(calendar.get(calendar.YEAR));

		System.out.println();
		System.out.println("___________________________________");

		df = String.format("%ty�� %tm�� %te�� %n ", calendar,calendar,calendar);
		System.out.println(df);
		df = String.format("%tY�� %tm�� %te�� %n ", calendar,calendar,calendar);
		System.out.println(df);
		//1$�� ù��° ������ �ǹ��ϴ� ��! ���⼭�� ù��° �ڸ��� �ִ� calendar��� ������ ����� ���ٴ� �ǹ�
		df = String.format("%1$tY�� %1$tm�� %1$te�� %1$ta����%n ", calendar);
		System.out.println(df);
		
		
		
	}

}

package day4;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		char gender;
		String regNo;
		Scanner scanner = new Scanner(System.in);

		// ���ø� ������ ��ȿ�� �����͸� �Է����� ���� �� ����
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���[��999999-9999999]:");
		regNo = scanner.nextLine();
		scanner.close();

		// ��ȿ������(�ܼ��� 14���ڰ� �Ǵ����� �����غ����)
		if (regNo.length() != 14) {
			System.out.println("�ֹε�Ϲ�ȣ ���� ����");
			return;
		}
		
		// regNo[7]�� ǥ���ϴ� ����� charAt
		gender = regNo.charAt(7);
		System.out.println(regNo + "=>" + gender);// 1 2 3 4

//		if����
		if (gender == '1' || gender == '3') {
			System.out.println("����");
		} else if (gender == '2' || gender == '4') {
			System.out.println("����");
		} else {
			System.out.println("��ϵ������� �ֹε�Ϲ�ȣ�Դϴ�");
		}
		
//		switch����
		switch (gender) {
		case '1':
		case '3':
			System.out.println("����");
			break;
		case '2':
		case '4':
			System.out.println("����");
			break;
		default:
			System.out.println("��ϵ������� �ֹε�Ϲ�ȣ�Դϴ�");
		}
		

	}
}

package day4;

import java.util.Scanner;

public class SwitchEx2_Menu {
	public static void main(String[] args) {

		String command;
//		��ĳ�� ��ü�� �ݺ��� �ȿ� ������ �����߻�! 
//		��� �ٸ� �ּҿ� ��ĳ�� ��ü�� �����ϰ� �Ǵ� ��!
//		�ۿ��� �����س��� �ȿ����� �̿븸 �ϴ� ��
		Scanner scanner = new Scanner(System.in);; 
		
		while (true) {
			System.out.println("******************OOO���α׷�******************\n");
			System.out.println("1. insert\n");
			System.out.println("2. delete\n");
			System.out.println("3. update\n");
			System.out.println("4. quit\n");
			System.out.println("***********************************************");
			System.out.println("���Ͻô� �۾��� �̸��̳� ��ȣ�� �Է����ּ���\n");

			command = scanner.nextLine();

			switch (command) {
			case "insert":
			case "1":
				System.out.println("��ϵǾ����ϴ�.\n");
				break;
			case "delete":
			case "2":
				System.out.println("�����Ǿ����ϴ�.\n");
				break;
			case "update":
			case "3":
				System.out.println("������Ʈ�Ǿ����ϴ�.\n");
				break;
			case "quit":
			case "4":
				System.out.println("����Ǿ����ϴ�.\n");
				System.exit(0);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n");
			}
			if(command=="4"||command=="quit") break;
		}
//		[��������] : �ݺ����ȿ��� ��� ��ĳ�ʸ� �̿��ؾ��ϱ⶧����
//		�ݺ����ȿ��� ��ĳ�ʸ� �ݾƹ����� �ȵȴ�. ��� �۾��� ���� ��!
		scanner.close();
	}
}

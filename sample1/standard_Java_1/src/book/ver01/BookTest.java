package book.ver01;

import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {

		Book[] books = { new Book("�ڹ�������", 30000), new Book("java", 15000), new Book("sql", 22000) };
		Book[] books2 = { new Book("��Ǭ��", 30000), new Book("������", 17000), new Book("QA", 20000) };
		BookMgr manager = new BookMgr(books);

		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean flag = true;

		String title;

		while (flag) {
			System.out.println("-----------------���� ����-----------------");
			System.out.println("|1. ���� ���� ��� ����			|");
			System.out.println("|2. �� ��û ���� �߰��ϱ�(1��)		|");
			System.out.println("|3. �Ű� ����Ʈ �߰�(1��~������)		|");
			System.out.println("|4. ���� ���� �˻�				|");
			System.out.println("|5. �����ϱ�				|");
			System.out.println("|6. �����ϱ�				|");
			System.out.println("-----------------------------------------");
			System.out.print("���ϴ� �۾��� �����ϼ����");
			num = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch (num) {
			case 1:
				manager.printBookList();
				System.out.println();
				System.out.println();
				break;
			case 2:
				System.out.print("�������� �Է����ּ��� : ");
				title = sc.nextLine();
				System.out.print("�ش� ������ �ݾ��� �Է����ּ��� : ");
				int price = Integer.parseInt(sc.nextLine());
				manager.addBook(new Book(title, price));
				manager.printBookList();

				break;
			case 3:
				manager.addBookList(books2);
				System.out.println("���Ű� ���� ����Ʈ �԰�");
				System.out.println();
				break;
			case 4:
				System.out.print("������ �˰���� ������ �̸��� �Է��ϼ��� : ");
				title = sc.nextLine();
				System.out.println();
				manager.printPrice(title);
				System.out.println();
				break;
			case 5:
				System.out.print("������ ���ϴ� ������ �Է����ּ��� : ");
				title = sc.nextLine();
				manager.removeBook(title);
				manager.printBookList();
				System.out.println();
				break;
			case 6:
				flag = false;
				System.out.println("�������� �����մϴ�~~");
				System.exit(0);
				System.out.println();
			default:
				System.out.println("��1~5�� �߿� �������ּ���^^");
				break;

			}
		}
		sc.close();
	}
}

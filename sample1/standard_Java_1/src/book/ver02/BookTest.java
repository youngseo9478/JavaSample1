package book.ver02;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BookTest {
	public static void main(String[] args) {

		ArrayList<Book> books2 = new ArrayList<Book>();
		books2.add(new Book("�����׽�", 2000));
		books2.add(new Book("���Ƕ��̽�����", 23000));
		books2.add(new Book("��4", 18000));
		books2.add(new Book("��1", 18000));
		books2.add(new Book("��3", 18000));
		books2.add(new Book("��2", 18000));

		BookMgr manager = new BookMgr(books2);

		Scanner sc = new Scanner(System.in);
		int num = 0;
		boolean flag = true;
		String fileName;

		String title;

		while (flag) {
			System.out.println("_____________________________");
			System.out.println("1. ���� ���� ��� ����			");
			System.out.println("2. ���� �߰��ϱ�(1��)	");
			System.out.println("3. �� ��û ���� ����Ʈ �߰�	");
			System.out.println("4. ���� ���� �˻�				");
			System.out.println("5. �����ϱ�				");
			System.out.println("6. �����ϱ�				");
			System.out.println("_____________________________");
			System.out.print("���ϴ� �۾��� �����ϼ����");
			try {
				num = Integer.parseInt(sc.nextLine().trim());
			} catch (NumberFormatException e) {

			} catch (NoSuchElementException e) {
				System.out.println("���ƹ��͵� �Էµ��� �ʾҽ��ϴ�.");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
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
				int price = Integer.parseInt(sc.nextLine().trim());
				manager.addBook(new Book(title, price));
				manager.printBookList();
				break;
			case 3:
				System.out.printf("�߰� ������ �� ��û ����Ʈ ���ϸ��� �Է��ϼ��� :");
				fileName = sc.nextLine().trim();
				manager.addBookList(fileName);
				break;
			case 4:
				System.out.print("������ �˰���� ������ �̸��� �Է��ϼ��� : ");
				title = sc.nextLine().trim();
				manager.printPrice(title);
				System.out.println();
				break;
			case 5:
				System.out.print("������ ���ϴ� ������ �Է����ּ��� : ");
				title = sc.nextLine().trim();
				manager.removeBook(title);
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

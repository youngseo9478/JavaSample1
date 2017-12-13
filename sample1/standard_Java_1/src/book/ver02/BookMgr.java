package book.ver02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author ������
 * @since 2017.11.09
 *
 */
public class BookMgr {

	List<Book> bookList = new ArrayList<Book>();
	List<Book> books = new ArrayList<Book>();
	int count = 0;

	public BookMgr() {
	}

	public BookMgr(ArrayList<Book> bookList) {
		super();
		this.bookList.addAll(bookList);
	}

	/**
	 * 1.���� ����� ����ϴ� �޼ҵ�
	 */
	public void printBookList() {
		System.out.println();
		System.out.println("============ ���� ���============");
		Collections.sort(bookList);
		for (int i = 0; i < bookList.size(); i++) {
			System.out.printf("[%d. %s]%n", i + 1, bookList.get(i).getTitle());
		}
		System.out.println();
	}

	/**
	 * 2.Book��ü�� bookList�� ����ϴ� �޼ҵ�
	 * 
	 * @param book
	 */
	public void addBook(Book book) {

		if (bookList.contains(book)) {
			System.out.printf("%s-%d : �̹� �����ϴ� �����Դϴ�.%n",book.getTitle(),book.getPrice());
		} else {
			bookList.add(book);
			System.out.println();
			System.out.printf("��%s �԰�", book.getTitle());
		}
		System.out.println();
		System.out.println();
	}

	/**
	 * 3.�Ű� ���� ����Ʈ�� ����ϴ� �޼ҵ�
	 * 
	 * @param booklist
	 *            : �߰��� ���� ����Ʈ
	 */
	public void addBookList(String fileName) {

		System.out.println();
		
		try (Scanner book = new Scanner(new File(fileName))) {
			while (book.hasNextLine()) {
				String readLine = book.nextLine().trim();
				String[] datas = readLine.split("/");
				if (bookList.contains(new Book(datas[0], Integer.parseInt(datas[1])))) {
					System.out.println();
					System.out.printf("%s-%d : �̹� �����ϴ� �����Դϴ�.%n",datas[0],datas[1]);
				} else {
					//�̷��� �������� ���� ���� ���� List<Book> books = Arrays.asList(Book[]�ΰ�...)�ϸ�
					//�Ϲ迭�� �ϸ���Ʈ�� �ٲ��ش�...�׷��� �ٷ� bookList.addAll(books)�ϸ� ó����
					books.add(new Book(datas[0], Integer.parseInt(datas[1])));
					System.out.println(datas[0]);
				}
			}
			bookList.addAll(books);
			books.removeAll(books);
			System.out.println("���Ű� ����Ʈ �԰�");

		} catch (FileNotFoundException e) {
			System.out.println("�������� �������� �ʽ��ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			printBookList();
		}
	}

	/**
	 * 4.�˻��� ������ ���������� ����ϴ� �޼ҵ�
	 * 
	 * @param title
	 *            : �˻��� ������
	 */
	public void printPrice(String title) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equalsIgnoreCase(title)) {
				System.out.println();
				System.out.printf("�������� : %s%n������ ���� : %d%n", title, bookList.get(i).getPrice());
				System.out.println();
				return;
			} else if (i == bookList.size() - 1 && !bookList.get(i).getTitle().equalsIgnoreCase(title)) {
				System.out.println();
				System.out.printf("���˻��Ͻ� ����  %s��/�� �������� �ʽ��ϴ�.", title);
				System.out.println();
				return;
			}
		}
		System.out.println();
		System.out.println();
		return;
	}

	/**
	 * 5.���ϴ� å ����� �����ϴ� �޼ҵ�
	 * 
	 * @param title
	 */
	public void removeBook(String title) {

		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				bookList.remove(i);
				System.out.println();
				System.out.printf("�� %s ���� �Ϸ� ��", title);
				System.out.println();
				printBookList();
				return;
			} else if (i == bookList.size() - 1 && !bookList.get(i).getTitle().equalsIgnoreCase(title)) {
				System.out.println();
				System.out.println("���������� �ʴ� �����Դϴ�.");
				return;
			}
		}
	}

	/**
	 * �������� ������ ���� �հ�
	 */
	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < bookList.size(); i++) {
			sum += bookList.get(i).getPrice();
		}
		System.out.println("___________________________");
		System.out.printf("��å ������ ���� :	%d%n", sum);
		System.out.println();
		System.out.println();
	}

}

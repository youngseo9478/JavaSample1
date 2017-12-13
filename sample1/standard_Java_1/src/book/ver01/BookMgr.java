package book.ver01;

/**
 * 
 * @author ������
 * @since 2017.11.09
 *
 */
public class BookMgr {

	Book[] bookList = new Book[6];
	int count = 0;

	public BookMgr() {
	}

	public BookMgr(Book[] booklist) {
		for (int i = count; i < booklist.length; i++) {
			this.bookList[i] = booklist[i];
		}
		count += booklist.length;
	}

	/**
	 * 1.���� ����� ����ϴ� �޼ҵ�
	 */
	public void printBookList() {
		System.out.println();
		System.out.println("============ ���� ���============");
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}

	/**
	 * 2.Book��ü�� bookList�� ����ϴ� �޼ҵ�
	 * 
	 * @param book
	 */
	public void addBook(Book book) {
		if (count == 6) {
			System.out.println();
			System.out.println("<�˸�>");
			System.out.println("���� ������ �����ؼ� �߰��� �� �����ϴ�.");
		} else {
			this.bookList[count] = book;
			count++;
			System.out.println();
			System.out.printf("��%s �԰�", book.getTitle());
			System.out.println();
		}
	}

	/**
	 * 3.�Ű� ���� ����Ʈ�� ����ϴ� �޼ҵ�
	 * 
	 * @param booklist
	 *            : �߰��� ���� ����Ʈ
	 */
	public void addBookList(Book[] booklist) {
		if ((10 - count) < booklist.length) {
			System.out.println("���� ������ �����ؼ� �߰��� �� �����ϴ�.");
		} else {
			for (int i = count; i < booklist.length+count; i++) {
				this.bookList[i] = booklist[i-booklist.length];
			}
			count = count + booklist.length;
		}
	}

	/**
	 * 4.�˻��� ������ ���������� ����ϴ� �޼ҵ�
	 * 
	 * @param title
	 *            : �˻��� ������
	 */
	public void printPrice(String title) {
		if (count == 0) {
			System.out.println("����Ʈ�� �������� �ʽ��ϴ�.\n������ �߰����ּ���");
			System.out.println();
			return;
		} else {
			for (int i = 0; i < count; i++) {
				if (bookList[i].getTitle().equalsIgnoreCase(title)) {
					System.out.print("���˻��Ͻ� ���� : ");
					System.out.println(bookList[i].getTitle());
					System.out.print("������ ���� : ");
					System.out.println(bookList[i].getPrice());
				}
			}
		}
	}

	/**
	 * 5.���ϴ� å ����� �����ϴ� �޼ҵ�
	 * 
	 * @param title
	 */
	public void removeBook(String title) {
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equalsIgnoreCase(title)) {
				for (int j = i + 1; j < count; j++) {
					bookList[i] = bookList[j];
				}
				count--;
				break;
			}
		}
	}

	/**
	 * �������� ������ ���� �հ�
	 */
	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println();
		System.out.println("=== å ������ ���� ===");
		System.out.printf("����� å ������ �� : %d%n", sum);
	}

}

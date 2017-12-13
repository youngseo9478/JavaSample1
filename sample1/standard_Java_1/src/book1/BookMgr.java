package book1;


/**
 * 
 * @author ������
 * @since 2017.11.09
 *
 */
public class BookMgr {
	
	Book[] bookList = new Book[50];
	int count = 0;
//	count : �迭�� �ε����� �����ϱ����� ������ ������ ������ ����

	/**
	 * �⺻ ������
	 */
	public BookMgr(){
		
	}
	
	/**
	 * bookList��� �迭 ������ �ʱ�ȭ�ϴ� ������ �޼ҵ�
	 * @param booklist 
	 */
	public BookMgr(Book[] booklist) {
		for (int i = count; i < booklist.length; i++) {
			this.bookList[i] = booklist[i];
		}
		count+=booklist.length;
	}

	/**
	 * Book��ü�� bookList�� ����ϴ� �޼ҵ�
	 * @param book
	 */
	public void addBook(Book book) {
		
		this.bookList[count] = book;
		count++;
	}
	
	/**
	 * ���� ����� ����ϴ� �޼ҵ�
	 */
	public void printBookList(){
		System.out.println();
		System.out.println("=== ���� ���===");
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}
	
	/**
	 * �������� ������ ���� �հ�
	 */
	public void printTotalPrice(){
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum+=bookList[i].getPrice();
		}
		System.out.println();
		System.out.println("=== å ������ ���� ===");
		System.out.printf("��� å ������ �� : %d%n",sum);
	}

}

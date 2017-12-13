package book2;


public class BookMgr {

	// �ε��������� ���ο����� ���� ����, �ܺο��� �ε��� �����ϸ� �ȵǴϱ�..set,get����
	int count = 0;
	// bookList�� ����Ұ� �Ǵ� ��(å���)
	Book[] bookList = new Book[100];

	public Book[] getBookList() {
		return bookList;
	}

	public BookMgr() {
	}

//	1. å ����� ������ ��
	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, bookList, count, data.length);
		count = count + data.length;
	}
	
//	2.  ->1�� ���� ������ �ϴ� �޼ҵ���
	public void setBookList(Book[] bookList) {
		for (int i = count; i < bookList.length; i++) {
			this.bookList = bookList;
			count++;
		}
	}
	
//	3. å �ѱ��� ������ ��
	public void addBook(Book data){
		bookList[count]=data;
		count++;
	}

//	4. å ����� ���� ���
	public void printBookList(){
		
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].toString());
		}
	}
	
//	5. å ����� ������ ���
	public void printTitleList(){
	
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}
	
}

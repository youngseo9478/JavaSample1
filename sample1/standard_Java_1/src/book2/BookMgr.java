package book2;


public class BookMgr {

	// 인덱스변수로 내부에서만 사용될 것임, 외부에서 인덱스 변경하면 안되니깐..set,get안줌
	int count = 0;
	// bookList가 저장소가 되는 것(책목록)
	Book[] bookList = new Book[100];

	public Book[] getBookList() {
		return bookList;
	}

	public BookMgr() {
	}

//	1. 책 목록을 저장할 때
	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, bookList, count, data.length);
		count = count + data.length;
	}
	
//	2.  ->1과 같은 동작을 하는 메소드임
	public void setBookList(Book[] bookList) {
		for (int i = count; i < bookList.length; i++) {
			this.bookList = bookList;
			count++;
		}
	}
	
//	3. 책 한권을 저장할 때
	public void addBook(Book data){
		bookList[count]=data;
		count++;
	}

//	4. 책 목록을 전부 출력
	public void printBookList(){
		
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].toString());
		}
	}
	
//	5. 책 목록의 제목을 출력
	public void printTitleList(){
	
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}
	
}

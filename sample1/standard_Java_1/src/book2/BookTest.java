package book2;

public class BookTest {
	public static void main(String[] args) {
		
		Book[] data = { new Book("ASP",800), new Book("PHP",8800)};
		BookMgr bm = new BookMgr(data);
		bm.addBook(new Book("java",25000));
		bm.addBook(new Book("jsp",21000));
		bm.addBook(new Book("db",35000));
		bm.printBookList();
		bm.printTitleList();
		
	}
}

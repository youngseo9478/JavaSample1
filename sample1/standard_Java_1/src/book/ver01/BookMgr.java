package book.ver01;

/**
 * 
 * @author 원영서
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
	 * 1.도서 목록을 출력하는 메소드
	 */
	public void printBookList() {
		System.out.println();
		System.out.println("============ 도서 목록============");
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}

	/**
	 * 2.Book객체를 bookList에 등록하는 메소드
	 * 
	 * @param book
	 */
	public void addBook(Book book) {
		if (count == 6) {
			System.out.println();
			System.out.println("<알림>");
			System.out.println("진열 공간이 부족해서 추가할 수 없습니다.");
		} else {
			this.bookList[count] = book;
			count++;
			System.out.println();
			System.out.printf("▶%s 입고◀", book.getTitle());
			System.out.println();
		}
	}

	/**
	 * 3.신간 도서 리스트를 등록하는 메소드
	 * 
	 * @param booklist
	 *            : 추가할 도서 리스트
	 */
	public void addBookList(Book[] booklist) {
		if ((10 - count) < booklist.length) {
			System.out.println("진열 공간이 부족해서 추가할 수 없습니다.");
		} else {
			for (int i = count; i < booklist.length+count; i++) {
				this.bookList[i] = booklist[i-booklist.length];
			}
			count = count + booklist.length;
		}
	}

	/**
	 * 4.검색한 도서의 가격정보를 출력하는 메소드
	 * 
	 * @param title
	 *            : 검색한 도서명
	 */
	public void printPrice(String title) {
		if (count == 0) {
			System.out.println("리스트가 존재하지 않습니다.\n도서를 추가해주세요");
			System.out.println();
			return;
		} else {
			for (int i = 0; i < count; i++) {
				if (bookList[i].getTitle().equalsIgnoreCase(title)) {
					System.out.print("▶검색하신 도서 : ");
					System.out.println(bookList[i].getTitle());
					System.out.print("▶가격 정보 : ");
					System.out.println(bookList[i].getPrice());
				}
			}
		}
	}

	/**
	 * 5.원하는 책 목록을 삭제하는 메소드
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
	 * 보유중인 도서의 가격 합계
	 */
	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		System.out.println();
		System.out.println("=== 책 가격의 총합 ===");
		System.out.printf("▶모든 책 가격의 합 : %d%n", sum);
	}

}

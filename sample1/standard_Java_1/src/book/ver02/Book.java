package book.ver02;

public class Book implements Comparable<Book>{

	private String title;
	private int price;

	/**
	 * Book()기본 생성자
	 */
	public Book() {
	}

	/**
	 * 
	 * @param title : 책 제목
	 * @param price : 책 가격
	 */
	public Book(String title, int price) {
		
		this.setPrice(price);
		this.setTitle(title);
		
	}
	@Override
	public int compareTo(Book o) {
		return getTitle().compareTo(o.getTitle());
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Book [ ");
		sb.append(title);
		sb.append(",");
		sb.append(price);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
}

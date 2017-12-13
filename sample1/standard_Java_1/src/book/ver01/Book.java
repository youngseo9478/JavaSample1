package book.ver01;

public class Book {

	private String title;
	private int price;

	/**
	 * Book()�⺻ ������
	 */
	public Book() {
	}

	/**
	 * 
	 * @param title : å ����
	 * @param price : å ����
	 */
	public Book(String title, int price) {
		
		this.setPrice(price);
		this.setTitle(title);
		
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
	
	
}

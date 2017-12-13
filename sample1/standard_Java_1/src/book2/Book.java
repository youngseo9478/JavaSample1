package book2;

public class Book {

	private String title;
	private int price;
	
	public Book() {
	}

	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
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
		if(price<=0){
//			System.out.println("가격을 올바르게 설정해주세요.");
			return;
		}
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [ title = " + getTitle() + ", price = " + getPrice() + "원 ]";
	}
	
	
	
}

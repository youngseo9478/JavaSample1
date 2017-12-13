package day11;

public class Animal {

	private String kind = "��������";
	
	/**
	 * default constructor
	 */
	public Animal() {
		System.out.println("Animal() ����");
	}

	/**
	 * kind field constructor
	 * @param kind
	 */
	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	
	public void breath(){
		System.out.println("��� ������");
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}

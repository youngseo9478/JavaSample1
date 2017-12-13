package day11;

public class Animal {

	private String kind = "동물종류";
	
	/**
	 * default constructor
	 */
	public Animal() {
		System.out.println("Animal() 수행");
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
		System.out.println("폐로 숨쉬기");
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}

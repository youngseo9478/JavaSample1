package day12;

public abstract class Animal {

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

	/**
	 * Animal은 부모 클래스로 가장 general한 형태여야한다.
	 * 특정 기관으로 숨을 쉰다고 하는 것은 제너럴 하지 않기 때문에
	 * 선언부만 두고 구현부는 구현하지 않은채 둔다. =>abstract
	 * 해당 자손에게 알맞도록 메소드를 마저 구현해주면 된다.
	 * 클래스도 abstract여야한다.
	 */
	public abstract void breath();

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}

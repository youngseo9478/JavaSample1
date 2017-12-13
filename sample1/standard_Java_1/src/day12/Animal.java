package day12;

public abstract class Animal {

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

	/**
	 * Animal�� �θ� Ŭ������ ���� general�� ���¿����Ѵ�.
	 * Ư�� ������� ���� ���ٰ� �ϴ� ���� ���ʷ� ���� �ʱ� ������
	 * ����θ� �ΰ� �����δ� �������� ����ä �д�. =>abstract
	 * �ش� �ڼտ��� �˸µ��� �޼ҵ带 ���� �������ָ� �ȴ�.
	 * Ŭ������ abstract�����Ѵ�.
	 */
	public abstract void breath();

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
}

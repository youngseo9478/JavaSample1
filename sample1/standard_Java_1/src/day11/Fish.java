package day11;

public class Fish extends Animal{

	String name ;
	
	public Fish() {
		super();
	}
	
	
	public Fish(String name) {
		super();
		this.name = name;
	}
	public Fish(String kind, String name) {
		super(kind);
//		super.setKind(kind); super();�� ������ ��.�ᱹ ���� ó�� ���ٷ� ó���ϴ°� ȿ����
		this.name = name;
	}

	//�������̵� ���� �ʾƵ� ������ �ȳ� (�������� ���� ����)
	@Override //������Ÿ���� ������ ��������ʴ� �ּ�(����� �ٸ��� �˷���,��������)
	public void breath(){
		System.out.println("�ư��̷� ������");
	}
	
	public void display(){
		System.out.printf("Fish[ %s %s ]%n",name, super.getKind());
	}
	
}

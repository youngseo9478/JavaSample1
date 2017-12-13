package day11;

public class Dog extends Animal {

	String name;
	String kind = "����������";
	
	public Dog() {
//		super(); �����ص� ������ ���ٿ� 
//		�׷��� Animal�� ����Ʈ�����ڰ� ��! �����ؾ��Ѵ�(��Ӱ��迡���� Ư��!).
	}
	public Dog(String name, String kind) {
		super();
		this.name = name;
		this.kind = kind;
	}
	public Dog(String name, String kind, String superK) {
		super(superK); 
		//����Ʈ�� �ƴ� �Ķ�����ϳ�¥�� �������Լ��� �����Ű�� �Ʒ� �ּ�ó���س��� �ڵ�� ���� �ǹ�
//		super(); ������ �������Լ� �����߱⶧���� ����Ʈ �����ڴ� ������� �ʰԵ�.
		this.name = name;
		this.kind = kind;
//		super.setKind(superK); �̷��� �ص� ������ AnimalŬ������ �����ڸ� ���ؼ��� ����
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void display(){
		System.out.printf("Dog[ %s %s %s ]%n",super.getKind(),kind, name);
	}
	
}

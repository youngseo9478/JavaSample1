package day10;

public class InheritanceTest {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		
		System.out.println("------------------");
		
		Dog d1 = new Dog();
		d1.breath();
		d1.bike();
		d1.display();
		System.out.println("-----------------");
		System.out.println(d1.name);
		System.out.println(d1.kind); //����������
		System.out.println(((Animal)d1).kind); //����������->((Animal)d1)->�̷��� ��ȣ�� �ι� �ֿ���
		System.out.println("-----------------");
		//Is a ����
//		new Dog(); �̷��Ը� �ᵵ �޸𸮿� �� �� �ּҸ� ��Ϳ� �־������� ���ʿ� ���� �ڵ��� ��
//		new Dog().breath();
//		�׷��� .�̿��ؼ� ������ �� �� �ִ�. �̰��� temporary����! (�Ͻ�����)
		
		Animal e = new Dog();
		e.breath();
//		e.bike(); e�� �ּҷδ� ������ �� ���� �޼ҵ��� ��.
		((Dog)e).bike(); //down casting 
		System.out.println(e.kind); //����������
		
		System.out.println("---------------------");
		
		Fish f = new Fish();
		f.breath();
		System.out.println(f.kind);
//		Animal type���� ĳ���� �ߴµ�...�ִϸ��� breath()�� �ǽ��� �޼ҵ尡 ȣ���
		((Animal)f).breath();
//		�ִϸ��� �޼ҵ带 ȣ���ϰ� �ʹٸ� super���� ����ۿ� ����.�׷��� ����� main...
		
		
		
	}
}

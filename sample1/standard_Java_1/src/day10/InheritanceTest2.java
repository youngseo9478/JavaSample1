package day10;

public class InheritanceTest2 {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();
		
		Animal ff = new Fish();
		ff.breath();//'��'�� �� �˾Ҵµ� '�ư���' �Ф� �������̵��ؼ� �ڽĸ޼ҵ带 ȣ���ϱ� ����..!
//		�̴� �� �θ�Ÿ������ �����ص� �ڽİ�ü�� ������ ���������ٴ� ���..?
	}
}

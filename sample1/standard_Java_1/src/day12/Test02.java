package day12;

public class Test02 {

	public static void main(String[] args) {
		Animal d = new Dog();
		Animal f = new Fish();
//		new Animal(); Animal�� �޸𸮿� �ø��ڽ��ϴ�!->Error
//		Animal�� *Ÿ��*���δ� �� �� ������ *��ü*�� ���� ���� ����
//		�̿ϼ��� �ڵ尡 �ֱ⶧���� �޸𸮿� �ø� �� ���� ��!
		
		Animal[] animals = new Animal[5];
//		�ִϸ� Ÿ���� ��ü 5���� �����ϴ� �迭
//		�̰� ���� Ÿ�� �����̱⶧���� �����ȳ��� ������ ��
		
		Animal[] animals2 = {d,f};
		for (int i = 0; i < animals2.length; i++) {
			animals2[i].breath();
		}
	}
}

package day7;

public class MethodEx_ClacTest {
	public static void main(String[] args) {

		MethodEx_Clac calc1 = new MethodEx_Clac();
		MethodEx_Clac calc2 = new MethodEx_Clac();
		MethodEx_Clac calc3 = new MethodEx_Clac();
		
//		�̷��� �ص� �ȿ� static �޼ҵ�� �̹� �޸𸮿� ���� ��� ����
		MethodEx_Clac c1 = null;
		
//		�������� ���� ��쿡�� static���� �޼ҵ带 ���� ����Ѵ�. static�޼ҵ��
//		�ν��Ͻ� �޼ҵ尡 �ƴ�->Ŭ�����޼ҵ�! �׷��� ��ü�� ��� X, Ŭ��������
//		static�� heap������ ������ ����� �� �� ����.
//		calc1.add(455,243);
//		calc2.add(455,243);
//		calc3.add(455,243);
		
		System.out.println(MethodEx_Clac.add(455, 243));
//		c1�� ��ü�� �������� �ʾҾ �޼ҵ尡 static�̶� �׳� ��� ����
		System.out.println(c1.add(455, 243));

	}
}

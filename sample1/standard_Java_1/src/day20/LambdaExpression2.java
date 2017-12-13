package day20;

import javax.print.DocFlavor.INPUT_STREAM;

public class LambdaExpression2 {
	public static void main(String[] args) {
	
		//Anonymous class ���� ���
		F1 f1 = new F1(){
			@Override
			public int max(int a, int b) {
				return a>b?a:b;
			}
		};
		System.out.println(f1.max(34, 66));
		
		//���ٽ� ���� ���
		F1 f2 = (int a, int b)->{
			return a>b?a:b;
		};
		System.out.println(f2.max(55, 99));
		
		//������ ����¥���� ��ȣ�� return�����ص� ����
		F1 f3 = (int a, int b)-> a>b?a:b;
		
		F2 f4 = (int a, int b)->a<b?a:b;
		System.out.println(f4.min(34, 22));
	}
}

@FunctionalInterface
interface F1{
	/**
	 * @param a
	 * @param b
	 * @return a,b �� �߿� ū ��
	 */
	int max(int a, int b);
}
@FunctionalInterface
interface F2{
	/**
	 * @param a
	 * @param b
	 * @return a,b �� �� ���� ��
	 */
	int min(int a, int b);
}

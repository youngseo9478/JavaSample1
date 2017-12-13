package day8;
/****************
 * method overloading
 * 
 * @author student
 *
 */
public class Calc {

//	�� �޼ҵ���� ����� �ٲ��� �ʰ� ��� Ŭ������ �����ϱ� ������ static���� �����ؼ� ����ϴ� ��
//	public static int add(){
//		return 0;
//	}
//	public static int add(int a, int b){
//		return a+b;
//	}
//	public static int add(int a, int b, int c){
//		return a+b+c;
//	}
	/**
	 * 
	 * @param a ���ϱ� �� ������
	 * @return �հ�
	 */
	public static int add(int...a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
//	int...�� �𸥴ٸ�? => �� ǥ���� �迭ǥ���� ���� ��! �׷��� �ߺ��Ұ�
//	public static int add(int[] a){
//		return sum;
//	}
	
	public static double add(double...a){
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
}

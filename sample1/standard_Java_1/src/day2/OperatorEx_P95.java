package day2;

public class OperatorEx_P95 {
	public static void main(String[] args) {
		float x = 'a'; // ���θ���������� ������ �ƴ� char�� int�� int�� float��!
		double y = 7 + 8 * x;
		System.out.printf("y = %.2f , y = %10.0f", y, y);
		System.out.println();
		int i = 5, j = 5;
		System.out.printf("i = %d, j = %d %n", i, j);
		System.out.println(i++);
		System.out.printf("i = %d, j = %d %n", i, j);
		System.out.println(++i);
		System.out.printf("i = %d, j = %d %n", i, j);

		int sum = 100;
//		y�� double���̶� int�� ĳ���� �ʿ�
		sum = sum + (int)y;
//		�̰� �� ĳ���� ���ص� ������ �ȶ��..?
//		sum+=y;
		System.out.println(sum);
		System.out.println(sum%10);
		System.out.println(sum/10);
		
	}
}

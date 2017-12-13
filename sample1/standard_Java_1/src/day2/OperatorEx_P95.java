package day2;

public class OperatorEx_P95 {
	public static void main(String[] args) {
		float x = 'a'; // 프로모션으로인해 에러가 아님 char는 int로 int는 float로!
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
//		y가 double형이라서 int로 캐스팅 필요
		sum = sum + (int)y;
//		이건 왜 캐스팅 안해도 에러가 안뜰까..?
//		sum+=y;
		System.out.println(sum);
		System.out.println(sum%10);
		System.out.println(sum/10);
		
	}
}

package day4;

public class RepetitiveStatementAll {

	public static void main(String[] args) {

		int sum = 0;
		// for (int i = 1; i < 101; i++) {
		// sum += i;
		// }
		for (int i = 1; i <= 100; i++) {
			if (i % 4 == 0) {
				System.out.printf("%d ",i);
			}
		}
		System.out.println("\n");
		System.out.println("\n");
		System.out.printf("1~100까지의 합은 %d \n\n", sum);

		sum = 0;
		int i = 1;
		while (i < 101) {
			sum += i;
			i++;
		}
		System.out.printf("1~100까지의 합은 %d", sum);

		while (sum == 5050) {
			System.out.println("~~~~~");
			break;
		}

		boolean flag = false;
		do {
			System.out.println("do while " + flag);
			// break; 없어도 while 종료조건이 false라 더이상 안함
			// true가 조건이라면 무한루프일 것
		} while (flag);
	}

}

package day4;

public class ForEx3_9x9 {
	public static void main(String[] args) {
		int i;
//		���� �̸��� �ٿ��� ���ϴ� �ܶ��� break����
		OUT: for (i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if(j==5) break OUT;
//				OUT�� ���ٸ� ���� for ������ ���
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}

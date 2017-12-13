package day4;

public class ForEx3_9x9 {
	public static void main(String[] args) {
		int i;
//		블럭에 이름을 붙여서 원하는 단락을 break가능
		OUT: for (i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if(j==5) break OUT;
//				OUT이 없다면 안쪽 for 루프만 벗어남
				System.out.print(j + "x" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}

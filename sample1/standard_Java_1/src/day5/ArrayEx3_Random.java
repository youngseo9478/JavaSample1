package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3_Random {
	public static void main(String[] args) {
		// 유틸라이브러리 이용해서 랜덤하게 숫자를 출력하는 방법
		// 이렇게하면 0~44까지 중 숫자 중에서 랜덤 발생
		// System.out.println((int)(Math.random()*45));
		// (int)(Math.random()*45)+1이렇게 해주면 0~45 범위 중 랜덤 발생

		// 로또번호생성하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("랜덤으로 생성할 개수를 입력해주세요: ");
		int[] num;
//		num = new int[scanner.nextInt()];
		num = new int[Integer.parseInt(scanner.nextLine())];
		scanner.close();
		for (int i = 0; i < num.length; i++) {
			// 계속해보면 문제점 보임 -> 중복발생!
			num[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println(Arrays.toString(num));
	}
}

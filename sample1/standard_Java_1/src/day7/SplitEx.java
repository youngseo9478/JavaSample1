package day7;

import java.util.Arrays;
import java.util.Scanner;

public class SplitEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] num;
		int score1;
		System.out.println("숫자 세개를 공백을 포함해서 입력해주세요");
		num = sc.nextLine().split(" ");
		sc.close();
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
			score1=Integer.parseInt(num[i]);
		}
	}
}

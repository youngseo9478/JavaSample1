package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] num;
		Scanner scanner = new Scanner(System.in);
		num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("학생%d의 점수를 입력하세요:",i);
			num[i]=scanner.nextInt();
		}
		scanner.close();
		System.out.println();
//		배열은 인덱스를 안주면 주소를 찍게됨
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
//		라이브러리 이용해서 배열의 데이터를 바로 찍는 방법!
		System.out.println(Arrays.toString(num));
		

	}
}

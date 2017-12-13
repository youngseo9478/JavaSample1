package day5;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d번째 숫자를 눌러주세요 : ",i+1);
			System.out.println();
			num[i] = sc.nextInt();			
		}
		sc.close();
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		
		System.out.printf("num배열 속 정수들의 합은? %d",sum);
	}
}

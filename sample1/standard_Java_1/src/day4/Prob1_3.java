package day4;

import java.util.Scanner;

public class Prob1_3 {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력해주세요 :");
		year = sc.nextInt();
		sc.close();
		
		System.out.println(year%400==0||year%4==0?(year%100!=0?"윤년":"평년"):"평년");
		
	}
}

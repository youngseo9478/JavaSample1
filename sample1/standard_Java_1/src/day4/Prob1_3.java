package day4;

import java.util.Scanner;

public class Prob1_3 {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է����ּ��� :");
		year = sc.nextInt();
		sc.close();
		
		System.out.println(year%400==0||year%4==0?(year%100!=0?"����":"���"):"���");
		
	}
}

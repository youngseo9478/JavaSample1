package day4;

import java.util.Scanner;

public class Prob1_2 {
	public static void main(String[] args) {
//		equals()사용하기
		Scanner scanner = new Scanner(System.in);
		System.out.println("단어를 입력해주세요");
		String msg = scanner.nextLine();
		scanner.close();
		System.out.println(msg.equals("yes"));
	}
}

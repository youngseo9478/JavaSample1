package day4;

import java.util.Scanner;

public class Prob1_2 {
	public static void main(String[] args) {
//		equals()����ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ܾ �Է����ּ���");
		String msg = scanner.nextLine();
		scanner.close();
		System.out.println(msg.equals("yes"));
	}
}

package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] num;
		Scanner scanner = new Scanner(System.in);
		num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("�л�%d�� ������ �Է��ϼ���:",i);
			num[i]=scanner.nextInt();
		}
		scanner.close();
		System.out.println();
//		�迭�� �ε����� ���ָ� �ּҸ� ��Ե�
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
//		���̺귯�� �̿��ؼ� �迭�� �����͸� �ٷ� ��� ���!
		System.out.println(Arrays.toString(num));
		

	}
}

package day5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3_Random {
	public static void main(String[] args) {
		// ��ƿ���̺귯�� �̿��ؼ� �����ϰ� ���ڸ� ����ϴ� ���
		// �̷����ϸ� 0~44���� �� ���� �߿��� ���� �߻�
		// System.out.println((int)(Math.random()*45));
		// (int)(Math.random()*45)+1�̷��� ���ָ� 0~45 ���� �� ���� �߻�

		// �ζǹ�ȣ�����ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("�������� ������ ������ �Է����ּ���: ");
		int[] num;
//		num = new int[scanner.nextInt()];
		num = new int[Integer.parseInt(scanner.nextLine())];
		scanner.close();
		for (int i = 0; i < num.length; i++) {
			// ����غ��� ������ ���� -> �ߺ��߻�!
			num[i] = (int) (Math.random() * 45) + 1;
		}
		System.out.println(Arrays.toString(num));
	}
}

package day6;

import java.util.Arrays;

public class Sorting_Selection {
	public static void main(String[] args) {
		// ���� ��ó -> ���ڸ� �ƹ��͵� �Ѱ����� ������ �Է��� ��û�� (0���Է��ص� ��������� �ƿ� �Է¾����� ��� ���ܹ߻�)
		if (args.length == 0) {
			System.out.println("�迭�� ũ�⸦ ���ڷ� �Ѱ��ּ���");
			return; // return����� �����޼��� �ȶ�..
		}

		// command�� �迭 ũ�⸦ ���ϴ� ���!
		int[] num = new int[Integer.parseInt(args[0])];
		int temp;
		num[0] = (int) (Math.random() * 45 + 1);
		for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
				}
			}
		}
		// ���� ���� ���!
		// num2=num; �ϸ� ���� �ּҸ� ����Ű�� ���̱� ������ ������ �޶����Ե� (�������� X)
		int[] num2 = new int[num.length];
		System.arraycopy(num, 0, num2, 0, num.length);
		// for (int i = 0; i < num2.length; i++) {
		// num2[i]=num[i];
		// }
		System.out.print("���� �� : ");
		System.out.println(Arrays.toString(num));

		for (int i = 0; i < num.length - 1; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.print("���� �� : ");
		System.out.println(Arrays.toString(num));
		System.out.print("���� : ");
		System.out.println(Arrays.toString(num2));
	}
}

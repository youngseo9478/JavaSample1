package day2;

import java.util.Scanner;

public class VariableEx_Scanner {

	public static void main(String[] args) {
		Scanner input = null;
		// ��� �� ���� ���� ��������ϴµ� Ű����� �����Ŵϱ� in
		input = new Scanner(System.in);
		System.out.print("�л� �̸��� �Է��ϼ��� : ");
		// String�� ������ Ÿ�������� �⺻��ó�� ����ϴ°� ������
		// String name = "ȫ�浿"; ������ �Ͱ� (�⺻��ó��)
		// String name = new String("ȫ�浿"); �̰Ŷ� ���� ���
		// but �޸� ���������� ���� ���̰� �ִ�.
		String name = input.nextLine();
		System.out.print("������ �Է��ϼ��� ex)90 : ");
		// parse �̿��ؼ� ���ڿ��� ������ �ٲ� ���� �����Ƿ� �ΰ��� ����ִ�
		int score = input.nextInt();
		input.nextLine();
//		���������� ���ٷ� ���� �ڵ� -> nextInt�� ���ڿ� ���ͱ��� �������� �������ִ�.
//		�׷��� �� �κ��� �߶��ֱ����� nextLine()���� �ѹ� �� ó��������Ѵ�.
//		int score2 = Integer.parseInt(input.nextLine()); �Ľ̰������ִ�.

		System.out.printf("�̸� : %s %n���� : %d %n", name, score);

		// �ڿ��� �ݳ����� ������ ���Ȼ� ������ �߻��ϱ� ������ �� �ݾ������
		input.close();
		input = null;
	}

}

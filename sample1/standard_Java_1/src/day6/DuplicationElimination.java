package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

//�迭�� ũ�⺸�� ������ ������ ������ ���ѷ����� ������
public class DuplicationElimination {
	public static void main(String[] args) {
		//���� Ÿ���� String�̴�.
		String size = JOptionPane.showInputDialog("1~45 ������ ���ڸ� �Է����ּ���.");
//		System.out.println(data);
		int[] num = new int[Integer.parseInt(size)];
//		0��°�� ������ �ߺ� �����״� �׳� �� �־��ش�.
		num[0]=(int)(Math.random()*Integer.parseInt(size)+1);
		for (int i = 1; i < num.length; i++) {
			num[i]=(int)(Math.random()*Integer.parseInt(size)+1);
			for (int j = 0; j < i; j++) {
				if(num[j]==num[i]){
					i--;
					break;
				}
			}
//			�� ��ġ���� ���� �ߺ��Ǽ� ���ϴ� �� Ȯ�� ����
//			System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));
	}
}

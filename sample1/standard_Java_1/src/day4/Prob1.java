package day4;

public class Prob1 {
	public static void main(String[] args) {
		String strData = "Java Programming";
		System.out.println(strData.length());
//		���̰� 16�̹Ƿ� 0~15�� �ε������� ���� ��
		for (int i = 15; i >= 0; i--) {
			System.out.print(strData.charAt(i));
		}
	}
}

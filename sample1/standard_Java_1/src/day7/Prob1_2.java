package day7;

public class Prob1_2 {
	// Ŭ�����޼ҵ�� �ٲ� => �ּ��ʿ���� Ŭ�����̸��� �˸��
	public static String leftPad(String str, int size, char padChar) {

		String result = "";
		if (str.length() > size) {
			return str;
		} else {
			int temp = size - str.length();
			for (int i = 0; i < temp; i++) {
				result += padChar;
			}
			return result + str;
		}
	}

	public static void main(String[] args) {
		// static �޼ҵ�� ��ü���� �ʿ���� �׳� "Ŭ��������.�޼ҵ�"���ָ� �ȴ�.
		String s = Prob1_2.leftPad("SDS", 3, '!');
		System.out.println(s);

		
//		�ʱ���� ���ǽĿ� �ȸ����� �ѹ��� ���� �ȵ�
//		for (int i = 0; i < 0; i++) {
//			System.out.println("**********");
//		}
	}
}

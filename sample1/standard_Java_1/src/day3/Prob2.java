package day3;

public class Prob2 {
	public static void main(String[] args) {

		/*
		 * ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�. ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� �ҹ��ڷ� �����ϴ� �ڵ带 �ϼ�
		 * �մϴ�.
		 */
		char ch = 'P';
		char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
		System.out.print("ch:" + ch);
		System.out.println(" to lowerCase :" + lowerCase);

		int num = -90;
		String result = (num>0)?"���":(num<0?"����":"0");
		System.out.println(result);

	}
}

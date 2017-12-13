package day16.lang;

import java.util.Arrays;

public class P469_String {
	public static void main(String[] args) {

		String[] ss = { "x", "aa", "bb", "44" };
		System.out.println(Arrays.toString(ss));
		System.out.println();
		System.out.println("_____sort______");
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));
		System.out.println();
		// sort�� compareTo�� ������� ������� �޼ҵ�! compareTo�� return ����!
		System.out.println("x".compareTo("aa")); // 23 : x�� �� ũ�ٴ� �̾߱�(���� �� ũ�ٴ�
													// ��)
		System.out.println("aa".compareTo("bb")); // -1 : aa�� �����ϱ� �ٲ���
													// ����(������������)
		System.out.println("aa".compareTo("aa")); // 0 : ����

		System.out.println();
		System.out.println("___________________");
		String msg = "Hello java test...";
//		char[] ssss = msg.toCharArray(); char[]�� �ٲٴ� ���~ (���ڿ��� ������ ������ �迭�� �����Ǵϱ�..!)
		System.out.println(msg.indexOf(" "));
		System.out.println(msg.indexOf('j'));

		System.out.println();
		System.out.println("___________________");
		System.out.println(msg.substring(6, 10));
		System.out.println(msg.substring(0, 2));
		System.out.println(msg.substring(2));
		System.out.println(msg.substring(msg.indexOf(' ') + 1));
		System.out.println(msg.substring(msg.lastIndexOf(' ') + 1));

		System.out.println();
		System.out.println("___________________");
		String data = "ȫ�浿 / 90/70/77";
		String[] datas = data.split("/");

		int sum = 0;

		for (int i = 1; i < datas.length; i++) {
			sum += Integer.parseInt(datas[i].trim());
		}
		System.out.printf("�̸�:%s ����:%d ���:%f", datas[0], sum, sum / 3.0);

	}
}

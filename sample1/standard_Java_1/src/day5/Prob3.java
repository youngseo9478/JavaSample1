package day5;

import java.util.Arrays;

public class Prob3 {
	public static void main(String[] args) {
		String msg = "hello Java";
//		�ϳ��������� ���Խ�Ű�� �ʾƵ� �ƿ� char�� �迭�� ���� �� �ִ�.
		char[] s = msg.toCharArray();
		char[] c = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			if('A'<=s[i]&&s[i]<='Z'){
				c[i]=(char)(s[i]+32);
			}
			else if('a'<=s[i]&&s[i]<='z'){
				c[i]=(char)(s[i]-32);
			}
			else{
				c[i]=s[i];
			}
		}
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(c));
		
//		String msg2 = c; �̷��� �ϸ� c�� charŸ���̶� ��������
//		String������ �ΰ��� �� new�� �̿��� �����ϸ� char���� �ѹ��� ���� �� �ִ�.
		String msg2 = new String(c);
		System.out.println(msg);
		System.out.println(msg2);
	}
}

package day5;

import java.util.Arrays;

public class Prob3 {
	public static void main(String[] args) {
		String msg = "hello Java";
//		하나씩꺼내서 대입시키지 않아도 아예 char의 배열로 만들 수 있다.
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
		
//		String msg2 = c; 이렇게 하면 c가 char타입이라 에러난다
//		String선언방식 두가지 중 new를 이용해 생성하면 char형도 한번에 넣을 수 있다.
		String msg2 = new String(c);
		System.out.println(msg);
		System.out.println(msg2);
	}
}

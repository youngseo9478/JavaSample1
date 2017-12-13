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
		// sort는 compareTo를 기반으로 만들어진 메소드! compareTo는 return 정수!
		System.out.println("x".compareTo("aa")); // 23 : x가 더 크다는 이야기(앞이 더 크다는
													// 것)
		System.out.println("aa".compareTo("bb")); // -1 : aa가 작으니까 바뀌지
													// 않음(오름차순기준)
		System.out.println("aa".compareTo("aa")); // 0 : 같음

		System.out.println();
		System.out.println("___________________");
		String msg = "Hello java test...";
//		char[] ssss = msg.toCharArray(); char[]로 바꾸는 방법~ (문자열은 어차피 문자의 배열로 관리되니까..!)
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
		String data = "홍길동 / 90/70/77";
		String[] datas = data.split("/");

		int sum = 0;

		for (int i = 1; i < datas.length; i++) {
			sum += Integer.parseInt(datas[i].trim());
		}
		System.out.printf("이름:%s 총점:%d 평균:%f", datas[0], sum, sum / 3.0);

	}
}

package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514_StringTokenizer {
	public static void main(String[] args) {
		String msg = "홍길동: 90/80/70";
		// 구분자가 두 종류다..? split으로 자르게되면 두번에 걸쳐서 잘라줘야함
		String[] data = msg.split(":");
		System.out.println(Arrays.toString(data)); // [홍길동, 90/80/70]
		String[] data2 = msg.split("/");
		System.out.println(Arrays.toString(data2)); // [홍길동: 90, 80, 70]

		// data를 바탕으로 점수를 다시 나눠주려면
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu)); // [ 90, 80, 70]
		
		System.out.println();
		System.out.println("____________StringTokenizer_____________");
		StringTokenizer st = new StringTokenizer(msg, ":/"); //매개변수를 추가해서 true를 넣어주면 구분자도 쪼개주는 것
		System.out.println("몇개로 쪼개졌니? "+st.countTokens());
		System.out.println();
		//토큰을 가지고 있는 동안 while 
		while(st.hasMoreTokens()){
			String s = st.nextToken().trim();
			System.out.println(s);
		}
		
	}
}

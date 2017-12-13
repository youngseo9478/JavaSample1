package day16.lang;

import java.util.Arrays;

public class Test02 {
	public static void main(String[] args) {
		int[] num = {77,85,69};
		int[] num2 = num.clone();
		
		System.out.println("_____________________________");
		//복제되었음을 알 수 있음
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		
		//주소는 다름
		System.out.println(num);
		System.out.println(num2);
		
		System.out.println("_____________________________");
		String[] str = {"홍길동","고길동","이길동"};
		String[] str2 = str.clone();
		str[0]="~~~~"; //원본 복제본 따로임을 알 수 있다.
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(str2));
		
		System.out.println(str);
		System.out.println(str2);
		
	}
}

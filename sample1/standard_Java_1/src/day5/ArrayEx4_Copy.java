package day5;

import java.util.Arrays;

public class ArrayEx4_Copy {
	public static void main(String[] args) {
		int[] src = { 66, 77, 88, 67, 54, 33 };
		// 이렇게 선언하고나면 리사이징은 안됨
		// 더큰공간을 원하면 더큰배열을만들어서 복사해서 사용해야한다
		System.out.println(Arrays.toString(src));

		int[] dest=new int[src.length*2];
		
		System.arraycopy(src, 0, dest, src.length, src.length);
		System.out.println(Arrays.toString(dest));
		
	}
}

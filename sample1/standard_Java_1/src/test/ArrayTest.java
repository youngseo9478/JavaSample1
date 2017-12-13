package test;

import java.util.Arrays;

//내가 만든 클래스 import(패키지가 달라서 여기서 사용하려면 임포트필요)
import util.Array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] source = {77,88,27,69,47};
//		Array array = new Array();
		
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(Array.sort(source)));
	}	
}

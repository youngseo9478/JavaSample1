package test;

import java.util.Arrays;

//���� ���� Ŭ���� import(��Ű���� �޶� ���⼭ ����Ϸ��� ����Ʈ�ʿ�)
import util.Array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] source = {77,88,27,69,47};
//		Array array = new Array();
		
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(Array.sort(source)));
	}	
}

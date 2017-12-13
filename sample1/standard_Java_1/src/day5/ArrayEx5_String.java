package day5;

import java.util.Arrays;

public class ArrayEx5_String {
	public static void main(String[] args) {
		String[] names = new String[5];
		for (int i = 0; i < names.length; i++) {
			names[i] = "Hello" + i;
		}
		System.out.println(Arrays.toString(names));
	}

}


package day5;

import java.util.Arrays;
//이클립스창에서 command parameter 넘기는 방법
//run>run configurations>arguments 에다가 원하는 데이터 작성
//모든 데이터가 String type이다.
public class ArrayEx7 {
	public static void main(String[] args) {
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		System.out.println("main end");
	}
}

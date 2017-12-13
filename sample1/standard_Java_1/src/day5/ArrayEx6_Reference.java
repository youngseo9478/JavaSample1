package day5;

//import java.util.Arrays;

public class ArrayEx6_Reference {
	public static void main(String[] args) {
		int[] scores = {99,88,78,67,77};
		String[] names = {"홍길동","고길동","박길동","최길동","이길동"};
		for (int i = 0; i < names.length; i++) {
			System.out.printf("%c** %d \n",names[i].charAt(0),scores[i]);
		}
		System.out.println("========");
		for(String data:names){
			System.out.println(data);
		}
		System.out.println("========");
		for(int data:scores){
			System.out.println(data);
		}
	}
}

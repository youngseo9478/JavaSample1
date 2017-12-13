package day6;

import java.util.Arrays;

public class Sorting_Bubble {
	public static void main(String[] args){
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i]=(int)((Math.random()*45)+1);
		}
//		for (int i = 0; i < num.length; i++) System.out.print(num[i]+" ");
		System.out.print("원본 num: ");
		System.out.println(Arrays.toString(num));
		
		int temp;
		for (int i = 0; i < num.length; i++) {
			boolean check = false;
			for (int j = 0; j < num.length-1; j++) {
				if(num[j]>num[j+1]){
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
					check=true;
				}
			}
			if(check==false){
				break;
			}
		}
		System.out.print("정렬 num: ");
		System.out.println(Arrays.toString(num));
	}
}

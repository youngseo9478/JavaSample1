package day5;

public class ArrayEx1_DefaultValue {

	public static void main(String[] args) {
		String[] names;
		names = new String[3];
		
//		배열 선언과 생성을 동시에 한 것
		int[] score = new int[5];
		
//		크기를 어떤 배열의 길이로 대체하여 표현한 것
		char[] chars = new char[names.length];
		
//		주소가 출력된다
//		System.out.println(score); 
//		[예외발생]:java.lang.ArrayIndexOutOfBoundsException
//		System.out.println(score[5]); 크기:5, 인덱스:0~4
		
//		배열은 디폴트 초기화가 이루어진다. '0'
		for (int i = 0; i < score.length; i++) {			
			System.out.print(score[i]+" ");
		}
		
		System.out.println();
		
//		배열에서 쓰이는 특별한 for 루프(read only!!!)
		for(int data:score){
			System.out.print(data+" ");
		}
		System.out.println();
		
//		reference type은 초기화가 'null'
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" ");
		}
		
//		char type은 초기화가 ' ' (공백문자)
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]+" ");
		}
	}
	
}

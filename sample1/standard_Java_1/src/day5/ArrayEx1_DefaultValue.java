package day5;

public class ArrayEx1_DefaultValue {

	public static void main(String[] args) {
		String[] names;
		names = new String[3];
		
//		�迭 ����� ������ ���ÿ� �� ��
		int[] score = new int[5];
		
//		ũ�⸦ � �迭�� ���̷� ��ü�Ͽ� ǥ���� ��
		char[] chars = new char[names.length];
		
//		�ּҰ� ��µȴ�
//		System.out.println(score); 
//		[���ܹ߻�]:java.lang.ArrayIndexOutOfBoundsException
//		System.out.println(score[5]); ũ��:5, �ε���:0~4
		
//		�迭�� ����Ʈ �ʱ�ȭ�� �̷������. '0'
		for (int i = 0; i < score.length; i++) {			
			System.out.print(score[i]+" ");
		}
		
		System.out.println();
		
//		�迭���� ���̴� Ư���� for ����(read only!!!)
		for(int data:score){
			System.out.print(data+" ");
		}
		System.out.println();
		
//		reference type�� �ʱ�ȭ�� 'null'
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+" ");
		}
		
//		char type�� �ʱ�ȭ�� ' ' (���鹮��)
		for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]+" ");
		}
	}
	
}

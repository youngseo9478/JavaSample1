package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

//배열의 크기보다 난수의 범위가 작으면 무한루프에 빠진다
public class DuplicationElimination {
	public static void main(String[] args) {
		//리턴 타입이 String이다.
		String size = JOptionPane.showInputDialog("1~45 사이의 숫자를 입력해주세요.");
//		System.out.println(data);
		int[] num = new int[Integer.parseInt(size)];
//		0번째는 어차피 중복 없을테니 그냥 값 넣어준다.
		num[0]=(int)(Math.random()*Integer.parseInt(size)+1);
		for (int i = 1; i < num.length; i++) {
			num[i]=(int)(Math.random()*Integer.parseInt(size)+1);
			for (int j = 0; j < i; j++) {
				if(num[j]==num[i]){
					i--;
					break;
				}
			}
//			이 위치에서 찍어보면 중복되서 변하는 값 확인 가능
//			System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));
	}
}

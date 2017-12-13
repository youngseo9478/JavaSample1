package day4;

public class Prob1 {
	public static void main(String[] args) {
		String strData = "Java Programming";
		System.out.println(strData.length());
//		길이가 16이므로 0~15의 인덱스값을 갖게 됨
		for (int i = 15; i >= 0; i--) {
			System.out.print(strData.charAt(i));
		}
	}
}

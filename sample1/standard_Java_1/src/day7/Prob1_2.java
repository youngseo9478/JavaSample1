package day7;

public class Prob1_2 {
	// 클래스메소드로 바꿈 => 주소필요없고 클래스이름만 알면됨
	public static String leftPad(String str, int size, char padChar) {

		String result = "";
		if (str.length() > size) {
			return str;
		} else {
			int temp = size - str.length();
			for (int i = 0; i < temp; i++) {
				result += padChar;
			}
			return result + str;
		}
	}

	public static void main(String[] args) {
		// static 메소드라 객체생성 필요없고 그냥 "클래스네임.메소드"해주면 된다.
		String s = Prob1_2.leftPad("SDS", 3, '!');
		System.out.println(s);

		
//		초기식이 조건식에 안맞으면 한번도 수행 안됨
//		for (int i = 0; i < 0; i++) {
//			System.out.println("**********");
//		}
	}
}

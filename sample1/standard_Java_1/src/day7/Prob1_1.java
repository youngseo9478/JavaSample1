package day7;

/*****************
 * 
 *
 * 강사님 풀이
 */
public class Prob1_1 {
	public static void main(String args[]) {
		Prob1_1 prob1 = new Prob1_1();

		System.out.println(prob1.leftPad("SDS", 6, '#'));
		
		// Test value print
		 String s= prob1.leftPad("SDS", 6, '#');
		// String s2=prob1.leftPad("SDS", 5, '$');
		// System.out.println(s.equals(s2));
		System.out.println(s.equals("###SDS"));
		
		System.out.println(prob1.leftPad("SDS", 5, '$'));
		System.out.println(prob1.leftPad("SDS", 2, '&'));
		System.out.println(prob1.leftPad("SDS", 3, '&'));
	}

	public String leftPad(String str, int size, char padChar) {

		if (str.length() > size) {
			return str;
		} else {
			// 반복횟수 제대로 잡히는 지 test
			String result = "";
			int temp = size - str.length();
			for (int i = 0; i < temp; i++) {
				result += padChar;
			}
			return result + str;
		}
	}
}

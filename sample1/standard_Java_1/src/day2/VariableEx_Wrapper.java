package day2;

public class VariableEx_Wrapper {
	public static void main(String[] args){
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		char c = 'a';
		System.out.println(Character.isDigit(c));
//		result = false  c는 숫자가 아니라는 것
		
		int num = Integer.parseInt("600");
		System.out.println(num/10);
		System.out.println(Integer.parseInt("600")/10);
		
	}
}

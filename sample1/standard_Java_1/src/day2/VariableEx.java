package day2;

public class VariableEx {
	public static void main(String[] args){

		byte b = 127;
		b = (byte)(b+1);
		System.out.println(b);
//		결과 = -128  (범위때문에 128 다음은 -128이되는것)
		
		byte b2 = (byte)128;
		System.out.println(b2);
//		결과 = -128
		
		int a=3; 
		int b3=3;
		System.out.println(a++);
		System.out.println(++b3);
		System.out.println(a);
		System.out.println(b3);  
		
		char c = 'a';
		System.out.println(c);
		int n = c;
		System.out.println(n);
//		char타입은 int타입으로 프로모션이 가능
		
		
	}
}

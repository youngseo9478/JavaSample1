package day2;

public class VariableEx {
	public static void main(String[] args){

		byte b = 127;
		b = (byte)(b+1);
		System.out.println(b);
//		��� = -128  (���������� 128 ������ -128�̵Ǵ°�)
		
		byte b2 = (byte)128;
		System.out.println(b2);
//		��� = -128
		
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
//		charŸ���� intŸ������ ���θ���� ����
		
		
	}
}

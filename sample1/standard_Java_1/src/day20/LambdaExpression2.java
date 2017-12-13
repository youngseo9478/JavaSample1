package day20;

import javax.print.DocFlavor.INPUT_STREAM;

public class LambdaExpression2 {
	public static void main(String[] args) {
	
		//Anonymous class 구현 방식
		F1 f1 = new F1(){
			@Override
			public int max(int a, int b) {
				return a>b?a:b;
			}
		};
		System.out.println(f1.max(34, 66));
		
		//람다식 구현 방식
		F1 f2 = (int a, int b)->{
			return a>b?a:b;
		};
		System.out.println(f2.max(55, 99));
		
		//구현이 한줄짜리면 괄호와 return생략해도 가능
		F1 f3 = (int a, int b)-> a>b?a:b;
		
		F2 f4 = (int a, int b)->a<b?a:b;
		System.out.println(f4.min(34, 22));
	}
}

@FunctionalInterface
interface F1{
	/**
	 * @param a
	 * @param b
	 * @return a,b 둘 중에 큰 수
	 */
	int max(int a, int b);
}
@FunctionalInterface
interface F2{
	/**
	 * @param a
	 * @param b
	 * @return a,b 둘 중 작은 수
	 */
	int min(int a, int b);
}

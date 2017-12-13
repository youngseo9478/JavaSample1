package day3;

public class OperationEx1 {

	public static void main(String[] args) {
		System.out.println(0.1d==0.1f);
		System.out.println(0.1d==(double)0.1f);
		System.out.println(0.1f==0.1);
//		System.out.println(0.1f==(double)(0.1+0.0));
//		얼핏보기에는 같아보이지만 정밀도에서 차이가 발생하기때문에 다름
	}
	
}

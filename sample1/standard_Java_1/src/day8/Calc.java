package day8;
/****************
 * method overloading
 * 
 * @author student
 *
 */
public class Calc {

//	이 메소드들은 결과가 바뀌지 않고 모든 클래스에 동일하기 때문에 static으로 공유해서 사용하는 것
//	public static int add(){
//		return 0;
//	}
//	public static int add(int a, int b){
//		return a+b;
//	}
//	public static int add(int a, int b, int c){
//		return a+b+c;
//	}
	/**
	 * 
	 * @param a 더하기 할 데이터
	 * @return 합계
	 */
	public static int add(int...a){
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
//	int...을 모른다면? => 이 표현과 배열표현과 같은 뜻! 그래서 중복불가
//	public static int add(int[] a){
//		return sum;
//	}
	
	public static double add(double...a){
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
}

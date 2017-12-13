package day7;

public class MethodEx_Clac {
	int num;
	static int sub(int i, int j) {
		return i-j;
	}

	static int add(int x, int y) {
//		return num+y; 불가능! 에러!
		return x+y;
	}
	
	static int multi(int x, int y){
		return x*y;
	}
	
	static double div(int x, int y){
		return x/y;
	}
}

package day2;

public class VariableEx_Swap {
	public static void main(String[] args) {
		int x=600, y=700, temp;
//		System.out.println("x="+x+","+"y="+y);
		System.out.printf("x = %d , y = %d \n",x,y);
		temp=x;
		x=y;
		y=temp;
//		System.out.println("x="+x+","+"y="+y);
		System.out.printf("x = %d , y = %d",x,y);
	}
}

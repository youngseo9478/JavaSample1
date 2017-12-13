package day4;

public class WhileEx1 {

	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			System.out.println("Hello java");
			i++;
		}
		
		boolean flag = true;
		while(flag){
			System.out.println("~~~~~~~~~");
//			if(i==5) flag = !flag;
			if(i==5) break;
		}
		
		System.out.println("Main end");
		
	}

}

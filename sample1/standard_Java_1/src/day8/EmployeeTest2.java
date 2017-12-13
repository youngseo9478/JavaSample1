package day8;

public class EmployeeTest2 {
	public static void main(String[] args) {
		String s1 = new String();
		System.out.println(s1);
		
		String s2 = new String("HELLO");
		System.out.println(s2);
		
		char[] c = {'a','b','c','d','e'};
		String s3 = new String(c,0,4); //쪼개서 0번인덱스부터 4개를 찍겠다.
		System.out.println(s3);
	}
}

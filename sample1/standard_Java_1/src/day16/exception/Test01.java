package day16.exception;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");
		String name = null;
		if(name != null && name.length()>0){
			System.out.println(name.charAt(0));
		}
		
		try{
			Class.forName("day16.exception.Sample");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			System.out.println("Ŭ���� �̸� Ȯ�� �ʿ�");
		}
		
		System.out.println("main end");
	}
}
class Sample{
	
}
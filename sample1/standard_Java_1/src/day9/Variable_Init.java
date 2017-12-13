package day9;

public class Variable_Init {
	public static void main(String[] args) {
		
		System.out.println("start");
		BlockTest b1 = new BlockTest();
		BlockTest b2 = new BlockTest();
		System.out.println("end");
		
	}
}


class BlockTest{
	
//	딱 한번만 수행 됨 
	static{
		System.out.println("static{ }");
	}
	
//	초기화 블럭 : 객체생성 횟수만큼 생성자보다 먼저 수행 됨
	{
		System.out.println("{ }");
	}
	
//	생성자
	public BlockTest(){
		System.out.println("BlockTest() 기본 생성자");
	}
}
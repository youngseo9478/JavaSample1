package day9;

public class Variable_Init2 {
	public static void main(String[] args) {

		System.out.println("start");
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serialNum);
		System.out.println(p2.serialNum);
		System.out.println(p3.serialNum);
		
	/*	System.out.println(p1.count);
		System.out.println(p2.count);
		System.out.println(p3.count);
		
		static 변수는 클래스네임으로 접근해주는 것이 좋다*/
		System.out.println(Product.count);
		
		System.out.println("end");

	}
}

class Product {

	static int count = 0;
	int serialNum;

	static {
//		System.out.println("static{ }");
		
//		serialNum=0; static에서는 heap영역 사용할 수 없다.
		count=0; // static변수이기 때문에 사용할 수 있다.
	}

	{
//		System.out.println("{ }");
		++count;
		serialNum = count;
	}

	public Product() {
//		System.out.println("Product() 기본 생성자");
	}

}
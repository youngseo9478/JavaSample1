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
		
		static ������ Ŭ������������ �������ִ� ���� ����*/
		System.out.println(Product.count);
		
		System.out.println("end");

	}
}

class Product {

	static int count = 0;
	int serialNum;

	static {
//		System.out.println("static{ }");
		
//		serialNum=0; static������ heap���� ����� �� ����.
		count=0; // static�����̱� ������ ����� �� �ִ�.
	}

	{
//		System.out.println("{ }");
		++count;
		serialNum = count;
	}

	public Product() {
//		System.out.println("Product() �⺻ ������");
	}

}
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
	
//	�� �ѹ��� ���� �� 
	static{
		System.out.println("static{ }");
	}
	
//	�ʱ�ȭ �� : ��ü���� Ƚ����ŭ �����ں��� ���� ���� ��
	{
		System.out.println("{ }");
	}
	
//	������
	public BlockTest(){
		System.out.println("BlockTest() �⺻ ������");
	}
}
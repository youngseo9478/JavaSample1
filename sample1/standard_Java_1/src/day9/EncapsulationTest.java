package day9;

public class EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationEx emp1 = new EncapsulationEx();
		
		emp1.setName("youngseo");
		emp1.setSalary(4000);
		emp1.setSsn("00000-00000");
		emp1.display();
		System.out.println(emp1.getSalary()*0.01);
		
	/*	
	 * private ������ �̷��� ���� �Ұ�(���� Ŭ������������ ���� ����)
	 * emp1.name=	"ȫ�浿";
		emp1.salary=50000;
		emp1.ssn = "111-11111";
		emp1.display();
		System.out.println(emp1.salary*0.01);*/
	}
}

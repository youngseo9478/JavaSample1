package day2;
//import�� ȯ�溯�� ������ �н��� ����ִ°Ͱ� ���� �ǹ�
import java.util.Date;
//��� util.Date�ε� �ٸ� �ϳ��� sql.Date�� �� �� ���� 
//�ϳ��� Ǯ�н��� �ۼ��ؾ���

public class VariableEx_gcEx {
	public static void main(String[] args){
//		import���� ������ Ǯ�н��� �Է������ ������ �ȳ�
//		import ����Ű ctrl+shift+'o'
		Date now = new Date();
		System.out.println(now);
		
//		System.out.println(now.getYear());
//		������ �����ؼ� ������ Ķ���� Ŭ������ �̿��ϱ⸦ ����
		
//		���ú����� �� �ʱ�ȭ �ʿ�
		java.sql.Date today = null;
		System.out.println(today);
//		null�� ����Ű�� ���� ���� ��
		
		now=null; //�ּҿ���� ���°�. 
//		�������÷����� �˾Ƽ� �޸� ������ ���شٰ��ص� 
//		�޸𸮰� �������� �޸𸮴��� ������ ��Ÿ���⶧���� ������ �ʿ�
		
	}
}

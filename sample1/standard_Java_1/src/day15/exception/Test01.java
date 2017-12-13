package day15.exception;
//unchecked exception ����
public class Test01 {
	public static void main(String[] args) {
		System.out.println("START");
		try {
			System.out.println("try{");
			System.out.println(args[0].length()); // ���ܹ߻�
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("������ �� ���� �迭 �ε��� ���..");
		} catch(NumberFormatException e){
			System.out.println("������ ������ �Ұ����� �������Դϴ�.");
			e.printStackTrace(); //���ο� �⺻���� �����޼���(������)
			System.out.println(e); //�����޼��� ���(������)
			System.out.println(e.getMessage()); 
		} catch(ArithmeticException e){
			System.out.println("0���δ� ���� �� ����.");
		} catch(Exception e){
			System.out.println("~~~~");
		}finally {
			//�ݳ��� �ڿ��� ������ ���⿡�� �����ؾ���
			System.out.println("�ڿ��ݳ��� ���⼭~~");
		}
		System.out.println("END");
	}
}

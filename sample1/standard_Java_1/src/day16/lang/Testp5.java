package day16.lang;

public class Testp5 {
	public static void main(String[] args) {
		
		//new�� ���� heap�� �ö󰡰� new�� �Ⱦ��� ...code������ �ö󰣴�.
		String msg = "Hello Java Test~~~~~~";
		System.out.println(msg);
		
		//�������� ���� �ȹٲ� String�� �б������̱⶧��!@!!!
		msg.replace('~', '!');
		System.out.println(msg);
		//return�� ���ִµ� ������ ���������� �ʱ⶧���� �̷����ϸ� �ٲﰪ�� ���� ���� �ִ�.
		System.out.println(msg.replace('~', '!'));
		
		
		System.out.println();
		System.out.println("______________________________");
		msg.concat(" sample");
		System.out.println(msg);
		System.out.println(msg.concat(" sample"));
		
		System.out.println();
		System.out.println("____________��Ʈ������____________");
		//������ ����ؼ� �ٲ� 
		//�а� ���Ⱑ �����ϴ�. (��Ʈ������, ��Ʈ������)
		StringBuffer sb = new StringBuffer("StringBuffer test");
		System.out.println(sb);
		sb.reverse(); //��� ������ �ٲ�
		System.out.println(sb);
		sb.reverse(); //�ٽ� ������ ��
		System.out.println(sb);
		sb.append(" Sample");
		System.out.println(sb);
		
		System.out.println();
		System.out.println("______________________________");
		String s = sb.toString(); //��Ʈ�����۸� ��Ʈ������ �ٲٴ� ���� �ſ� ����~~
		System.out.println(s);
	}
}

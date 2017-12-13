package day14.command;

public class Test03 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		//�� ����� Ŭ������ ��ü�� ����ڴٴ� �ǹ�
		//������ Ÿ�ӿ� �޸𸮿� �ö� ��ü�� �����ȴ�.
		cmd = new day14.command.Delete();
		
		//��ɷ� ��ü�� �������� ��Ÿ�ӿ� ������ ��쿡�� ������ ���� ���ش�.
		//��Ÿ�ӿ� ���� �� �ִ� ���� string�ۿ� ����.
		//Ŭ������ �̸��� �Ѱܹ޴°� forName�ΰ�
		//������ Ÿ�ӿ� üũ �Ұ��� =>��ã���� ���ܹ߻� �׷��� ����ó���� �� ���־����
		//���ݰ� ���� ���������� ���� **���� ������ �ڵ�**
		Class cls = Class.forName(args[0]);
		cmd = (Command)cls.newInstance(); //��ü ����
		cmd.execute();
		
	}
}

package day14.command;
//���Ȯ���� ������ �ڵ�
public class CommandTest2 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		//args[0]�� ������ Ÿ���� string..=>path�� Ǯ�� �Է��ؾ��Ѵ�.
		Class cls = Class.forName(args[0]); //�Ķ���ͷ� Ŭ���������� �ް�
		cmd = (Command)cls.newInstance(); //�޸𸮿� �ø���.
		//cls�� ������ƮŸ���̹Ƿ� CommandŸ������ ĳ���ø� ���ִ� ��
		//Command�� �ڽ��� ����� �����ְԵ�
		cmd.execute();
	}
}

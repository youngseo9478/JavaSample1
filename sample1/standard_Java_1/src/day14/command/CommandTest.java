package day14.command;
//���Ȯ���� ������ �ڵ�
public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null;
		
		if(args.length==0){
			System.out.println("���ϴ� ����� �Է����ּ���");
			return;
		}
//		�̷��� �ϴµ��� ������ �ִ�.
// 		���ο� ����� �߰��ϰԵǸ� ���� if else���� �߰�������ϴµ�
// 		�� ���� �������� �����ϰ� , �߰��Ҷ����� ���α׷��� �׿��� ������Ѵ�(�ſ�ſ����)
 		if(args[0].equalsIgnoreCase("delete")){
			cmd = new Delete();
		}else if(args[0].equalsIgnoreCase("insert")){
			cmd = new Insert();
		}else if(args[0].equalsIgnoreCase("update")){
			cmd = new Update();
		}
		
		cmd.execute();
		cmd.newMethod();
	}
}

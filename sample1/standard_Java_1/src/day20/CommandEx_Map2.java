package day20;

import java.util.HashMap;
import java.util.Map;
//map���� �ϸ� ����� �߰��Ǿ ���� ��
public class CommandEx_Map2<Interface> {
	public static void main(String[] args) {
		Map<String, Command> map = new HashMap<>();
		Command[] cmd = { 
				new DeleteCommand(), 
				new UpdateCommand(), 
				new SelectCommand(), 
				new InsertCommand() 
		};
		
		for (int i = 0; i < cmd.length; i++) {
			map.put(cmd[i].getClass().getSimpleName(), cmd[i]);
		}
		
		if (args.length == 0) {
			System.out.println("delete/update/select/insert �� �ϳ��� �Է����ּ���.");
			return;
		}
		if (!map.containsKey(args[0])){
			System.out.println(args[0]+" ����� �������� �ʽ��ϴ�.");
			return;
		}
		
		map.get(args[0]).exec();
		
		System.out.println("Main End");
	}
}

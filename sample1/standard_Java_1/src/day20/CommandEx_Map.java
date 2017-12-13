package day20;

import java.util.HashMap;
import java.util.Map;
//map���� �ϸ� ����� �߰��Ǿ ���� ��
public class CommandEx_Map<Interface> {
	public static void main(String[] args) {
		Map<String, Command> map = new HashMap<>();
		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
		//key���� ���ٸ� command�� ������ �ƹ��� ��ü�� ������ �ȵȴ� =>null
		if(args.length==0){
			System.out.println("args�� �Ѱ��ּ���");
			return;
		}
		Command command = map.get(args[0]);
		if(command==null){
			System.out.println(args[0]+" ����� �������� �ʽ��ϴ�.");
			return;
		}
		command.exec();
		System.out.println("Main End");
	}
}

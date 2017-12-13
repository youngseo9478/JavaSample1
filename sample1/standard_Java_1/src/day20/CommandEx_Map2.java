package day20;

import java.util.HashMap;
import java.util.Map;
//map으로 하면 기능이 추가되어도 수정 편리
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
			System.out.println("delete/update/select/insert 중 하나를 입력해주세요.");
			return;
		}
		if (!map.containsKey(args[0])){
			System.out.println(args[0]+" 기능은 지원하지 않습니다.");
			return;
		}
		
		map.get(args[0]).exec();
		
		System.out.println("Main End");
	}
}

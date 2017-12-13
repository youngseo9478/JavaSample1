package day20;

import java.util.HashMap;
import java.util.Map;
//map으로 하면 기능이 추가되어도 수정 편리
public class CommandEx_Map<Interface> {
	public static void main(String[] args) {
		Map<String, Command> map = new HashMap<>();
		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
		//key값이 없다면 command에 어차피 아무런 객체가 대입이 안된다 =>null
		if(args.length==0){
			System.out.println("args를 넘겨주세요");
			return;
		}
		Command command = map.get(args[0]);
		if(command==null){
			System.out.println(args[0]+" 기능은 지원되지 않습니다.");
			return;
		}
		command.exec();
		System.out.println("Main End");
	}
}

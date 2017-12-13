package day14.command;
//기능확장이 불편한 코드
public class CommandTest {
	public static void main(String[] args) {
		Command cmd = null;
		
		if(args.length==0){
			System.out.println("원하는 기능을 입력해주세요");
			return;
		}
//		이렇게 하는데는 문제가 있다.
// 		새로운 기능을 추가하게되면 역시 if else문을 추가해줘야하는데
// 		그 수가 많아지면 복잡하고 , 추가할때마다 프로그램을 죽였다 살려야한다(매우매우불편)
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

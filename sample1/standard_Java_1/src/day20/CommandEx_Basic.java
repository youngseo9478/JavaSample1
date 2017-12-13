package day20;
//===>���ٽ����� ���� ����
public class CommandEx_Basic<Interface> {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		if(args.length==0){
			System.out.println("delete/update/select/insert �� �ϳ��� �Է����ּ���.");
			return;
		}
		if(args[0].equals("delete")){
			delete.exec();
		}else if(args[0].equals("update")){
			update.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else{
			System.out.println(args[0]+" ����� ������ �ȵ˴ϴ�.");
		}
		
		System.out.println("Main End");
	}
}


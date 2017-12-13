package day20;

public class CommandEx_Anno {
	public static void main(String[] args) {
		Command delete = new Command(){
			@Override
			public void exec() {
				System.out.println("delete ����� �����Ͽ����ϴ�.");
			}
		};
		Command update = new Command(){
			@Override
			public void exec() {
				System.out.println("update ����� �����Ͽ����ϴ�.");
			}
		};
		Command select = new Command(){
			@Override
			public void exec() {
				System.out.println("select ����� �����Ͽ����ϴ�.");
			}
		};
		Command insert = new Command(){
			@Override
			public void exec() {
				System.out.println("insert ����� �����Ͽ����ϴ�.");
			}
		};
		
		insert.exec();
		delete.exec();
		select.exec();
		update.exec();
	}
}

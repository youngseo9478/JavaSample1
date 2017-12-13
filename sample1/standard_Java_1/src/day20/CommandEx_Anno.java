package day20;

public class CommandEx_Anno {
	public static void main(String[] args) {
		Command delete = new Command(){
			@Override
			public void exec() {
				System.out.println("delete 기능을 수행하였습니다.");
			}
		};
		Command update = new Command(){
			@Override
			public void exec() {
				System.out.println("update 기능을 수행하였습니다.");
			}
		};
		Command select = new Command(){
			@Override
			public void exec() {
				System.out.println("select 기능을 수행하였습니다.");
			}
		};
		Command insert = new Command(){
			@Override
			public void exec() {
				System.out.println("insert 기능을 수행하였습니다.");
			}
		};
		
		insert.exec();
		delete.exec();
		select.exec();
		update.exec();
	}
}

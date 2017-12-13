package day14.command;

public interface Command {
	public abstract void execute();
	default void newMethod(){
		System.out.println("~~~~~~~~~~~~");
	};
}

class Update implements Command{

	@Override
	public void execute() {
		System.out.println("���� ��� ����");
	}

}
class Delete implements Command{

	@Override
	public void execute() {
		System.out.println("���� ��� ����");
	}
	//�ʿ��Ҷ��� ����Ʈ�޼��� �������̵�
	@Override
	public void newMethod(){
//		Command.super.newMethod();
		System.out.println("++++++++++++++++");
	}

}
class Insert implements Command{

	@Override
	public void execute() {
		System.out.println("��� ��� ����");
	}

}
class Select implements Command{

	@Override
	public void execute() {
		System.out.println("���� ��� ����");
	}

}
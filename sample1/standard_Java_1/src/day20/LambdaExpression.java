package day20;

public class LambdaExpression {
	public static void main(String[] args) {
		// ���ٽ� ������ �Լ� ���
		Command delete = () -> {
			System.out.println("delete ����~~~~~");
		};
		Command update = () -> {
			System.out.println("update ����~~~~~");
		};
		Command insert = () -> {
			System.out.println("insert ����~~~~~");
		};
		Command select = () -> {
			System.out.println("select ����~~~~~");
		};
		
		delete.exec();
		delete.print();
	}
}

@FunctionalInterface // �߻�޼ҵ尡 �ϳ��� �������̽�
interface Command {
	abstract void exec();
	default void print(){
		System.out.println("******************");
	}
}

// @FunctionalInterface ��� �߻�޼ҵ尡 2���� �ȵȴ�.
interface A {
	void go();

	void stop();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("delete ����");
	}
}

class InsertCommand implements Command {
	@Override
	public void exec() {
		System.out.println("insert ����");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("update ����");
	}

}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("select ����");
	}

}
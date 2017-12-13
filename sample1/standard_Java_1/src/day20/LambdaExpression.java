package day20;

public class LambdaExpression {
	public static void main(String[] args) {
		// 람다식 변수에 함수 등록
		Command delete = () -> {
			System.out.println("delete 수행~~~~~");
		};
		Command update = () -> {
			System.out.println("update 수행~~~~~");
		};
		Command insert = () -> {
			System.out.println("insert 수행~~~~~");
		};
		Command select = () -> {
			System.out.println("select 수행~~~~~");
		};
		
		delete.exec();
		delete.print();
	}
}

@FunctionalInterface // 추상메소드가 하나인 인터페이스
interface Command {
	abstract void exec();
	default void print(){
		System.out.println("******************");
	}
}

// @FunctionalInterface 얘는 추상메소드가 2개라서 안된다.
interface A {
	void go();

	void stop();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("delete 수행");
	}
}

class InsertCommand implements Command {
	@Override
	public void exec() {
		System.out.println("insert 수행");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("update 수행");
	}

}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("select 수행");
	}

}
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
		System.out.println("변경 기능 수행");
	}

}
class Delete implements Command{

	@Override
	public void execute() {
		System.out.println("삭제 기능 수행");
	}
	//필요할때만 디폴트메서드 오버라이딩
	@Override
	public void newMethod(){
//		Command.super.newMethod();
		System.out.println("++++++++++++++++");
	}

}
class Insert implements Command{

	@Override
	public void execute() {
		System.out.println("등록 기능 수행");
	}

}
class Select implements Command{

	@Override
	public void execute() {
		System.out.println("선택 기능 수행");
	}

}
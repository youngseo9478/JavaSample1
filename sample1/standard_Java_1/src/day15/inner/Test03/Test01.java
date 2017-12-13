package day15.inner.Test03;

public class Test01 {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		boolean flag = true;

		// delete.exec();
		// 익명클래스로 선언하는 방법
		// Command라고하는 인터페이스를 구현한 객체가 와야함
		// new Command(){}; Command라는 인터페이스를 구현하는 객체를 선언할건데 이름이 없다.
		// new Insert implements Command인건데 객체를 생성하는 부분이니까 () 해줘서
		// 생성자 함수를 호출하면서 추상메소드를 마저 구현하기 위해 {}안에 구현하는것...
		// implements말고 extends를 생략하는 것도 가능하다.
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("등록하였습니다.");
			}
		};

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("수정되었습니다.");
			}
		};
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("목록뿌리기실행");
			}
		};
		Command search = new Command() {
			@Override
			public void exec() {
				System.out.println("검색되었습니다.");
			}
		};

		if (args.length == 0) {
			System.out.println("select | update | delete | insert | search ");
			System.out.println("위의 값 중에 하나를 파라미터로 입력해주세요");
			return;
		}

		switch (args[0]) {
		case "delete":
			delete.exec();
			break;
		case "search":
			search.exec();
			break;
		case "select":
			select.exec();
			break;
		case "update":
			update.exec();
			break;
		case "insert":
			insert.exec();
			break;
		default:
			System.out.println("해당하는 기능이 존재하지 않습니다.");
			System.out.println("select | update | delete | insert | search ");
			System.out.println("위의 값 중에 하나를 파라미터로 입력해주세요");
			break;
		}

		/*
		 * if(args[0].equalsIgnoreCase("search")){ search.exec(); }else
		 * if(args[0].equalsIgnoreCase("select")){ select.exec(); }else
		 * if(args[0].equalsIgnoreCase("delete")){ delete.exec(); }else
		 * if(args[0].equalsIgnoreCase("insert")){ insert.exec(); }else
		 * if(args[0].equalsIgnoreCase("update")){ update.exec(); }else {
		 * System.out.println("해당 기능이 존재하지 않습니다."); return; }
		 */
	}
}

// 인터페이스라 메모리에 올라갈 수 없다 => 구현이 되야 가능
interface Command {
	void exec();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("삭제되었습니다.");
	}
}
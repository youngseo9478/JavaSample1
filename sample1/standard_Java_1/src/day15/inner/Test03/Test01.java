package day15.inner.Test03;

public class Test01 {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();
		boolean flag = true;

		// delete.exec();
		// �͸�Ŭ������ �����ϴ� ���
		// Command����ϴ� �������̽��� ������ ��ü�� �;���
		// new Command(){}; Command��� �������̽��� �����ϴ� ��ü�� �����Ұǵ� �̸��� ����.
		// new Insert implements Command�ΰǵ� ��ü�� �����ϴ� �κ��̴ϱ� () ���༭
		// ������ �Լ��� ȣ���ϸ鼭 �߻�޼ҵ带 ���� �����ϱ� ���� {}�ȿ� �����ϴ°�...
		// implements���� extends�� �����ϴ� �͵� �����ϴ�.
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("����Ͽ����ϴ�.");
			}
		};

		Command update = new Command() {
			@Override
			public void exec() {
				System.out.println("�����Ǿ����ϴ�.");
			}
		};
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("��ϻѸ������");
			}
		};
		Command search = new Command() {
			@Override
			public void exec() {
				System.out.println("�˻��Ǿ����ϴ�.");
			}
		};

		if (args.length == 0) {
			System.out.println("select | update | delete | insert | search ");
			System.out.println("���� �� �߿� �ϳ��� �Ķ���ͷ� �Է����ּ���");
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
			System.out.println("�ش��ϴ� ����� �������� �ʽ��ϴ�.");
			System.out.println("select | update | delete | insert | search ");
			System.out.println("���� �� �߿� �ϳ��� �Ķ���ͷ� �Է����ּ���");
			break;
		}

		/*
		 * if(args[0].equalsIgnoreCase("search")){ search.exec(); }else
		 * if(args[0].equalsIgnoreCase("select")){ select.exec(); }else
		 * if(args[0].equalsIgnoreCase("delete")){ delete.exec(); }else
		 * if(args[0].equalsIgnoreCase("insert")){ insert.exec(); }else
		 * if(args[0].equalsIgnoreCase("update")){ update.exec(); }else {
		 * System.out.println("�ش� ����� �������� �ʽ��ϴ�."); return; }
		 */
	}
}

// �������̽��� �޸𸮿� �ö� �� ���� => ������ �Ǿ� ����
interface Command {
	void exec();
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("�����Ǿ����ϴ�.");
	}
}
package util;

public class Account {

	String name;
	String account;
	int balance;

	public Account() {
		this("OOO", "XXXXXX-XX-XXXXXX", 0);
	}

	public Account(String name, String acount, int balance) {

		this.name = name;
		this.account = acount;
		this.balance = balance;

	}

	public void deposit(int money) {

		if (money > 0) {
			this.balance += money;
			System.out.printf("%s�� ���¿� %d���� �ԱݵǾ����ϴ�.\n",name, money);
			System.out.printf("�ŷ� �� �ܾ� : %d��\n", this.balance);
			System.out.println();
		} else {
			System.out.println("�߸��� �ݾ��Դϴ�. �ٽ� �Է����ּ���.");
			System.out.println();
		}
	}

	public void withdraw(int money) {
		if (money>0&&money <= balance) {
			this.balance -= money;
			System.out.printf("%s�� ���¿��� %d���� ��ݵǾ����ϴ�.\n", name,money);
			System.out.printf("�ŷ� �� �ܾ� : %d��\n", this.balance);
			System.out.println();
		} else if (money > balance) {
			System.out.println("�ܰ� �����Դϴ�.");
			System.out.printf("���� ������ �ܰ�� %d�� �Դϴ�.\n ", balance);
			System.out.println();
		} else if (money < 0) {
			System.out.println("�߸��� �ݾ��Դϴ�.");
			System.out.println();
		}
	}

	public void transfer(Account to, int money) {
		if(to==null){
//			Object�� �� �ּҷ� �׻� null������ Ȯ���غ����� 
			System.out.println("���� ������ Ȯ���ϼ���");
			return;
		}
		if(money>balance){
			System.out.println("�ܰ� �����Դϴ�.");
			System.out.println("���� ��ü ����");
			return;
		}
		System.out.println();
		System.out.println("[��ݰ���]");
		accountInfo();
		System.out.println();
		System.out.println("[�Աݰ���]");
		to.accountInfo();
		System.out.println();
		System.out.println("---------------������ü ���� ��---------------");
		System.out.println();
		withdraw(money);
		to.deposit(money);

		// ���⼭ db�� transaction ������ �� �����
		// ȣ��� �Լ��� ��� ���� �� ���� �ڵ带 �����ؾ� ������� �̻��� ����.
		System.out.println("-----------------������ü �Ϸ�----------------");

		/*
		 * �̷��� �س����� �տ� this�� ������ �� �׷� �ᱹ �� ���忡�� ����ϰ� �ٽ� �Ա��ϴ� �� �� �޼ҵ�� �ν��Ͻ�
		 * �޼ҵ��̱⶧��! �׷��� �� ���Ͱ��� �ڵ������ �츮�� ���ϴ� ������ü �Լ��� ��
		 * 
		 * withdraw(money); deposit(money);
		 */
	}

	public void accountInfo() {
		System.out.printf("=========== %s�� ���� ���� ==========\n", name);
		System.out.printf("�����ָ� : %s\n���¹�ȣ : %s%n�ܰ� : %d%n", name, account, balance);
		System.out.printf("========================================\n");

	}
}

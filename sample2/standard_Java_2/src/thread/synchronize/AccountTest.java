package thread.synchronize;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("main start");
		Account acc1 = new Account("ȫ�浿", 1200);
		// �����ϳ� ���� �� ���¿� ����� ī�� �߱�
		Job j1 = new Job(acc1);
		Job j2 = new Job(acc1);
		// ������ �������ε� �� �� �ְ�, ī��ε� �� �� �ְ� �Ǿ���.
		Thread job1 = new Thread(j1, "����");
		Thread job2 = new Thread(j2, "ī��");

		job1.start();
		job2.start();

		System.out.println("main end");

	}
}

class Job implements Runnable {
	Account scc;

	Job() {
	}

	Job(Account scc) {
		this.scc = scc;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			int money = (int) (Math.random() * 3 + 1) * 100;
//			if (scc.getMoney() >= money)
				scc.withdraw(money);
		}
	} // end of run()
}

class Account {
	private String name;
	private int money;

	public void withdraw(int money) {
		if (this.money >= money) {
			synchronized (this) {
				//�̹� ���� ��������� �ϴ� �ͺ���  �޼ҵ� ��ü�� ����ȭ�� �Ŵ°� ����.
				//����ɸ��� ���� if���� ����Ǳ� ������ �ܰ� �ǽð� �ε��� �ȵǴ� ��찡 �ְ�
				//�׷��� �ܰ��� �� ū ���� ����Ϸ��� ��쵵 ����Ǿ������.(�������׽�Ʈ�ϸ� ����)
				this.money -= money;
				System.out.print(Thread.currentThread().getName());
				System.out.println("__��� " + money + "  => " + toString());
			}
		} else {
			synchronized (this) {
				System.out.print(Thread.currentThread().getName());
				System.out.println("__�ܰ����");
			}
		}
		try {
			Thread.sleep(1000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}// end of withdraw()

	public Account() {
		super();
	}

	public Account(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
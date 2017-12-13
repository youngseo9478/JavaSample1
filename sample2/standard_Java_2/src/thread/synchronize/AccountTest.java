package thread.synchronize;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("main start");
		Account acc1 = new Account("홍길동", 1200);
		// 계좌하나 만들어서 그 계좌와 연결된 카드 발급
		Job j1 = new Job(acc1);
		Job j2 = new Job(acc1);
		// 인출을 통장으로도 할 수 있고, 카드로도 할 수 있게 되었다.
		Thread job1 = new Thread(j1, "통장");
		Thread job2 = new Thread(j2, "카드");

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
				//이번 경우는 하위블락에 하는 것보다  메소드 전체에 동기화를 거는게 낫다.
				//블락걸리기 전에 if문이 수행되기 때문에 잔고가 실시간 로딩이 안되는 경우가 있고
				//그러면 잔고보다 더 큰 돈을 출금하려할 경우도 수행되어버린다.(여러번테스트하면 나옴)
				this.money -= money;
				System.out.print(Thread.currentThread().getName());
				System.out.println("__출금 " + money + "  => " + toString());
			}
		} else {
			synchronized (this) {
				System.out.print(Thread.currentThread().getName());
				System.out.println("__잔고부족");
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
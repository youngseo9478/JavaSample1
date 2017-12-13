package thread.lab4;

public class AccountTest {
	public static void main(String[] args) {
		System.out.println("main start");
		Account acc = new Account("홍길동", 1200);

		Job1 j1 = new Job1(acc);
		Job1 j2 = new Job1(acc);

		Thread job1 = new Thread(j1, "카드");
		Thread job2 = new Thread(j2, "통장");

		job1.start();
		job2.start();

		System.out.println("main end");
	}
}

class Job1 implements Runnable {

	Account scc;

	Job1() {
	}

	Job1(Account scc) {
		this.scc = scc;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			int money = (int) ((Math.random() * 3 + 1) * 100);
			// if(scc.getMoney() >= money)
			scc.withdraw(money);
		}
	}
}

class Account {
	String name;
	int money;

	public Account() {
	}

	public Account(String name, int money) {
		this.name = name;
		this.money = money;
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

	public synchronized void withdraw(int money) {
		if (this.money >= money) {
			this.money -= money;
			System.out.println(Thread.currentThread());
			System.out.println("출금 : " + money + " => " + toString());
		} else {
			System.out.println(Thread.currentThread());
			System.out.println("잔액부족");
		}
	}
}

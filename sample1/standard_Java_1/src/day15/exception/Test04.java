package day15.exception;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("START");
		Account account = new Account("you", -1000);
		System.out.println("---------------------------------");
		account = new Account("원영서",500000);
		System.out.println(account);
		System.out.println("END");
	}
}

class Account {
	String name;
	int money;
	public Account() {
		super();
	}
	public Account(String name, int money) {
		super();
		this.name = name;
		try {
			setMoney(money);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void setMoney(int money) throws Exception {
		if(money<0){
			throw new Exception("money error"); //예외객체 생성한 후 throw
		}
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
}

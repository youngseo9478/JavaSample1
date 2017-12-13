package day16.exception;

public class Test02 {
	public static void main(String[] args) {
		try{
			Account account = new Account("홍길동",100);
			account.setMoney(-500);
			System.out.println(account);
		}catch (MoneyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}
}

class Account{
	private String name;
	private int money;
	public Account() {
		super();
	}
	public Account(String name, int money) throws MoneyException {
		super();
		this.name = name;
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) throws MoneyException {
		if(money<0){
			throw new MoneyException("money는 양수만");
		}
		this.money = money;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
}

class MoneyException extends Exception{
	MoneyException(){
		super("Money Exception");
	}
	MoneyException(String msg){
		super(msg);
	}
}

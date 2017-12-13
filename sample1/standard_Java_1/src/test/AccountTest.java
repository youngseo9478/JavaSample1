package test;

import util.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account("홍길동","001",3000);
		Account a2 = null;
//		Account a2 = new Account("원영서","002",5000);
	
		a1.transfer(a2, 3000);
	}
}

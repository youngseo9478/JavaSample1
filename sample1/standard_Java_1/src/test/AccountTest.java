package test;

import util.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a1 = new Account("ȫ�浿","001",3000);
		Account a2 = null;
//		Account a2 = new Account("������","002",5000);
	
		a1.transfer(a2, 3000);
	}
}

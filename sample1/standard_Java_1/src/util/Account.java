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
			System.out.printf("%s님 계좌에 %d원이 입금되었습니다.\n",name, money);
			System.out.printf("거래 후 잔액 : %d원\n", this.balance);
			System.out.println();
		} else {
			System.out.println("잘못된 금액입니다. 다시 입력해주세요.");
			System.out.println();
		}
	}

	public void withdraw(int money) {
		if (money>0&&money <= balance) {
			this.balance -= money;
			System.out.printf("%s님 계좌에서 %d원이 출금되었습니다.\n", name,money);
			System.out.printf("거래 후 잔액 : %d원\n", this.balance);
			System.out.println();
		} else if (money > balance) {
			System.out.println("잔고 부족입니다.");
			System.out.printf("현재 고객님의 잔고는 %d원 입니다.\n ", balance);
			System.out.println();
		} else if (money < 0) {
			System.out.println("잘못된 금액입니다.");
			System.out.println();
		}
	}

	public void transfer(Account to, int money) {
		if(to==null){
//			Object는 곧 주소로 항상 null인지를 확인해봐야함 
			System.out.println("계좌 정보를 확인하세요");
			return;
		}
		if(money>balance){
			System.out.println("잔고 부족입니다.");
			System.out.println("계좌 이체 종료");
			return;
		}
		System.out.println();
		System.out.println("[출금계좌]");
		accountInfo();
		System.out.println();
		System.out.println("[입금계좌]");
		to.accountInfo();
		System.out.println();
		System.out.println("---------------계좌이체 진행 중---------------");
		System.out.println();
		withdraw(money);
		to.deposit(money);

		// 여기서 db의 transaction 개념이 들어가 줘야함
		// 호출된 함수가 모두 끝난 후 다음 코드를 수행해야 결과값에 이상이 없다.
		System.out.println("-----------------계좌이체 완료----------------");

		/*
		 * 이렇게 해놓으면 앞에 this가 생략된 것 그럼 결국 내 통장에서 출금하고 다시 입금하는 꼴 이 메소드는 인스턴스
		 * 메소드이기때문! 그래서 꼭 위와같이 코딩해줘야 우리가 원하는 계좌이체 함수가 됨
		 * 
		 * withdraw(money); deposit(money);
		 */
	}

	public void accountInfo() {
		System.out.printf("=========== %s님 계좌 정보 ==========\n", name);
		System.out.printf("예금주명 : %s\n계좌번호 : %s%n잔고 : %d%n", name, account, balance);
		System.out.printf("========================================\n");

	}
}

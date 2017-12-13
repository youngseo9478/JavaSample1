package day4;

import java.util.Scanner;

public class SwitchEx2_Menu {
	public static void main(String[] args) {

		String command;
//		스캐너 객체를 반복문 안에 넣으면 문제발생! 
//		계속 다른 주소에 스캐너 객체를 생성하게 되는 것!
//		밖에서 생성해놓고 안에서는 이용만 하는 것
		Scanner scanner = new Scanner(System.in);; 
		
		while (true) {
			System.out.println("******************OOO프로그램******************\n");
			System.out.println("1. insert\n");
			System.out.println("2. delete\n");
			System.out.println("3. update\n");
			System.out.println("4. quit\n");
			System.out.println("***********************************************");
			System.out.println("원하시는 작업의 이름이나 번호를 입력해주세요\n");

			command = scanner.nextLine();

			switch (command) {
			case "insert":
			case "1":
				System.out.println("등록되었습니다.\n");
				break;
			case "delete":
			case "2":
				System.out.println("삭제되었습니다.\n");
				break;
			case "update":
			case "3":
				System.out.println("업데이트되었습니다.\n");
				break;
			case "quit":
			case "4":
				System.out.println("종료되었습니다.\n");
				System.exit(0);
				break;
			default:
				System.out.println("잘못입력하셨습니다.\n");
			}
			if(command=="4"||command=="quit") break;
		}
//		[에러원인] : 반복문안에서 계속 스캐너를 이용해야하기때문에
//		반복문안에서 스캐너를 닫아버리면 안된다. 모든 작업이 끝난 후!
		scanner.close();
	}
}

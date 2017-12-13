package day2;

import java.util.Scanner;

public class VariableEx_Scanner {

	public static void main(String[] args) {
		Scanner input = null;
		// 어디서 뭘 받을 건지 정해줘야하는데 키보드로 받을거니까 in
		input = new Scanner(System.in);
		System.out.print("학생 이름을 입력하세요 : ");
		// String은 참조형 타입이지만 기본형처럼 사용하는게 보편적
		// String name = "홍길동"; 생략된 것과 (기본형처럼)
		// String name = new String("홍길동"); 이거랑 같은 기능
		// but 메모리 영역에서는 조금 차이가 있다.
		String name = input.nextLine();
		System.out.print("점수를 입력하세요 ex)90 : ");
		// parse 이용해서 문자열을 정수로 바꿀 수도 있으므로 두가지 방법있다
		int score = input.nextInt();
		input.nextLine();
//		위에두줄을 한줄로 줄인 코드 -> nextInt는 숫자와 엔터까지 가져오는 문제가있다.
//		그래서 그 부분을 잘라주기위해 nextLine()으로 한번 더 처리해줘야한다.
//		int score2 = Integer.parseInt(input.nextLine()); 파싱과정이있다.

		System.out.printf("이름 : %s %n점수 : %d %n", name, score);

		// 자원을 반납하지 않으면 보안상 문제가 발생하기 때문에 꼭 닫아줘야함
		input.close();
		input = null;
	}

}

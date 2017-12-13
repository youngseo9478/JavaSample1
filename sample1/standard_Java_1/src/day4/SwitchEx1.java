package day4;

import java.util.Scanner;

public class SwitchEx1 {
	public static void main(String[] args) {
		char gender;
		String regNo;
		Scanner scanner = new Scanner(System.in);

		// 예시를 줬지만 유효한 데이터를 입력하지 않을 수 있음
		System.out.print("주민등록번호를 입력하세요[예999999-9999999]:");
		regNo = scanner.nextLine();
		scanner.close();

		// 유효성검증(단순히 14글자가 되는지만 검증해보기로)
		if (regNo.length() != 14) {
			System.out.println("주민등록번호 형식 에러");
			return;
		}
		
		// regNo[7]을 표현하는 방법이 charAt
		gender = regNo.charAt(7);
		System.out.println(regNo + "=>" + gender);// 1 2 3 4

//		if버전
		if (gender == '1' || gender == '3') {
			System.out.println("남자");
		} else if (gender == '2' || gender == '4') {
			System.out.println("여자");
		} else {
			System.out.println("등록되지않은 주민등록번호입니다");
		}
		
//		switch버전
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남성");
			break;
		case '2':
		case '4':
			System.out.println("여성");
			break;
		default:
			System.out.println("등록되지않은 주민등록번호입니다");
		}
		

	}
}

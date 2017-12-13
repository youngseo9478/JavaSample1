package day16.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		// 이렇게 괄호안에 해주면 **자동 자원 반환**을 수행하기때문에 finally에서 자원반납할 필요 X
		try (FileInputStream fis = new FileInputStream("sample3.txt");) {
			System.out.println("작업 처리");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample2.txt문서를 준비하세요");
		} catch (Exception e) {
			// 모든 다른 예외를 여기서 잡아주는 것
		} finally {
			System.out.println("finally() 수행");
		}

		System.out.println("__________________________________");
		try (Scanner sc = new Scanner(new File("sample2.txt"));) {

		} catch (FileNotFoundException e) {
			System.out.println("sample2.txt 파일을 준비해주세요...");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		System.out.println("MAIN END");

	}
}

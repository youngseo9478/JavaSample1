package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			System.out.println("START");
			fis = new FileInputStream("sample2.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// System.out.println("해당 파일이 존재하지 않습니다.");
		} finally {
			try {
				// null일땐 반납할 자원이 없으므로 예외발생
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("END");
	}
}

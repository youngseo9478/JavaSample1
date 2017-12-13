package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//사이즈가 작은 파일을 읽고 쓸 경우
public class Test01_1 {
	public static void main(String[] args) {
		String fileName = "c://file/test01.txt"; // args[0]으로 받는 것도 가능
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy01.txt",true); //append에 true주면 이어쓰기
			int read = 0;
			int count = 0;
			while ((read = fis.read()) != -1) { // 딱 한바이트 읽어오는 메소드
				System.out.print((char) read);
				fos.write(read);
				count++;
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "를 준비해주세요");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// nullPointException은 보통 if 구문으로 잡아준다.
				if (fis != null) 
					fis.close();
				if (fos != null)
					fos.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Main End");
	}
}

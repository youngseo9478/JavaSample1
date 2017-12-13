package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//사이즈가 큰 파일을 읽고 쓸 경우_Stream.ver
public class Test02 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]으로 받는 것도 가능
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append에 true주면 이어쓰기
			int read = 0;
			int count=0;
			while ((read = fis.read()) != -1) { // 딱 한바이트 읽어오는 메소드
				fos.write(read);
				count++;
				//Reader/writer를 안쓰면 엄청 오래 걸리는 걸 알 수 있다.
			}
			System.out.println("복사완료...");
			System.out.println("i/o 횟수 : "+count);
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

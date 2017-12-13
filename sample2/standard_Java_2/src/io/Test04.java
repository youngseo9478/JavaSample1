package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//사이즈가 큰 파일을 읽고 쓸 경우_byte[] buffer의 사이즈를 1MB.ver
//비어있는 공간까지 복사를 해버렸기때문에 원본보다 사이즈가 커져버렸다!(문제발생)
//자원반납을 제대로 해야만 문제발생을 막을 수 있다.
public class Test04 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]으로 받는 것도 가능
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append에 true주면 이어쓰기
			int read = 0;
			int count=0;
			
			byte[] buffer = new byte[1024*1024]; //1MB
			while ((read = fis.read(buffer)) != -1) { //read : 읽은 바이트 수
				fos.write(buffer,0,read); 
				//횟수가 4번인거로 모아 마지막에 빈 공간까지 복사한것! =>버퍼를 잡아줘야한다.
				//그래서 길이를 read만큼으로 정해줘야 버퍼의 남은 공간을 복사하는 문제가 발생하지 않는다.
				count++;
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

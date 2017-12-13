package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//사이즈가 큰 파일을 읽고 쓸 경우_byte[] buffer.ver
public class Test03 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]으로 받는 것도 가능
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append에 true주면 이어쓰기
			int read = 0;
			int count=0;
			//파일이 너무 커지면 이렇게 하는 것도 불가능! => 메모리가 지원안해줄것이기때문!(서버성능차이)
			byte[] buffer = new byte[fis.available()];
			while ((read = fis.read(buffer)) != -1) { //읽어서 buffer에 넣는것. 더이상 없으면 -1
				fos.write(buffer);
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

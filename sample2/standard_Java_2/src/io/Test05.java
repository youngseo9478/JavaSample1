package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//스트림을 통과하는 단위가 char가 되는 BufferedI/OStream.ver
//한글 깨지는 문제가 해결됨. 버퍼의 사이즈는 내부적으로 알아서 결정된다.
//버퍼로 관리될 fis, fos의 주소를 넘겨줘야 사용 가능하다.
public class Test05 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]으로 받는 것도 가능
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append에 true주면 이어쓰기
			
			//버퍼로 관리될 스트림의 주소를 넘겨줌
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int read = 0;
			int count=0;
			//buffered(보조스트림)을 쓴 I/O => read 횟수는 같지만, write횟수가 엄청 줄어듬(성능개선성공)
			while ((read = bis.read()) != -1) { //read : 읽은 바이트 수
				bos.write((char)read); 
				//횟수가 4번인거로 모아 마지막에 빈 공간까지 복사한것! =>버퍼를 잡아줘야한다.
				//그래서 길이를 read만큼으로 정해줘야 버퍼의 남은 공간을 복사하는 문제가 발생하지 않는다.
				count++;
			}
			//마지막 write후에 버퍼에는 데이터가 조금 더 찰 수 있음 
			//근데 버퍼가 꽉차질 않았으니 비워지질 않음=>기록을 안함!(쓰기기능 수행 X)
			bos.flush(); 
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

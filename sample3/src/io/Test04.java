package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) {
		String fileName = "c://file/ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false);
			
			int read = 0;
			int count = 0;
			byte[] buffer = new byte[1024*1024];  //1M
			while((read = fis.read(buffer)) != -1){
				fos.write(buffer,0,read);
				count++;
			}
			System.out.println("i/o 횟수 : "+count);
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" 준비해 주세요");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        System.out.println("복사완료....");
		System.out.println("main end");
	}
}

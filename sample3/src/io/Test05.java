package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) {
		String fileName = "c://file/ben.mp3";
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			fis = new FileInputStream(fileName);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("c://file/copy.mp3",false);
			bos = new BufferedOutputStream(fos);
			
			int read = 0;
			int count = 0;
			//byte[] buffer = new byte[1024*1024];  //1M
			
			while((read = bis.read()) != -1){
				bos.write(read);
				count++;
			}
			bos.flush();
			System.out.println("i/o Ƚ�� : "+count);
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" �غ��� �ּ���");
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
        System.out.println("����Ϸ�....");
		System.out.println("main end");
	}
}

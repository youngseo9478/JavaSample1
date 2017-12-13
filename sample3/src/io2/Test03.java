package io2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
         String fileName = "c://file/data.obj";
         FileOutputStream fos = null;
         BufferedOutputStream bos = null;
         ObjectOutputStream oos = null;
         
         try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			Date now = new Date();
			oos.writeObject(now);
			oos.writeObject("java io(Object write) test");
			oos.flush();
			System.out.println(fileName+"에 저장되었습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(bos!=null)bos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
         
         
         
	}
}

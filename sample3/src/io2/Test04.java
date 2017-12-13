package io2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test04 {
	public static void main(String[] args) {
         String fileName = "c://file/data.obj";
         FileInputStream fos = null;
         BufferedInputStream bos = null;
         ObjectInputStream oos = null;
         
         try {
			fos = new FileInputStream(fileName);
			bos = new BufferedInputStream(fos);
			oos = new ObjectInputStream(bos);
			
			System.out.println(oos.readObject());
			System.out.println(oos.readObject());
			
			System.out.println(fileName+" : READ");
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

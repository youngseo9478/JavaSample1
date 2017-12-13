package io2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
         String fileName = "c://file/data2.obj";
         FileInputStream fis = null;
         BufferedInputStream bis = null;
         ObjectInputStream ois = null;
         
         try {
			fis = new FileInputStream(fileName);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			// object read
			
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
			
			Object obj = ois.readObject();
			List<Employee> list = null;
			
			if(obj instanceof List)	list = (List<Employee>) obj;
			System.out.println("====== List ���� ��� =======");
			Iterator<Employee> it = list.iterator();
			while (it.hasNext()) {
				Employee data = (Employee) it.next();
				System.out.println(data);
			}
			System.out.println("=========================");
			
			//System.out.println(fileName+" : READ");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ois!=null)ois.close();
				if(bis!=null)bis.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
         
         
         
	}
}

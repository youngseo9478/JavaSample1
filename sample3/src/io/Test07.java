package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test07 {
	public static void main(String[] args) {
         String fileName = "c://file/test01.txt";
         String copyName = "c://file/copy01.txt";
         
         FileReader fr = null;
         BufferedReader br = null;
         
         FileWriter fw = null;
         BufferedWriter bw = null;
         
         try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			fw = new FileWriter(copyName,false);
			bw = new BufferedWriter(fw);
			
			String read = null;
			int count = 0;
			while((read = br.readLine()) != null){
				System.out.println(read);
				bw.write(read+"\r\n");
				count++;
			}
			bw.flush();
			System.out.println("I/O Ƚ�� : "+count);
			
		} catch (FileNotFoundException e) {
			System.out.println(fileName+" �غ��� �ּ���");
		}catch (Exception e) {
            System.out.println(e.getMessage());
		}finally{
			try {
				if(fr != null) {
					fr.close();
					fr=null;
				}
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        System.out.println("Main End"); 
	}
}







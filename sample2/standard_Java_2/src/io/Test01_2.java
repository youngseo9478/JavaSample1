package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//byteŸ���� charŸ������ �ޱ�! =>�ѱ� ���� (reader/writer)
//���� ����� ū ������ ���� ������ ������
public class Test01_2 {
	public static void main(String[] args) {
		String fileName = "c://file/test01.txt";
		String copyName = "c://file/copy01.txt";

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(fileName);
			fw = new FileWriter(copyName,false); //default�� false(��������)
			
			int read = 0;
			int count = 0;
			while((read=fr.read())!=-1){
				System.out.print((char)read);
				fw.write(read);
				count++;
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " ������ �غ����ּ���");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null)
					fr.close();
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("main end");

	}
}

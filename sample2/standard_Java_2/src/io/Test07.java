package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//�ڹ� ���� ���۸� �̿��ؼ� ���� ���� ����
//byteŸ���� charŸ������ �ޱ�! =>�ѱ� ���� (reader/writer)
public class Test07 {
	public static void main(String[] args) {
		String fileName = "c://file/test01.txt";
		String copyName = "c://file/copy01.txt";

		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader(fileName);
			fw = new FileWriter(copyName,false); //default�� false(��������)
			
			br = new BufferedReader(fr,1024*1024);
			bw = new BufferedWriter(fw);
			
			String read = null;
			int count = 0;
			while((read=br.readLine())!=null){
				System.out.println(read);
				bw.write(read+"\r\n");
				count++;
			}
			bw.flush(); //����ũ�Ⱑ ����ũ�⺸�ٵ� Ŭ ��� ������������� copy�� �ƹ��͵� ������ ���� **
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

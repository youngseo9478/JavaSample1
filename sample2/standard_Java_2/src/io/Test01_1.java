package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//����� ���� ������ �а� �� ���
public class Test01_1 {
	public static void main(String[] args) {
		String fileName = "c://file/test01.txt"; // args[0]���� �޴� �͵� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy01.txt",true); //append�� true�ָ� �̾��
			int read = 0;
			int count = 0;
			while ((read = fis.read()) != -1) { // �� �ѹ���Ʈ �о���� �޼ҵ�
				System.out.print((char) read);
				fos.write(read);
				count++;
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println(fileName + "�� �غ����ּ���");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// nullPointException�� ���� if �������� ����ش�.
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

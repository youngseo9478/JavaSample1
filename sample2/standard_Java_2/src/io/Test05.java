package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//��Ʈ���� ����ϴ� ������ char�� �Ǵ� BufferedI/OStream.ver
//�ѱ� ������ ������ �ذ��. ������ ������� ���������� �˾Ƽ� �����ȴ�.
//���۷� ������ fis, fos�� �ּҸ� �Ѱ���� ��� �����ϴ�.
public class Test05 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]���� �޴� �͵� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append�� true�ָ� �̾��
			
			//���۷� ������ ��Ʈ���� �ּҸ� �Ѱ���
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int read = 0;
			int count=0;
			//buffered(������Ʈ��)�� �� I/O => read Ƚ���� ������, writeȽ���� ��û �پ��(���ɰ�������)
			while ((read = bis.read()) != -1) { //read : ���� ����Ʈ ��
				bos.write((char)read); 
				//Ƚ���� 4���ΰŷ� ��� �������� �� �������� �����Ѱ�! =>���۸� �������Ѵ�.
				//�׷��� ���̸� read��ŭ���� ������� ������ ���� ������ �����ϴ� ������ �߻����� �ʴ´�.
				count++;
			}
			//������ write�Ŀ� ���ۿ��� �����Ͱ� ���� �� �� �� ���� 
			//�ٵ� ���۰� ������ �ʾ����� ������� ����=>����� ����!(������ ���� X)
			bos.flush(); 
			System.out.println("����Ϸ�...");
			System.out.println("i/o Ƚ�� : "+count);
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

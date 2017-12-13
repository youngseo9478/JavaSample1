package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//����� ū ������ �а� �� ���_Stream.ver
public class Test02 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]���� �޴� �͵� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append�� true�ָ� �̾��
			int read = 0;
			int count=0;
			while ((read = fis.read()) != -1) { // �� �ѹ���Ʈ �о���� �޼ҵ�
				fos.write(read);
				count++;
				//Reader/writer�� �Ⱦ��� ��û ���� �ɸ��� �� �� �� �ִ�.
			}
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

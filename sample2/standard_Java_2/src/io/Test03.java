package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//����� ū ������ �а� �� ���_byte[] buffer.ver
public class Test03 {
	public static void main(String[] args) {
		String fileName = "c://file/Ben.mp3"; // args[0]���� �޴� �͵� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName);
			fos = new FileOutputStream("c://file/copy.mp3",false); //append�� true�ָ� �̾��
			int read = 0;
			int count=0;
			//������ �ʹ� Ŀ���� �̷��� �ϴ� �͵� �Ұ���! => �޸𸮰� ���������ٰ��̱⶧��!(������������)
			byte[] buffer = new byte[fis.available()];
			while ((read = fis.read(buffer)) != -1) { //�о buffer�� �ִ°�. ���̻� ������ -1
				fos.write(buffer);
				count++;
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

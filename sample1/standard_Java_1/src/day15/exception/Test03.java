package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			System.out.println("START");
			fis = new FileInputStream("sample2.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// System.out.println("�ش� ������ �������� �ʽ��ϴ�.");
		} finally {
			try {
				// null�϶� �ݳ��� �ڿ��� �����Ƿ� ���ܹ߻�
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("END");
	}
}

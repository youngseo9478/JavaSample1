package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03_input {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		Scanner sc = null;
		
		try{
			//�ڿ���� �Ŀ��� �ڿ� �ݳ��� �� �������
			//�����ֱ⶧���� �ٸ� �ֵ��� ���� �Ұ��� 
			fis = new FileInputStream("sample2.txt");
			sc = new Scanner("sample2.txt");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.out.println("sample2.txt������ �غ��ϼ���");
		}catch (Exception e) {
			//��� �ٸ� ���ܸ� ���⼭ ����ִ� ��
		}finally{
			//breakPoint �ɾ fis�� ���� ���� ����ִ��� Ȯ���غ�����
			System.out.println(fis);
			try {
				//nullpointException�� catch�����ٴ� if�������� ����ִ°� ����.
				if(fis != null) fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
		System.out.println("MAIN END");
		
		sc.close();
	}
}

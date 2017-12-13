package day16.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P501_Scanner {
	public static void main(String[] args) {
		// String fileName = args[0]; �̷����ϸ� ���ϴ� ������ �׶��׶� �� �� �ִ�.
		String fileName = "sample2.txt";
		
		try(Scanner sc = new Scanner(new File(fileName));) {
	
			while(sc.hasNextLine()){
				int sum = 0;
				String data = sc.nextLine();
				String[] datas = data.split("/");
				for (int i = 1; i < datas.length; i++) {
					sum += Integer.parseInt(datas[i].trim());
				}
				System.out.printf("�̸� : %s%n���� : %d%n��� : %f%n",datas[0], sum, sum/3.0);
				System.out.println("___________________________________");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			
		}

		System.out.println("******Main End******");
	}
}

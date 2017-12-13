package day17.date;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.util.Scanner;

public class P551_MessageFormat {
	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String fileName = "data4.txt";
		String msg = "INSERT INTO " + tableName + "VALUES ({0},{1},{2},{3});";
		try(Scanner s = new Scanner(new File(fileName))) {
			String pattern = "{0},{1},{2},{3}";
			MessageFormat mf = new MessageFormat(pattern);

			while (s.hasNextLine()) {
				String line = s.nextLine();
				Object[] objs;
				try {
					//���Ͽ� �°� �����͸� �����ϰ�
					objs = mf.parse(line);
					//obj�� msg�� ���Ե� ���� �°� ���ε� ���Ѽ� ����ϴ� ��~
					System.out.println(MessageFormat.format(msg, objs));
				} catch (ParseException e) {
//					System.out.println(e.getMessage());
					System.out.println(line+"�� ���Ŀ� �����ʴ� ������ �Դϴ�");
				} catch (Exception e) {
					e.printStackTrace();
				} finally{
//					System.out.println("���� try �� Ż��");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ �������� �ʽ��ϴ� ...");
		} catch (Exception e){
			e.printStackTrace();
		} finally{
//			System.out.println("_____________");
//			System.out.println("�ٱ� try �� Ż��");
		}
	}
}

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
					//패턴에 맞게 데이터를 정렬하고
					objs = mf.parse(line);
					//obj을 msg에 포함된 패턴 맞게 바인딩 시켜서 출력하는 것~
					System.out.println(MessageFormat.format(msg, objs));
				} catch (ParseException e) {
//					System.out.println(e.getMessage());
					System.out.println(line+"는 형식에 맞지않는 데이터 입니다");
				} catch (Exception e) {
					e.printStackTrace();
				} finally{
//					System.out.println("안쪽 try 블럭 탈출");
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다 ...");
		} catch (Exception e){
			e.printStackTrace();
		} finally{
//			System.out.println("_____________");
//			System.out.println("바깥 try 블럭 탈출");
		}
	}
}

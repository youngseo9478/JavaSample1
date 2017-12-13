package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//byte타입을 char타입으로 받기! =>한글 지원 (reader/writer)
//역시 사이즈가 큰 파일의 경우는 느리게 수행함
public class Test01_2 {
	public static void main(String[] args) {
		String fileName = "c://file/test01.txt";
		String copyName = "c://file/copy01.txt";

		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(fileName);
			fw = new FileWriter(copyName,false); //default가 false(원본유지)
			
			int read = 0;
			int count = 0;
			while((read=fr.read())!=-1){
				System.out.print((char)read);
				fw.write(read);
				count++;
			}
			System.out.println(count);
		} catch (FileNotFoundException e) {
			System.out.println(fileName + " 파일을 준비해주세요");
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

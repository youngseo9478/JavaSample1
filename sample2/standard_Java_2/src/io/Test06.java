package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//자바 제공 버퍼를 이용해서 성능 높인 버전
//byte타입을 char타입으로 받기! =>한글 지원 (reader/writer)
public class Test06 {
	public static void main(String[] args) {
		String fileName = "c://file/test01.txt";
		String copyName = "c://file/copy01.txt";

		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader(fileName);
			fw = new FileWriter(copyName,false); //default가 false(원본유지)
			
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
			int read = 0;
			int count = 0;
			while((read=br.read())!=-1){
				System.out.print((char)read);
				bw.write(read);
				count++;
			}
			bw.flush(); //버퍼크기가 원본크기보다도 클 경우 비워주지않으면 copy에 아무것도 써지지 않음 **
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

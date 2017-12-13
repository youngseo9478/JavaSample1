package io2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class P910 {
	public static void main(String[] args) {
		System.out.println("main start");
		
		try(FileOutputStream fos = new FileOutputStream("c://file/error.txt");
			PrintStream ps = new PrintStream(fos);
			) 
		{
		   System.setOut(ps);
		   
		   System.out.println("~~~~~~~~~");
		} catch (FileNotFoundException e) {
			System.err.println("파일없음");
		} catch (Exception e) {
		}

		System.out.println("main end");
		
	}
}

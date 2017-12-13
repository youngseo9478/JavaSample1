package day16.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test02_output {
	public static void main(String[] args) {

		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);

		try {
			fos = new FileOutputStream("sample1.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

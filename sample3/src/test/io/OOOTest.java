package test.io;

import java.util.ArrayList;

import io.prob.FileUtil;

public class OOOTest {
	

	public static void main(String[] args) {
		FileUtil util = new FileUtil();
		try {
		ArrayList<String> data =
		util.compareFile("c://file/test01.txt","c://file/test02.txt");
			
		System.out.println(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Mainend");
	}
}

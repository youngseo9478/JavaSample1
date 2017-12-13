package io;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(new File(""));
		File f = new File("c://file/test01.txt");
		System.out.println(f.exists());
		
		File dir = new File("c:\\");
		String[] list = dir.list();
		//System.out.println(Arrays.toString(list));
		
		File file = null;
		for(int i=0;i<list.length;i++){
			file = new File(dir,list[i]);
			System.out.print(file.lastModified());
			System.out.print("  "+file.getName());
			if(file.isDirectory()){
				System.out.println("  <dir>");
			}
		}
		
		System.out.println("Main End");

	}
}

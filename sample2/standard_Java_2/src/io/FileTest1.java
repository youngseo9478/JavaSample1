package io;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(new File(""));

		File f = new File("c://test01.txt"); //c루트부터 시작 =>절대경로! (도스에서실행해도 같은 결과)
		File f2 = new File("test01.txt"); //상대경로! (도스에서 실행하면 다른 결과)
		File f3 = new File("c://file/test01.txt"); //file폴더를 만들어서 거기에다 만들어 놓기
//		System.out.println(f.isDirectory() + "," + f.getName() + "," + f.getPath());
//		System.out.println(f); // 그냥 파일이름 찍힘
		System.out.println(f.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		
		File dir = new File("c:\\");
		String[] list = dir.list();
//		System.out.println(Arrays.toString(list));
		
		//상대주소는 위험 절대주소를 사용하기!
		File file = null;
		for (int i = 0; i < list.length; i++) {
			file = new File(dir,list[i]);
			System.out.print(file.lastModified());
			System.out.print(" 	"+file.getName());
			if(file.isDirectory()){
				System.out.println("	<dir>");
			}else{
				System.out.println();
			}
		}
		System.out.println("main end");
	}
}

package io;

import java.io.File;

public class FileTest1 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(new File(""));

		File f = new File("c://test01.txt"); //c��Ʈ���� ���� =>������! (�������������ص� ���� ���)
		File f2 = new File("test01.txt"); //�����! (�������� �����ϸ� �ٸ� ���)
		File f3 = new File("c://file/test01.txt"); //file������ ���� �ű⿡�� ����� ����
//		System.out.println(f.isDirectory() + "," + f.getName() + "," + f.getPath());
//		System.out.println(f); // �׳� �����̸� ����
		System.out.println(f.exists());
		System.out.println(f2.exists());
		System.out.println(f3.exists());
		
		File dir = new File("c:\\");
		String[] list = dir.list();
//		System.out.println(Arrays.toString(list));
		
		//����ּҴ� ���� �����ּҸ� ����ϱ�!
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

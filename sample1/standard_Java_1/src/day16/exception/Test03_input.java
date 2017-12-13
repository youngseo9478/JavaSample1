package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03_input {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		Scanner sc = null;
		
		try{
			//자원사용 후에는 자원 반납을 꼭 해줘야함
			//열고있기때문에 다른 애들이 접근 불가능 
			fis = new FileInputStream("sample2.txt");
			sc = new Scanner("sample2.txt");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			System.out.println("sample2.txt문서를 준비하세요");
		}catch (Exception e) {
			//모든 다른 예외를 여기서 잡아주는 것
		}finally{
			//breakPoint 걸어서 fis에 무슨 값이 들어있는지 확인해봐야함
			System.out.println(fis);
			try {
				//nullpointException은 catch블럭보다는 if구문으로 잡아주는게 낫다.
				if(fis != null) fis.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} 
		}
		System.out.println("MAIN END");
		
		sc.close();
	}
}

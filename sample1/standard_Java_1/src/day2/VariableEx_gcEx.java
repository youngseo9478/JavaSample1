package day2;
//import는 환경변수 설정시 패스를 잡아주는것과 같은 의미
import java.util.Date;
//얘는 util.Date인데 다른 하나는 sql.Date를 쓸 수 없음 
//하나는 풀패스로 작성해야함

public class VariableEx_gcEx {
	public static void main(String[] args){
//		import하지 않으면 풀패스를 입력해줘야 에러가 안남
//		import 단축키 ctrl+shift+'o'
		Date now = new Date();
		System.out.println(now);
		
//		System.out.println(now.getYear());
//		관리가 불편해서 요즘은 캘린더 클래스를 이용하기를 권장
		
//		로컬변수는 꼭 초기화 필요
		java.sql.Date today = null;
		System.out.println(today);
//		null은 가리키는 곳이 없는 것
		
		now=null; //주소연결고리 끊는것. 
//		가비지컬렉션이 알아서 메모리 관리를 해준다고해도 
//		메모리가 가득차면 메모리누수 현상이 나타나기때문에 관리가 필요
		
	}
}

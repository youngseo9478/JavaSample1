package day4;

public class OperationEx_final2 {
	public static void main(String[] args) {
//		같은 패키지 내에 있는 클래스는 공유가 가능하다
//		대신 루트를 알려주기위해 .을 이용해 클래스명을
//		함께 입력해야한다. 내가 있는곳이 day4이기때문에 패키지명
//		생략가능하다.
		System.out.println(day4.OperationEx_final.PI);
		System.out.println(OperationEx_final.PI);
		
		System.out.println(Byte.MAX_VALUE);
		
//		pi는 사실 원래 이미 정의되어있음
//		public 이기때문에 누구든 가져다 쓸 수 있음
		System.out.println(Math.PI);
	}
}

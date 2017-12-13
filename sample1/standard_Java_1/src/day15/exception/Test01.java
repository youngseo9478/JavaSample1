package day15.exception;
//unchecked exception 모음
public class Test01 {
	public static void main(String[] args) {
		System.out.println("START");
		try {
			System.out.println("try{");
			System.out.println(args[0].length()); // 예외발생
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("접근할 수 없는 배열 인덱스 사용..");
		} catch(NumberFormatException e){
			System.out.println("정수로 포맷이 불가능한 데이터입니다.");
			e.printStackTrace(); //내부에 기본적인 에러메세지(빨간색)
			System.out.println(e); //에러메세지 출력(검정색)
			System.out.println(e.getMessage()); 
		} catch(ArithmeticException e){
			System.out.println("0으로는 나눌 수 없다.");
		} catch(Exception e){
			System.out.println("~~~~");
		}finally {
			//반납할 자원이 있으면 여기에서 수행해야함
			System.out.println("자원반납은 여기서~~");
		}
		System.out.println("END");
	}
}

package day14.command;

public class Test03 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		
		//이 경로의 클래스를 객체로 만들겠다는 의미
		//컴파일 타임에 메모리에 올라갈 객체가 결정된다.
		cmd = new day14.command.Delete();
		
		//어떤걸로 객체를 만들지를 런타임에 결정할 경우에는 다음과 같이 해준다.
		//런타임에 들어올 수 있는 것은 string밖에 없다.
		//클래스의 이름을 넘겨받는게 forName인것
		//컴파일 타임에 체크 불가능 =>못찾으면 예외발생 그래서 예외처리를 꼭 해주어야함
		//지금과 같이 던져버리는 것은 **가장 안좋은 코딩**
		Class cls = Class.forName(args[0]);
		cmd = (Command)cls.newInstance(); //객체 생성
		cmd.execute();
		
	}
}

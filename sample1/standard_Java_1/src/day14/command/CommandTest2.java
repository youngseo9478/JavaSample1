package day14.command;
//기능확장이 용이한 코드
public class CommandTest2 {
	public static void main(String[] args) throws Exception {
		Command cmd = null;
		//args[0]의 데이터 타입은 string..=>path를 풀로 입력해야한다.
		Class cls = Class.forName(args[0]); //파라미터로 클래스네임을 받고
		cmd = (Command)cls.newInstance(); //메모리에 올린다.
		//cls는 오브젝트타입이므로 Command타입으로 캐스팅만 해주는 것
		//Command의 자식은 모든지 띄울수있게됨
		cmd.execute();
	}
}

package day16.lang;

public class Testp5 {
	public static void main(String[] args) {
		
		//new를 쓰면 heap에 올라가고 new를 안쓰면 ...code영역에 올라간다.
		String msg = "Hello Java Test~~~~~~";
		System.out.println(msg);
		
		//원래값이 절대 안바뀜 String은 읽기전용이기때문!@!!!
		msg.replace('~', '!');
		System.out.println(msg);
		//return은 해주는데 원본을 변경하지는 않기때문에 이렇게하면 바뀐값을 찍을 수는 있다.
		System.out.println(msg.replace('~', '!'));
		
		
		System.out.println();
		System.out.println("______________________________");
		msg.concat(" sample");
		System.out.println(msg);
		System.out.println(msg.concat(" sample"));
		
		System.out.println();
		System.out.println("____________스트링버퍼____________");
		//원본이 계속해서 바뀜 
		//읽고 쓰기가 가능하다. (스트링버퍼, 스트링빌더)
		StringBuffer sb = new StringBuffer("StringBuffer test");
		System.out.println(sb);
		sb.reverse(); //얘는 원본이 바뀜
		System.out.println(sb);
		sb.reverse(); //다시 원본이 됨
		System.out.println(sb);
		sb.append(" Sample");
		System.out.println(sb);
		
		System.out.println();
		System.out.println("______________________________");
		String s = sb.toString(); //스트링버퍼를 스트링으로 바꾸는 것은 매우 간단~~
		System.out.println(s);
	}
}

package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		// Set도 interface라서 자식으로 객체생성
		//Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); 
		//자식이니까 tree여도 똑같이 동작 (로우 커플링)
		//Tree는 소팅기능이 있어서 저절로 정렬이 된다. (Hash는 정렬X)
		set.add("java 01");
		set.add("java 01"); //중복값은 나중에 들어온걸로 저장
		set.add("java 02");
		set.add("java 03");
		set.add("java 04");
		set.add("java 05");

		// 주머니 개념이라 들어간순서대로 나오지 않는다 ->순서가 마구잡이
		System.out.println(set);
		
		set.remove("java 05");
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String data = it.next();
			System.out.println(data.substring(data.length()-2));
		}
		
		
		//타입안주면 Object 그래도 출력이 된다. 왜냐면 String은 toString이 오버라이딩되어있어서
		Iterator itt = set.iterator();
		while(itt.hasNext()){
			Object data = itt.next();
			System.out.println(data);
		}
		
		set.add("java 99");
		set.add("java 54");
		set.add("java 21");
		set.add("java 75");
		set.add("java 61");
		System.out.println(set);
		
		
	}
}

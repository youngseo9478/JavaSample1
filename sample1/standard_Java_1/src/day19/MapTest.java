package day19;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		// ID, Password (키값 중복 불허)
		Map<String, String> map = new TreeMap<>(); //Hash랑 같은데 정렬을 해줌
		
		map.put("java09", "62103");
		map.put("java01", "1234");
		map.put("java04", "25781");
		map.put("java07", "8888");
		// map.put("java01", "3214"); // 중복이라 나중걸로 오버라이트
		map.put("java02", "3214"); // 비밀번호는 중복허용
		map.put("java03", "1234");
		map.put("java05", "38401");
		map.put("java06", "2010");
		map.put("java08", "9405");
		map.put("java10", "78012");

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println();
			System.out.println("[로그인 처리]");
			System.out.print("ID :_");
			String id = sc.nextLine().trim();
			System.out.print("PW :_");
			String pw = sc.nextLine().trim();
			if (map.containsKey(id)) {
				if (map.containsValue(pw)) {
					System.out.println(id + " 로그인 되었습니다.");
					flag = !flag;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("존재하지 않는 회원 정보입니다.");
			}
		}
		System.out.println();
		System.out.println("------서비스 목록------");

		System.out.println();
		System.out.println("______________________");
		System.out.println("Iterator로 모든 value값 뽑아 내기");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String keyName = it.next();
			System.out.printf("ID : %s, PW : %s%n", keyName, map.get(keyName));
		}

		// System.out.println(map); System.out.println("#1.key이용해서 value 추출");
		// System.out.println(map.get("java09"));
		//
		// System.out.println(); System.out.println("key값들 꺼내주는 메소드 사용");
		// System.out.println(map.keySet());
		//
		// System.out.println(); System.out.println("______________________");
		// System.out.println("순회하여 모든 value값 뽑아 내기"); for(String data :
		// map.keySet()){ System.out.println(map.get(data)); }
		//

	}
}

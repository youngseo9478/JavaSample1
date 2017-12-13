package day19;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		// ID, Password (Ű�� �ߺ� ����)
		Map<String, String> map = new TreeMap<>(); //Hash�� ������ ������ ����
		
		map.put("java09", "62103");
		map.put("java01", "1234");
		map.put("java04", "25781");
		map.put("java07", "8888");
		// map.put("java01", "3214"); // �ߺ��̶� ���߰ɷ� ��������Ʈ
		map.put("java02", "3214"); // ��й�ȣ�� �ߺ����
		map.put("java03", "1234");
		map.put("java05", "38401");
		map.put("java06", "2010");
		map.put("java08", "9405");
		map.put("java10", "78012");

		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		while (flag) {
			System.out.println();
			System.out.println("[�α��� ó��]");
			System.out.print("ID :_");
			String id = sc.nextLine().trim();
			System.out.print("PW :_");
			String pw = sc.nextLine().trim();
			if (map.containsKey(id)) {
				if (map.containsValue(pw)) {
					System.out.println(id + " �α��� �Ǿ����ϴ�.");
					flag = !flag;
				} else {
					System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
				}
			} else {
				System.out.println("�������� �ʴ� ȸ�� �����Դϴ�.");
			}
		}
		System.out.println();
		System.out.println("------���� ���------");

		System.out.println();
		System.out.println("______________________");
		System.out.println("Iterator�� ��� value�� �̾� ����");
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String keyName = it.next();
			System.out.printf("ID : %s, PW : %s%n", keyName, map.get(keyName));
		}

		// System.out.println(map); System.out.println("#1.key�̿��ؼ� value ����");
		// System.out.println(map.get("java09"));
		//
		// System.out.println(); System.out.println("key���� �����ִ� �޼ҵ� ���");
		// System.out.println(map.keySet());
		//
		// System.out.println(); System.out.println("______________________");
		// System.out.println("��ȸ�Ͽ� ��� value�� �̾� ����"); for(String data :
		// map.keySet()){ System.out.println(map.get(data)); }
		//

	}
}

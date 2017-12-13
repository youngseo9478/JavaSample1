package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		// Set�� interface�� �ڽ����� ��ü����
		//Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); 
		//�ڽ��̴ϱ� tree���� �Ȱ��� ���� (�ο� Ŀ�ø�)
		//Tree�� ���ñ���� �־ ������ ������ �ȴ�. (Hash�� ����X)
		set.add("java 01");
		set.add("java 01"); //�ߺ����� ���߿� ���°ɷ� ����
		set.add("java 02");
		set.add("java 03");
		set.add("java 04");
		set.add("java 05");

		// �ָӴ� �����̶� ��������� ������ �ʴ´� ->������ ��������
		System.out.println(set);
		
		set.remove("java 05");
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String data = it.next();
			System.out.println(data.substring(data.length()-2));
		}
		
		
		//Ÿ�Ծ��ָ� Object �׷��� ����� �ȴ�. �ֳĸ� String�� toString�� �������̵��Ǿ��־
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

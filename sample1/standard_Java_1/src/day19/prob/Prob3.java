package day19.prob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob3 {
	public static void main(String[] args) {

		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== ���ڿ� ó�� ��� ===");

		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}// end of main()

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> set = new HashSet<>();
		int p = -1;//indetOf�� �ش� ���ڰ� �������� ���� �� -1����.
		for (int i = 0; i < str1.length(); i++) {
			p = str1.indexOf(str2, i);
			//...#6000000 �� �־��� ���ڿ��̹Ƿ� ���������� �ڿ� #�� ����.
			if (p == -1) {
				//�׷����� i���� ���ڿ��� ���������� �߶� add�ϰ� return set.
				set.add(str1.substring(i, str1.length()));
				//���Ͼ��ϸ� ��� i++�ϸ鼭 �丷�丷�� ������ �����ϰ� �� => �̻��� ��� ����
				return set;
			} else {
				set.add(str1.substring(i, p));
				i = p;
			}
		}
		return set;
	}// end of stringSplit()
}

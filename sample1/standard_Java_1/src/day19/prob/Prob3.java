package day19.prob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob3 {
	public static void main(String[] args) {

		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");

		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}// end of main()

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> set = new HashSet<>();
		int p = -1;//indetOf는 해당 문자가 존재하지 않을 때 -1리턴.
		for (int i = 0; i < str1.length(); i++) {
			p = str1.indexOf(str2, i);
			//...#6000000 이 주어진 문자열이므로 마지막에는 뒤에 #이 없음.
			if (p == -1) {
				//그럴때는 i부터 문자열의 마지막까지 잘라서 add하고 return set.
				set.add(str1.substring(i, str1.length()));
				//리턴안하면 계속 i++하면서 토막토막을 일일이 저장하게 됨 => 이상한 결과 ㅎㅎ
				return set;
			} else {
				set.add(str1.substring(i, p));
				i = p;
			}
		}
		return set;
	}// end of stringSplit()
}

package day19.prob;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob4 {
	public static void main(String[] args) {

		//�� �ڵ�δ� �� ������#�� ���� ������ 
		//�Ǹ������� #�� ������ ���ϰ��� -1�̵Ǵµ�
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
		boolean flag = true;
		while(flag){
			p = str1.indexOf(str2, p+1);
			if(p==-1){
				set.add(str1.substring(p+1, str1.length()));
				flag = !flag;
				return set;
			}else{

			set.add(str1.substring(p+1, p=str1.indexOf("#",p+1)));
			}
		}
		return set;
	}// end of stringSplit()
}

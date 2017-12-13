package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505_RegularExpression {
	public static void main(String[] args) {
		String[] data = { "bat","baby","bonus","cA","ca","co","c.","c0","cat","combat","count","data","disc" };
		Pattern p = Pattern.compile("c[a-z]*"); //c�� �����ϴ� �ҹ��� ���ܾ ã��ʹ�.
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); //���ϰ� ��ġ�ϴ� �͵��� �����Ѵ�.
			if(m.matches()){ //���ϰ� ��ġ�ϴ°� �����ϸ�
				System.out.println(data[i]+",");
			}
		}
	}
}

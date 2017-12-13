package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505_RegularExpression {
	public static void main(String[] args) {
		String[] data = { "bat","baby","bonus","cA","ca","co","c.","c0","cat","combat","count","data","disc" };
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자 영단어를 찾고싶다.
		for (int i = 0; i < data.length; i++) {
			Matcher m = p.matcher(data[i]); //패턴과 일치하는 것들을 저장한다.
			if(m.matches()){ //패턴과 일치하는게 존재하면
				System.out.println(data[i]+",");
			}
		}
	}
}

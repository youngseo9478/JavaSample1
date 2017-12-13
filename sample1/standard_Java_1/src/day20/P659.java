package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {
	public static void main(String[] args) {
		Properties p =new Properties();

		p.setProperty("java01", "1234");
		p.setProperty("java02", "5423");
		p.setProperty("java03", "545765");
		p.setProperty("java05", "6752");
		p.setProperty("java04", "12345");
		
		System.out.println(p.getProperty("java05"));
		
		Set key = p.keySet();
		Iterator it = key.iterator();
		while(it.hasNext()){
			String str = (String)it.next();
			System.out.println(str+":"+p.getProperty(str));
		}
	}
}

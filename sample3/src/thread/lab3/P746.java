package thread.lab3;

import java.util.Iterator;
import java.util.Map;

public class P746 {
	public static void main(String[] args) {
		Map map = Thread.getAllStackTraces();
		System.out.println(map);
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			Object key = (Object) it.next();
			if(key instanceof Thread){
				Thread data = (Thread) key;
				System.out.println(key);
				System.out.print(" damon :"+ data.isDaemon());
				System.out.println(" group name :"+data.getThreadGroup().getName());
			}
		}
		
        
	}
}

package thread;

import java.util.Iterator;
import java.util.Map;
/**
 * 우리가 모르게 뒷단에서 일하는 쓰레드 == Daemon Thread
 * 참고로 main은 데몬쓰레드가 아니다!
 * @author student
 *
 */
public class DaemonThread_P746 {
	public static void main(String[] args) {
		Map map = Thread.getAllStackTraces();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			Object key = it.next();
			System.out.println(key);
			if(key instanceof Thread){
				Thread data = (Thread)key;
				System.out.print(" deamon"+data.isDaemon());
				System.out.println(" group name : "+data.getThreadGroup().getName());
			}
		}
	}
}

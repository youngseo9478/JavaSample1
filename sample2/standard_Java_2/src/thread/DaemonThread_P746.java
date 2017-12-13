package thread;

import java.util.Iterator;
import java.util.Map;
/**
 * �츮�� �𸣰� �޴ܿ��� ���ϴ� ������ == Daemon Thread
 * ����� main�� ���󾲷��尡 �ƴϴ�!
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

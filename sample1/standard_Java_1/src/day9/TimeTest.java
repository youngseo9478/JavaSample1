package day9;

import util.Time;

public class TimeTest {
	public static void main(String[] args) {
		
		Time t1 = new Time();
		
		Time t2 = new Time(15, 8, 02);
//		t2.setHour(52);
		System.out.println(t2.getHour()+"��");
		System.out.println(t2.toString());
		
		System.out.println("==================================================");
		
		Time t4 = new Time(12, 59, 60);
//		t4�� �ּ��ӿ��� �ұ��ϰ� toString�� ����� ������ �˾Ƽ� ������ ����ش�
//		������ getHour, getMinute, getSecond, isAm �� ���ε��� .�� �ҷ����ϴµ�..
//		������ ��ӿ��� ������ ��
		System.out.println(t4);
	}
}

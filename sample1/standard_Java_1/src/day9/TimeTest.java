package day9;

import util.Time;

public class TimeTest {
	public static void main(String[] args) {
		
		Time t1 = new Time();
		
		Time t2 = new Time(15, 8, 02);
//		t2.setHour(52);
		System.out.println(t2.getHour()+"시");
		System.out.println(t2.toString());
		
		System.out.println("==================================================");
		
		Time t4 = new Time(12, 59, 60);
//		t4는 주소임에도 불구하고 toString을 만들어 놨더니 알아서 정보를 찍어준다
//		원래는 getHour, getMinute, getSecond, isAm 다 따로따로 .찍어서 불러야하는데..
//		이유는 상속에서 설명할 것
		System.out.println(t4);
	}
}

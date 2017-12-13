package day7;

import java.util.Scanner;

public class P238 {
	public static void main(String[] args) {
		TV2 tv1 = new TV2();
		Scanner sc = new Scanner(System.in);
		int powerFlag;
		tv1.color="black";
		tv1.channel=11;
		tv1.power();
		tv1.channelDown();
		if(tv1.power==true) System.out.println("TV ON");
		else System.out.println("TV OFF");
		System.out.printf("TV[power:%s, color:%s, channel:%d]\n",tv1.power, tv1.color, tv1.channel);
		System.out.println("전원을 끄시겠습니까? 1.예 2.아니요");
		powerFlag=sc.nextInt();
		sc.close();
		if(powerFlag==1) {
			tv1.power();
			System.out.println("TV OFF");
		}
	}
}

//public이 아니라서 내일 day8 패키지에서는 사용 불가
//하나의 자바 코드에서는 여러개의 클래스 생성 가능 
//그러나 public은 하나만 가능하다(보통 메인메소드를 포함하는 클래스를 public)
class TV{
	String color;
	boolean power;
	int channel;
	
	void power(){
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}

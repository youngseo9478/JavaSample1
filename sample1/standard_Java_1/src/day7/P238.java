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
		System.out.println("������ ���ðڽ��ϱ�? 1.�� 2.�ƴϿ�");
		powerFlag=sc.nextInt();
		sc.close();
		if(powerFlag==1) {
			tv1.power();
			System.out.println("TV OFF");
		}
	}
}

//public�� �ƴ϶� ���� day8 ��Ű�������� ��� �Ұ�
//�ϳ��� �ڹ� �ڵ忡���� �������� Ŭ���� ���� ���� 
//�׷��� public�� �ϳ��� �����ϴ�(���� ���θ޼ҵ带 �����ϴ� Ŭ������ public)
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

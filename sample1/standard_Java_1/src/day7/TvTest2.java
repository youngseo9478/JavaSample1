package day7;

public class TvTest2 {
	public static void main(String[] args) {
		TV2 tv1 = new TV2();
		tv1.display();
		tv1.power();
//		tv1.color="red";
//		tv1.display();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.color("white");
		tv1.display();

		TV2 tv2 = new TV2();
		tv2.display();
		tv2.channelDown();
		tv2.channelDown();
		tv2.channelUp();
		tv2.color("black");
		tv2.display();
	}
}

class TV2 {
	String color;
	int channel = 11;
	boolean power;

	void color(String color){
		this.color=color;
	}
	void power() {
		this.power = !power;
	}

	void channelUp() {
		++this.channel;
	}

	void channelDown() {
		--this.channel;
	}

	void display() {
		System.out.printf("TV power : %b, Color : %s, Channel : %d\n", power, color, channel);
	}
}
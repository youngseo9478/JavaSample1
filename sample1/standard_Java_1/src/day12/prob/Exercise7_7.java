package day12.prob;

public class Exercise7_7 {
	public static void main(String[] args) {
		Child1 c = new Child1();
		System.out.println("x = "+c.getX());
	}
}

class Parent1{
	int x = 100;
	Parent1(){
		this(200);
	}
	Parent1(int x){
		this.x=x;
	}
	int getX(){
		return x;
	}
}

class Child1 extends Parent1{
	int x = 3000;
	Child1(){
		this(1000);
	}
	Child1(int x){
		this.x=x;
	}
}
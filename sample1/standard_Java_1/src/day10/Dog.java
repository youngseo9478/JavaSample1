package day10;

public class Dog extends Animal {

	String kind = "������ ����";
	String name;
	
	public void bike(){
		System.out.println("bike");
	}
	
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",this.kind,this.name,super.kind);
	}
}

package day11.prob1;

public class Person {

	private String name="�ƹ���";
	private int age=0;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print(){
		System.out.printf("�̸� : %s  ���� : %d%n",name,age);
	}
}

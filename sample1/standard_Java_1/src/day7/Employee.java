package day7;

//public 이라서 외부에서 사용 가능  -> day7.Employee 로 import
//패키지명이 다르다면 같은 이름의 클래스 만들 수 있다.
public class Employee {
	String num;
	String name;
	String dept;
	
	public void display(){
		System.out.printf("Employee[%5s %5s %5s]\n",num,name,dept);
	}
}

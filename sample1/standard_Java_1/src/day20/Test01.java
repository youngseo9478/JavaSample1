package day20;

public class Test01 {
	public static void main(String[] args) {
		Student<String, Double> s1=new Student("", 3.0);
		Student<String, Integer> s2=new Student("", 3);
	}
}

//V는 타입제한을 하고 싶다면 이렇게
class Student<T,V extends Number>{
	T name;
	V avg;
	public Student() {
		super();
	}
	public Student(T name, V avg) {
		super();
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
}
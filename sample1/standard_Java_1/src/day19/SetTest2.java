package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {
	public static void main(String[] args) {
	
		Employee emp1 = new Employee("김","001");
		Employee emp2 = emp1;
		
		Set<Employee> set = new TreeSet<>();
		set.add(emp1);
		set.add(emp2); //중복체크되어서 마지막꺼 하나만 들어감
		System.out.println(set);

		//데이터는 같은데 서로 다른 객체라서 중복으로 처리되지 않았음
		//equals메소드를 오버라이딩 하지않으면 주소값으로 비교하는 것
		set.add(new Employee("고","002"));
		set.add(new Employee("고","014"));
		//set.add(new Employee("박","035"));
		//set.add(new Employee("김","017"));
		//set.add(new Employee("이","006"));
		//set.add(new Employee("원","003"));
		//set.add(new Employee("홍","002"));
		System.out.println(set);
		
		//변형된 for
		for (Employee data : set) {
			System.out.println(data);
			System.out.println("___________________________");
		}
		System.out.println();
		System.out.println("///////////////////////////////");
		System.out.println();
		//Iterator 버전
		Iterator<Employee> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			System.out.println("___________________________");
		}
	}
}

class Employee implements Comparable<Employee> {
	String name;
	String num;
	public Employee() {
		super();
	}
	public Employee(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Employee o) {
		if(num.compareTo(o.num) == 0){
			return name.compareTo(o.name);
		}
		return num.compareTo(o.num);
	}
	
}
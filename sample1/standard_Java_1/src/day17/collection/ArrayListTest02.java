package day17.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest02 {
	public static void main(String[] args) {
		Employee[] emp = new Employee[100];
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("007","홍길동","기술부"));
		list.add(new Employee("003","김길서","경영부"));
		list.add(new Employee("001","이은미","생산부"));
		list.add(new Employee("004","최유진","기술부"));
		list.add(new Employee("006","김덕배","마케팅부"));
		list.add(new Employee("008","김원석","품질관리부"));
		list.add(new Employee("009","정성제","생산부"));
		list.add(new Employee("014","최유진","경영부"));
		list.add(new Employee("034","서세영","경영부"));
		
		System.out.println("________________________________________");
		System.out.println("▶사번으로 정렬 후◀");
		System.out.println();
		Collections.sort(list);
		//List에선 일반적인 for문 잘 안씀
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("________________________________________");
		System.out.println();
		
		System.out.println("________________________________________");
		System.out.println("▶006사원 제거 후◀");
		System.out.println();
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()){
			Employee data = it.next();
			if(data.getNum().equals("006")){
				System.out.println(data+" : 사원 정보 제거 합니다.");
				it.remove();
			}
		}
		System.out.println("________________________________________");
		System.out.println();
		
		System.out.println("_______________[사 원 목 록]________________");
		System.out.println();
		for(Employee data : list){
			System.out.println(data);
		}
		System.out.println("________________________________________");
		System.out.println();
		
		System.out.println("________________________________________");
		System.out.println("▶기술부 사원 검색 요청◀");
		System.out.println();
		for(Employee data : list){
			if(data.getDept().equals("기술부")){
				System.out.println(data);
			}
		}
		System.out.println("________________________________________");
		System.out.println();

		System.out.println("________________________________________");
		System.out.println("▶데이터 요청(배열)◀");
		System.out.println();
		Employee[] data = new Employee[list.size()];
		System.out.println(Arrays.toString(data));
		list.toArray(data); //list의 데이터를 data에 배열로 담아준다.
		System.out.println(Arrays.toString(data));
		System.out.println("________________________________________");
		System.out.println();
		
	}
}

class Employee extends Object implements Comparable<Employee> {
	private String num; // primary key
	private String name;
	private String dept;

	public Employee() {}
	public Employee(String num, String name, String dept) {
		super();
		this.num = num;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public int compareTo(Employee o) {
		return this.num.compareTo(o.getNum()); // 오름차순
		// return o.getNum().compareTo(this.num); //내림차순
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
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
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
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
	public String toString() {
		return "Employee [사번=" + num + ", 사원명=" + name + ", 부서=" + dept + "]";
	}

}
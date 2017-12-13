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
		list.add(new Employee("007","ȫ�浿","�����"));
		list.add(new Employee("003","��漭","�濵��"));
		list.add(new Employee("001","������","�����"));
		list.add(new Employee("004","������","�����"));
		list.add(new Employee("006","�����","�����ú�"));
		list.add(new Employee("008","�����","ǰ��������"));
		list.add(new Employee("009","������","�����"));
		list.add(new Employee("014","������","�濵��"));
		list.add(new Employee("034","������","�濵��"));
		
		System.out.println("________________________________________");
		System.out.println("��������� ���� �Ģ�");
		System.out.println();
		Collections.sort(list);
		//List���� �Ϲ����� for�� �� �Ⱦ�
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("________________________________________");
		System.out.println();
		
		System.out.println("________________________________________");
		System.out.println("��006��� ���� �Ģ�");
		System.out.println();
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()){
			Employee data = it.next();
			if(data.getNum().equals("006")){
				System.out.println(data+" : ��� ���� ���� �մϴ�.");
				it.remove();
			}
		}
		System.out.println("________________________________________");
		System.out.println();
		
		System.out.println("_______________[�� �� �� ��]________________");
		System.out.println();
		for(Employee data : list){
			System.out.println(data);
		}
		System.out.println("________________________________________");
		System.out.println();
		
		System.out.println("________________________________________");
		System.out.println("������� ��� �˻� ��û��");
		System.out.println();
		for(Employee data : list){
			if(data.getDept().equals("�����")){
				System.out.println(data);
			}
		}
		System.out.println("________________________________________");
		System.out.println();

		System.out.println("________________________________________");
		System.out.println("�������� ��û(�迭)��");
		System.out.println();
		Employee[] data = new Employee[list.size()];
		System.out.println(Arrays.toString(data));
		list.toArray(data); //list�� �����͸� data�� �迭�� ����ش�.
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
		return this.num.compareTo(o.getNum()); // ��������
		// return o.getNum().compareTo(this.num); //��������
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
		return "Employee [���=" + num + ", �����=" + name + ", �μ�=" + dept + "]";
	}

}
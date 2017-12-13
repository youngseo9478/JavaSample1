package day17.generics;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee<String,Integer> e1 = new Employee<String,Integer>(); //T->String Ÿ�԰���
		e1.number = "2017"; //��Ʈ��Ÿ������!
		e1.age=32;
		System.out.println(e1.number.charAt(e1.number.length()-1));
		System.out.println(e1);
		
		//intŸ���� ��� �ȵ� T ��ſ��� Object�� ���� ! �⺻���� ���ε� �Ұ�
		Employee<Integer,String> e2 = new Employee<Integer, String>();
//		e2.number="2015"; error~
		System.out.println(e2); 
		e2.number=2015; //�̹��� ������!
		
		//Ÿ�� ������ ��� �� ����
		Employee e3 = new Employee<Object,Object>();
		System.out.println(e3);
		e3.number="44";
		e3.number=44;
		
		Employee<String, Integer> e4 = new Employee("ȫ�浿", "2015", 24);
	}
}
//RunTime�� T(Ÿ��)�� ���� ������ ���� �ǹ�
class Employee<T,P> /*implements Comparable<Employee<T,P>>*/ {
	String name;
	T number;
	P age;
	
	public Employee() {
		super();
	}

	public Employee(String name, T number, P age) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
	}
	
//	@Override
//	public int compareTo(Employee<T, P> o) {
//		int num;
//		if(o.number instanceof String){
//			
//		}
//		return ;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public P getAge() {
		return age;
	}

	public void setAge(P age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [�����=" + name + ", ���=" + number + ", ����=" + age + "]";
	}
}
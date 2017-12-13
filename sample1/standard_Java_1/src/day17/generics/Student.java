package day17.generics;

public class Student implements Comparable<Student> {

	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		// return age-o.age; 나이 오름차순
		// return o.age-age; 나이 내림차순
		return name.compareTo(o.name) == 0 ? age - o.age : name.compareTo(o.name); // 이름
																					// 오름차순,
																					// 이름같으면
																					// 나이
																					// 오름차순
		// **string은 산술연산 안된다. String은 이미 comparable을 구현하고 있다.
		// **따라서 이미 정의된 compareTo 메소드를 이용해서 크기를 비교하면 된다.

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

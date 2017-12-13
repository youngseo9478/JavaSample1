package day12;

public class Student extends Object {
	private String name;
	private int age;
	private int id;

	public Student() {
		super(); // Object
	}

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// String은 char의 배열이다.
	// 배열은 한번 선언하면 크기가 변할 수 없다.
	// 즉 String은 불변한다. 그러므로 아래와같은 연산작업을 하게되면
	// 일일이 객체를 생성하기 때문에 성능저하에 원인이 된다.
	// 그러므로 스트링버퍼나 스트링빌더를 이용해야한다.
	@Override
	public String toString() {
		// return "Student [name=" + name + ", age=" + age + ", id=" + id + "]";
		StringBuilder sb = new StringBuilder();
		sb.append("Student[");
		sb.append(name);
		sb.append(",");
		sb.append(age);
		sb.append(",");
		sb.append(id);
		sb.append("]");
		return sb.toString();
	}

	@Override
	public boolean equals(Object obj) {
		//첫번째, 타입 체크
		//두번째, 주소안에 든 실데이터 비교
		if (obj instanceof Student) {
			return getName() == ((Student) obj).getName() && getAge() == ((Student) obj).getAge()
					&& getId() == ((Student) obj).getId();
		} else
			return false;
	}
/*	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)){
			return false;
		}
		if(obj==null) return false;
		if(id==((Student)obj).getId()&&)
		return super.equals(obj);
	}*/
}

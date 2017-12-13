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

	// String�� char�� �迭�̴�.
	// �迭�� �ѹ� �����ϸ� ũ�Ⱑ ���� �� ����.
	// �� String�� �Һ��Ѵ�. �׷��Ƿ� �Ʒ��Ͱ��� �����۾��� �ϰԵǸ�
	// ������ ��ü�� �����ϱ� ������ �������Ͽ� ������ �ȴ�.
	// �׷��Ƿ� ��Ʈ�����۳� ��Ʈ�������� �̿��ؾ��Ѵ�.
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
		//ù��°, Ÿ�� üũ
		//�ι�°, �ּҾȿ� �� �ǵ����� ��
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

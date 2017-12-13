package day11.prob1;

public class Teacher extends Person{

	private String subject="�ѹ�";

	public Teacher() {
		super();
	}

	public Teacher(String subject) {
		super();
		this.subject = subject;
	}
	
	public Teacher(String name, int age, String subject){
		super(name,age);
		this.subject=subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void print(){
		System.out.printf("�̸� : %s	 ���� : %d	 ������ : %s%n",super.getName(),super.getAge(),subject);
	}
}

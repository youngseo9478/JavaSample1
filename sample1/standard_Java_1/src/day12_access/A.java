package day12_access;

public class A {
	//��𼭵� �� �� �ִ�.
	public String name1 = "A";
	//�ٸ���Ű���� ��Ӱ����� �� �� �ִ�.
	protected String name2 = "AA";
	//���� ��Ű�������� �� �� �ִ�.
	String name3 = "AAA"; //default
	//���� ��Ű�� �ٸ� Ŭ���������� name4�� �� �� ����.
	private String name4 = "AAAA";
}

class B{
	A a;
	void print(){
	}
}
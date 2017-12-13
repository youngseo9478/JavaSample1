package day9;

public class EncapsulationEx {
	private String name;//이름
	private int salary;	//급여
	private String ssn; //주민번허
	

	public EncapsulationEx(){
		
	}
	
	public EncapsulationEx(String name, int salary, String ssn){
		this.name = name;
		this.salary=salary;
		this.ssn=ssn;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setSalary(int salary){
		this.salary=salary;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	
	public String getSsn(){
		return this.ssn;
	}
	
	public void display(){
		
		System.out.printf("Employee[%s %d %s]%n", name,salary, ssn);
		
	}
}

package io2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test05 {
	public static void main(String[] args) {
         String fileName = "c://file/data2.obj";
         FileOutputStream fos = null;
         BufferedOutputStream bos = null;
         ObjectOutputStream oos = null;
         
         try {
			fos = new FileOutputStream(fileName);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			// object ÀúÀå
			Employee emp1 = new Employee("È«±æµ¿","ÀÎ»çºÎ","880908-2222222");
			oos.writeObject(emp1);
			
			List<Employee> list = new ArrayList<>();
			list.add(new Employee("°í1", "ÃÎ¹«ÆÀ", "9999999-9999999"));
			list.add(new Employee("°í2", "ÃÎ¹«ÆÀ", "9999999-9999999"));
			list.add(new Employee("°í3", "ÃÎ¹«ÆÀ", "9999999-9999999"));
			list.add(new Employee("°í4", "ÃÎ¹«ÆÀ", "9999999-9999999"));
			
			oos.writeObject(list);
			
			oos.flush();
			System.out.println(fileName+"¿¡ ÀúÀåµÇ¾ú½À´Ï´Ù.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(bos!=null)bos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Employee implements Serializable{
	String name;
	String dept;
	transient String ssn; //ÁÖ¹Î¹øÈ£
	
	public Employee() {	}
	public Employee(String name, String dept, String ssn) {
		this.name = name;
		this.dept = dept;
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", ssn=" + ssn + "]";
	}
	
}






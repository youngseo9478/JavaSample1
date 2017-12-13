package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest3 {
	public static void main(String[] args) {
	
		
		Set<Employee> set = new TreeSet<Employee>();

		set.add(new Employee("°í","012"));
		set.add(new Employee("°í","014"));
		set.add(new Employee("°í","002"));
		set.add(new Employee("±è","002"));
		System.out.println(set);
		
		
	}
}


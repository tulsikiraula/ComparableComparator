package comparatordiff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class ComparableExample
{

	
	public static void main(String[] args) {
		

		Employee emp=new Employee(11,"Tulsi",1000);
		Employee emp1=new Employee(2,"kirola",200);
		
		List<Employee> list=new ArrayList<>();
		 
		list.add(emp);
		list.add(emp1);
		Collections.sort(list);
		
		for (Employee employee : list) {
			System.out.println(employee.getName());
			System.out.println(employee.getSal());
			
		}
	}
	

}

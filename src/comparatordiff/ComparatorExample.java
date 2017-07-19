package comparatordiff;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
public static void main(String[] args) {
		

	    Student emp=new Student();
		Student emp1=new Student();
		emp.setId(1);
		emp.setName("tulsi");
		emp.setSal(5000);
		
		emp1.setId(22);
		emp1.setName("kiraula");
		emp1.setSal(1000);
		
		List<Student> list=new ArrayList<>();
		
		list.add(emp);
		list.add(emp1);
		
		//Sorting on the basis of salary
		Collections.sort(list, new SalaryComparator());
		
		System.out.println("Salary...............");
		for (Student Student : list) {
			System.out.println(Student.getName());
			System.out.println(Student.getSal());
			
		}
		
		//Sorting on the basis of ID
        Collections.sort(list, new IDComparator());
		System.out.println("ID..............");
		for (Student Student : list) {
			System.out.println(Student.getName());
			System.out.println(Student.getSal());
			
		}
		
		//Anonymous
		System.out.println("Using anonymous");
		Collections.sort(list,new Comparator<Student>(){
			public int compare(Student s1,Student s2){
				return s1.getSal()-s2.getSal();
			}
		});
		
		//list.forEach(s->System.out.println(s.getName()));
		list.stream().map(Student :: getSal).forEach(System.out::println);
        
		
		System.out.println("Using sorted of Lambda");
		list.stream().sorted(Comparator.comparing(Student::getSal).thenComparing(Student::getId)).forEach(System.out::println);
        list.forEach(s->System.out.println(s.getName()));
        
		//Lambda
		System.out.println("Using lambda");
		Collections.sort(list,(s1,s2)-> s1.getSal()-s2.getSal());

		//Lambda sort
		System.out.println("list sorting using lambda");
		list.sort((s1,s2)-> s1.getSal()-s2.getSal());
	}
	

}

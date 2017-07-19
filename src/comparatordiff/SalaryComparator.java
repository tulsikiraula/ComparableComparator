package comparatordiff;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o2.getSal()-o1.getSal();
	}
}
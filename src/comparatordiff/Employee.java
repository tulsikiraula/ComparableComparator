package comparatordiff;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id, String name, int i) {
		super();
		this.id = id;
		this.name = name;
		this.sal = i;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee e){
		return e.sal - sal;
	}
	

}

package emp;
public class Employee {
	int id;
	String name;
	String dept;
	int sal;
	int bonus;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public Employee(int id, String name, String dept, int sal) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
	}
}
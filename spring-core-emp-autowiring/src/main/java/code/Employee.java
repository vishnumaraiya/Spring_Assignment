package code;

public class Employee {

	int eno;
	String ename;
	int salary;
	Address add;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eno, String ename, int salary, Address add) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.add = add;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", add=" + add + "]";
	}

}
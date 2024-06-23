package code;

public class Employee {

	int eno;
	String ename;
	int salary;
	Address address;

	public Employee() {
		super();
	}

	public Employee(int eno, String ename, int salary, Address address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}

}

package code;

public class Employee {

	int eno;
	String ename;
	int salary;

	public Employee() {
		super();
	}

	public Employee(int eno, String ename, int salary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}

//	public void show() {
//        System.out.println(this.toString());
//    }
}

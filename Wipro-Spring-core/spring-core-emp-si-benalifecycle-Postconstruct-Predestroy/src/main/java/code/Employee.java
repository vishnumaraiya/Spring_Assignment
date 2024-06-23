package code;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee {

	int eno;
	String ename;
	int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
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

	public void show() {
		System.out.println(eno+" "+ename+ " "+salary);
	}
	
	@PostConstruct
	public void init() {
		System.out.println("spring bean is ready to use");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("spring destroy");
	}
}
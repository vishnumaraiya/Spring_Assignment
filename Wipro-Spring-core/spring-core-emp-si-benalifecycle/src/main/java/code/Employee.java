package code;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

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
		System.out.println(eno + " " + ename + " " + salary);
	}

	public void myinitMethod() {
		System.out.println("spring bean is ready to use");
	}

	public void myDestroy() {
		System.out.println("spring destroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("close all connection");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After property set");

	}
}
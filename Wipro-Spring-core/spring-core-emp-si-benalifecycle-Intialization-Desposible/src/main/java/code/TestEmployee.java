package code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("empbean",Employee.class);
		emp.show();
		//context.close();
		//System.out.println(emp);
//		System.out.println("Id: "+emp.getEno());
//		System.out.println("Name: "+emp.getEname());
//		System.out.println("Salary: "+emp.getSalary());
//		emp.show();

//		Employee emp1 = (Employee) context.getBean("empbean1");
//		System.out.println(emp1);
	}

}

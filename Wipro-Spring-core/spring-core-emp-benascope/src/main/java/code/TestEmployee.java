package code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("empbean", Employee.class);
		emp.show();
		System.out.println(emp);
		System.out.println("emp reference: " + emp);

		Employee emp1 = (Employee) context.getBean("empbean", Employee.class);
		emp1.show();
		System.out.println(emp1);

	}

}

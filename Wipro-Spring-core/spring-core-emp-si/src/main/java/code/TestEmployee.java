package code;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp = (Employee) context.getBean("empbean",Employee.class);
		System.out.println(emp);

//		Employee emp1 = (Employee) context.getBean("empbean1");
//		System.out.println(emp1);
	}

}

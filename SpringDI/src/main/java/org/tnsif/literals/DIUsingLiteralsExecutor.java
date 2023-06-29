package org.tnsif.literals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//driver class
public class DIUsingLiteralsExecutor {

	public static void main(String[] args) {
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Employee e = (Employee) a.getBean("e1");
		e.print();
	}

}

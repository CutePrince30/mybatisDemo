package org.jeremy.app.springDemo;

import org.jeremy.app.springDemo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:/applicationContext.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getCompany().getLocation());

	}
}

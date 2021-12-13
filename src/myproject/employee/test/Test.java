package myproject.employee.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import myproject.employee.beans.Employee;

public class Test {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("/myproject/employee/resources/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee emp = (Employee)factory.getBean("empBean");
		emp.getEmpDetails();
	}
}

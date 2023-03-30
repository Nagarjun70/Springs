package om.jsp.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveCar {
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("config.xml"); //just destroy purpose
//		ApplicationContext context= new ClassPathXmlApplicationContext("config.xml"); just save purpose
		Car car = (Car) context.getBean("mycar");
		System.out.println(car.getBrand());
		System.out.println(car.getCost());
		context.registerShutdownHook();//just for purpose
	}
}
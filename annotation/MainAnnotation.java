package com.jsp.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAnnotation 
{
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext("com.jsp.annotation");
		Employee employee=(Employee)context.getBean("myEmployee");
		System.out.println("The Employee ID is: "+employee.getId());
		System.out.println("The Employee  name is: "+employee.getName());
		System.out.println("The Employee Age is: "+employee.getAge());
		System.out.println("The Employee Sal is: "+employee.getSal());
		System.out.println("The Employee Job is: "+employee.getJob());
	}

}

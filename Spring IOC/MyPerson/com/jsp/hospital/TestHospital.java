package com.jsp.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHospital 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Hospital hospital=(Hospital) context.getBean("myhospital");
		System.out.println(hospital.getId());
		System.out.println(hospital.getBnamelocation());

		
	}

}

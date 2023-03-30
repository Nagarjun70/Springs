package com.jsp.awa1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTestSaveHospital 
{
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
		Hospital hospital=(Hospital)applicationContext.getBean("myclass");

		System.out.println(hospital.getId());
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		System.out.println(hospital.getBranch().getBid());
		System.out.println(hospital.getBranch().getName());
		System.out.println(hospital.getBranch().getLocation());
		System.out.println(hospital);


		ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("config1.xml");
		Person person=(Person)applicationContext2.getBean("myperson");
		System.out.println(person.getAddress());
		System.out.println(person.getAddress().getState());
		System.out.println(person.getAddress().getCountry());
	}
}


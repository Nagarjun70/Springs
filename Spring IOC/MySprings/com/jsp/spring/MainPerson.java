package com.jsp.spring;
import java.util.ResourceBundle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainPerson 
{
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("config.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		person person=(person) factory.getBean("myperson");
//		System.out.println(person.getId());
//		System.out.println(person.getName());
		System.out.println(person);

			

		}

}


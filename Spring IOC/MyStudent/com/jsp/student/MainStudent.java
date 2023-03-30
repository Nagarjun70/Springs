package com.jsp.student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.jsp.student.student;

public class MainStudent 
{
	
		public static void main(String[] args) {
			Resource resource=new ClassPathResource("config.xml");
			BeanFactory factory=new XmlBeanFactory(resource);
			student student=(student) factory.getBean("mystudent");
			System.out.println(student);
			
			student student1=(student) factory.getBean("mystudent1");
			System.out.println(student1);
		

				

			}
		
	}


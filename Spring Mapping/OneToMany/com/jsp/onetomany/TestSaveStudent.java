package com.jsp.onetomany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSaveStudent 
{
	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		College college=(College)context.getBean("mycollege");
		System.out.println("college Id: "+college.getId());
		System.out.println("College Name: "+college.getName());
		System.out.println("College website: "+college.getWebsite());
		System.out.println("College branchId: "+college.getBranch().getId());
		System.out.println("College BranchName: "+college.getBranch().getName());
		System.out.println("College BranchLocation: "+college.getBranch().getLocation());
		System.out.println("College StudentCourse: "+college.getBranch().getCourse());
		System.out.println("Student Deatils: "+college.getStudent());
		System.out.println("Student ID: "+college.getStudent().getId());
		System.out.println("Student Name: "+college.getStudent().getName());
		System.out.println("Student age: "+college.getStudent().getAge());
		System.out.println("Student SubjectMarks: "+college.getStudent().getSubjectMarks());
		
		

		
	}

}

package com.sample;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before read bean xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		System.out.println("read bean xml");
		StudentImpl stdtImpl = 
	         (StudentImpl)context.getBean("stdtImpl");
		
		 List<Student> students = stdtImpl.fetchStudents();
	      
	      for (Student record : students) {
	         System.out.println("ID : " + record.getId() );
	         System.out.println("Name : " + record.getName() );
	      }
		stdtImpl.fetchStudents();
		
	}

}

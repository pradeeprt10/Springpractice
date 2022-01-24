package com.practice.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.dao.StudentDAOImpl;
import com.practice.entity.Student;

public class TestingStudent {

	public static void main(String[] args) {
		
		ApplicationContext cxt = new AnnotationConfigApplicationContext(com.practice.configure.Config.class);
		StudentDAOImpl stdimpl= cxt.getBean("stdobj",StudentDAOImpl.class);
		Student st = new Student();
		
		//Insert operation to DB through Spring JDBC
		/*
		 * st.setStdid(101); st.setFees(1000); st.setName("Pramod Rout");
		 * st.setPancard("XXXXX"); st.setStdname("Test");
		 */		
		
		//Update operation to DB through Spring JDBC		
		//st.setFees(5000);
		//st.setName("Rout");		
		//int count =stdimpl.updateStudent(st, 101);
		//System.out.println(count);
		
		//Query one Object
		//Student std = stdimpl.fetchStudent(100);
		//System.out.println(std);	
		//Query All Object
		
		List<Student> std1 = stdimpl.fetchAllStudent();
		for(Student obj: std1) {
			System.out.println(obj);
		}
		
	}

}

package com.practice.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
      ApplicationContext appcontext = new ClassPathXmlApplicationContext("com/practice/SpringPractice/Emp_Autowired.xml");
    	
     Employee e =(Employee) appcontext.getBean("emp12");
    System.out.println(e);
    }
    
}

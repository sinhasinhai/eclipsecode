package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
     
		// load the spring configuration file(after the addition of the .xml file in the package)
         ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
	    
		//let's call our new method for fortunes
		System.out.println(theCoach.getdailyfortune());
		 
		// close the context(just to clean-up the section)
        context.close();
	}

}
 //taking the value from the receiver at the user end 










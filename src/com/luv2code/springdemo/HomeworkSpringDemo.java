package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HomeworkSpringDemo {

	public static void main(String[] args) {

		// load the spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		// call methods on the bean
		
		System.out.println(theCoach == alphaCoach);
		
		System.out.println(theCoach);
		
		System.out.println(alphaCoach);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(alphaCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}

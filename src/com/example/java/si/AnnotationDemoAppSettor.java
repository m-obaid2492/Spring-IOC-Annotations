package com.example.java.si;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppSettor {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
			
		Coach coach =context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}

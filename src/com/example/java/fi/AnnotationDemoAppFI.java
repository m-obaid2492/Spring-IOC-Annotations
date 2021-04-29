package com.example.java.fi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppFI {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext3.xml");
			
		Coach coach =context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}

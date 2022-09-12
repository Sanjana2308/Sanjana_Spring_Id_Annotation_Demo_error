package com.greatlearning.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.springConfig.SpringConfig;

public class SpringDriver {	

	
	//demonstrates the IOC 
	public static void main(String[] args) {
			// load the spring configuration file
		
			AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);		
			// retrieve bean from spring container
		   
			
			// retrieve bean from spring container
			// SportsCoach sportsCoach = context.getBean("footballCoach", SportsCoach.class);
						
						
			// call methods on the bean
			System.out.println("-----------------------------The Cricket Coah------------------------------");
			SportsCoach spCoach=ctx.getBean("cricketCoach",SportsCoach.class);
					
			System.out.println("The time is :-"+spCoach.getTrainingSchedule());
			System.out.println("The advice is :-"+spCoach.getAdvice());
			
		    
		    //call method from our new injected bean
			System.out.println("--------------------------------The Football Coach------------------------");
			spCoach=ctx.getBean("footballCoach",SportsCoach.class);
			System.out.println("The time is :-"+spCoach.getTrainingSchedule());
			System.out.println("The time is :-"+spCoach.getAdvice());
			
			
			// close the context
		}

	}


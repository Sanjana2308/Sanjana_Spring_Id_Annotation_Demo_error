package com.greatlearning.springConfig;

import java.beans.BeanDescriptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greatlearning.springdemo.CricketCoach;
import com.greatlearning.springdemo.ExpertAdvice;
import com.greatlearning.springdemo.FootballCoach;
import com.greatlearning.springdemo.PracticeAdvice;
import com.greatlearning.springdemo.SportsCoach;

@Configuration
@ComponentScan("com.greatlearning.springdemo")
public class SpringConfig {
	
	@Bean
	public ExpertAdvice practiceAdvice() {
		return new PracticeAdvice();
	}
	@Bean
	public SportsCoach cricketCoach() {
		return new CricketCoach(practiceAdvice());
	}
	
	@Bean
	public SportsCoach footballCoach(){
		return new FootballCoach();
		
	}
}

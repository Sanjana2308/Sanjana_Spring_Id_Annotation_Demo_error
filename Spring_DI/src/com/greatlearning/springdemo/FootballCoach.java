package com.greatlearning.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements SportsCoach {

	// define a private field for the dependency
	private ExpertAdvice expertAdvice;
	

	@Autowired
	// define getter setter for dependency injection
	public ExpertAdvice getExpertAdvice() {
		return expertAdvice;
	}
		
	@Override
	public String getTrainingSchedule() {

		return "Practice dribbling";
	}

	public void setExpertAdvice(ExpertAdvice expertAdvice) {
		this.expertAdvice = expertAdvice;
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		return expertAdvice.getAdvice();
	}

}

package com.greatlearning.springdemo;

import org.springframework.stereotype.Component;

@Component
public class PracticeAdvice implements ExpertAdvice {

	@Override
	public String getAdvice() {
		return "Do a lot of practice";
	}

}

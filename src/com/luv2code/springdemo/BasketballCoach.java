package com.luv2code.springdemo;

public class BasketballCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;

	// define a constructor for dependency
	public BasketballCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Work hard to be better";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}

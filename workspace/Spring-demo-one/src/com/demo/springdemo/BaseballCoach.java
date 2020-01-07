package com.demo.springdemo;

public class BaseballCoach implements Coach {

//define a private field for the dependency
	private FortuneService fortuneService;

//define a constructor for dependency injection
	public BaseballCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on batting practice";
	}
/*its use to create the constructor*/
	@Override
	public String getdailyfortune() {

		// use my fortuneService to get a fortune

		return fortuneService.getfortune();
	}
}

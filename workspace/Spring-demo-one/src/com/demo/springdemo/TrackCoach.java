 package com.demo.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
    
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService fortuneService) {
	 this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getdailyfortune() {
		return "Just Do It: " + fortuneService.getfortune();
	}

}

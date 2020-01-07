package com.demo.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return "today is your lucky day!";
	/*its use to implement(they provide the implementation of the service
	the fortune service and hard coded that today is your lucky day*/	
	}

}

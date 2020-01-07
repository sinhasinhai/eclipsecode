package com.demo.springdemo;

public class MyApp {

	public static void main(String[] args) {
	 //create the object
	 Coach theCoach = new TrackCoach();
	 FootballCoach theCalory =new FootballCoach();
	 //use the object	
     System.out.println(theCoach.getDailyWorkout());
     System.out.println(theCalory.getBurnCalory());
	}

}

package com.example.java.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	//Constructor INjection
	

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public TennisCoach() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Priactice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

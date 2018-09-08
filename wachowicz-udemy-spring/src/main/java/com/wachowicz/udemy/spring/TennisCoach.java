package com.wachowicz.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

//    @Autowired //- constructor injection
//
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //define constructor
    public TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }

    //define a setter method
//    @Autowired - setter or any method injection
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println("TennisCoach: inside setFortuneService");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

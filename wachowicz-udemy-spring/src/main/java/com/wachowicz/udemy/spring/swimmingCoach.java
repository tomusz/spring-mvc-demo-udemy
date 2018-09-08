package com.wachowicz.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class swimmingCoach implements Coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    public swimmingCoach() {
    }

//    public swimmingCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Swim under water for distance of 10 km!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

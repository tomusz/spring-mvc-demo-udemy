package com.wachowicz.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class swimmingCoach implements Coach{

    private FortuneService fortuneService;

    @Autowired
    public swimmingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim under water for distance of 10 km!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

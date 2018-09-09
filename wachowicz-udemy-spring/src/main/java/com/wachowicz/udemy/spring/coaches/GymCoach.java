package com.wachowicz.udemy.spring.coaches;

import com.wachowicz.udemy.spring.interfaces.Coach;
import com.wachowicz.udemy.spring.interfaces.FortuneService;

public class GymCoach implements Coach{

    private FortuneService fortuneService;

    public GymCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "20 push-up, 30 stand-ups, 50 crunches. Now!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

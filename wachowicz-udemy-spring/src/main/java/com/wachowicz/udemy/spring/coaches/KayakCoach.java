package com.wachowicz.udemy.spring.coaches;

import com.wachowicz.udemy.spring.interfaces.Coach;
import com.wachowicz.udemy.spring.interfaces.FortuneService;

public class KayakCoach implements Coach {

    private FortuneService fortuneService;

    public KayakCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "You use your hands best you can and don't drown!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

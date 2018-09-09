package com.wachowicz.udemy.spring.coaches;

import com.wachowicz.udemy.spring.interfaces.Coach;
import com.wachowicz.udemy.spring.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class KayakCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

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

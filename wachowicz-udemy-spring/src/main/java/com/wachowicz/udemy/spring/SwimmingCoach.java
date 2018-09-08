package com.wachowicz.udemy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;


    public SwimmingCoach() {
    }

//    public swimmingCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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

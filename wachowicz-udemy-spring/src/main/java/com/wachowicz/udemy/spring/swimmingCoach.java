package com.wachowicz.udemy.spring;

import org.springframework.stereotype.Component;

@Component
public class swimmingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Swim under water for distance of 10 km!";
    }
}

package com.wachowicz.udemy.spring.fortuneServices;

import com.wachowicz.udemy.spring.interfaces.FortuneService;

public class ChampionFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "This is the day of you victory";
    }
}

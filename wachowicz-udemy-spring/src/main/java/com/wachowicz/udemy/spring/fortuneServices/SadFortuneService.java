package com.wachowicz.udemy.spring.fortuneServices;

import com.wachowicz.udemy.spring.interfaces.FortuneService;

public class SadFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is a sad day.";
    }
}

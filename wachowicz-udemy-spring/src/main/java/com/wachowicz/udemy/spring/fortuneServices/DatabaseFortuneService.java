package com.wachowicz.udemy.spring.fortuneServices;

import com.wachowicz.udemy.spring.interfaces.FortuneService;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return null;
    }
}

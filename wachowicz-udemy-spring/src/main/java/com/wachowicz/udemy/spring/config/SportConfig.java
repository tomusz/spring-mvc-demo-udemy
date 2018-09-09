package com.wachowicz.udemy.spring.config;

import com.wachowicz.udemy.spring.interfaces.Coach;
import com.wachowicz.udemy.spring.interfaces.FortuneService;
import com.wachowicz.udemy.spring.coaches.KayakCoach;
import com.wachowicz.udemy.spring.fortuneServices.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
//@ComponentScan("com.wachowicz.udemy.spring")
public class SportConfig {

//define bean for ou sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    //define bean for our kayak coach AND inject dependency

    @Bean
    public Coach kayakCoach(FortuneService sadFortuneService){
        return new KayakCoach(sadFortuneService);
    }
}

package com.wachowicz.udemy.spring.coaches;

import com.wachowicz.udemy.spring.interfaces.Coach;
import com.wachowicz.udemy.spring.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

/*    @Autowired
    @Qualifier("randomFortuneService")*/
    private FortuneService fortuneService;

//    @Autowired //- constructor injection
//
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //define constructor
    public TennisCoach(){
        System.out.println("TennisCoach: inside default constructor");
    }
    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside of doMyStartupStuff > <");
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println(">> TennisCoach: inside of doMyCleanupStuff XXX");
    }

    //define my destroy method

    //define a setter method
    @Autowired //- setter or any method injection
    public void setFortuneService(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        System.out.println("TennisCoach: inside setFortuneService");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

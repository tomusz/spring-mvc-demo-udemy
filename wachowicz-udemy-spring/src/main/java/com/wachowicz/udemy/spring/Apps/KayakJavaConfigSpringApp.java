package com.wachowicz.udemy.spring.Apps;

import com.wachowicz.udemy.spring.coaches.SwimmingCoach;
import com.wachowicz.udemy.spring.config.SportConfig;
import com.wachowicz.udemy.spring.interfaces.Coach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KayakJavaConfigSpringApp {

    public static void main(String[] args) {

        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        //get the bean from spring container
        Coach coach = context.getBean("kayakCoach",Coach.class);
        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        //call method to get daily fortune
        System.out.println(coach.getDailyFortune());

        context.close();
    }
}

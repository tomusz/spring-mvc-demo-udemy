package com.wachowicz.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpringApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        SwimmingCoach swimmingCoach = context.getBean("swimmingCoach",SwimmingCoach.class);
        //call a method on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(swimmingCoach.getDailyWorkout());
        //call method to get daily fortune
        System.out.println(coach.getDailyFortune());
        System.out.println(swimmingCoach.getDailyFortune());
        System.out.println(swimmingCoach.getEmail());
        System.out.println(swimmingCoach.getTeam());
        //close the context
        context.close();
    }
}

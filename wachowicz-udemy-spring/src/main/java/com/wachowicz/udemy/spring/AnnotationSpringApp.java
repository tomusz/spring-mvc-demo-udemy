package com.wachowicz.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpringApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //get the bean from spring container
        Coach coach = context.getBean("tennisCoach",Coach.class);
        //call a method on the bean
        System.out.println(coach.getDailyWorkout());

        //close the context
        context.close();
    }
}

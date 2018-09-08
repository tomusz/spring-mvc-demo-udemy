package com.wachowicz.udemy.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    //create array of string
    private String[] data ={
            "Beware of wolf in sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    //random number generator

    private Random myRandom = new Random();


    @Override
    public String getFortune() {
        //pick a random string from array
        int index = myRandom.nextInt(data.length);
        String theFortune = data[index];
        return theFortune;
    }
}

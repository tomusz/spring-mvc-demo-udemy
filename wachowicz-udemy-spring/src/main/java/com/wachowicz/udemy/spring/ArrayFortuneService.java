package com.wachowicz.udemy.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ArrayFortuneService implements FortuneService{

    //BufferReader /home/tomasz/IdeaProjects/wachowicz-udemy-spring/src/main/resources/array-file.txt
    private String fileName = "/home/tomasz/IdeaProjects/wachowicz-udemy-spring/src/main/resources/array-file.txt";
    private List<String> theFortunes;

    private Random random = new Random();

    public ArrayFortuneService(){

    }


    @PostConstruct
    public void loadArrayFortuneService() throws IOException {

        File theFile = new File(fileName);

        System.out.println("Reading fortunes from file: " + theFile.getName());
        System.out.println("File exists: " + theFile.exists());

        // initialize array list

        theFortunes = new ArrayList<String>();

        // read fortunes from file



        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(theFile));
            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                theFortunes.add(tempLine);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String getFortune() {
        return theFortunes.get(random.nextInt(theFortunes.size()));
    }
}

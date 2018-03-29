package sda.projekt.calezajecia;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Główna funkcja do odpalenia funkcji
 */

// powinno tylko wywołać wartości na konsoli

public class App {
    public static void main(String[] args) {

        DictonaryData dictonaryData = new DictonaryData();
        System.out.println(dictonaryData.ResultDictonary());



/*        Map<String, String> mapaDemo = new HashMap<>();
        mapaDemo.put("Cześć", "Hello");
        mapaDemo.put("Do widzenia", "Goodbye");
        mapaDemo.put("Budynek","Building");


       // Set<String> klucze = mapaDemo.keySet();


        for(String key : mapaDemo.keySet()){
            System.out.println(mapaDemo.get(key));
        }

        System.out.println();
        System.out.println(mapaDemo.get("Cześć"));*/

        //LinkedHashMap - zachowuje kolejnosc

    }
}

/*

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import sda.projekt.calezajecia.Validator.BasicValidation;

import java.io.IOException;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class App {
    public static void main(String[] args) throws IOException {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer karty:  ");


        String userCardNumber = scanner.nextLine();


        System.out.println("Podaj ścieszkę dostępu do pliku:  ");

        String path = scanner.nextLine();

        System.out.println("Podaj ilość reguł do wczytania:  ");

        int rules = scanner.nextInt();


        BasicValidation.BasicValidation(path,userCardNumber,rules);


    }







}*/

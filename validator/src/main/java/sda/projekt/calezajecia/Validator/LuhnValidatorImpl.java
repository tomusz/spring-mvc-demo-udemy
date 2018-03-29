package sda.projekt.calezajecia.Validator;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class LuhnValidatorImpl implements ILuhnValidator {


    //przerzucic Tablice pojedynczych stringów na inty

    public static boolean logicLuna(String cardNo) {


        String[] arrayOfString = cardNo.split("");

        int[] arrayOfInt = new int[arrayOfString.length];


        for (int i = 0; i < arrayOfString.length; i++) {
            arrayOfInt[i] = Integer.parseInt(arrayOfString[i]);
        }

        for (int i = 0; i < arrayOfString.length; i++) {


            //jezeli numer parzysty
            if (arrayOfInt.length % 2 == 0) {

                if ((i + 1) % 2 == 0) {

                    arrayOfInt[i] *= 2;

                    if (arrayOfInt[i] > 9) {

                        arrayOfInt[i] -= 9;

                    }
                }

            } else {

                if ((i + 1) % 2 != 0) {

                    arrayOfInt[i] *= 2;

                    if (arrayOfInt[i] > 9) {

                        arrayOfInt[i] += 1;
                        arrayOfInt[i] -= 10;

                    }
                }


            }


        }
        int sum = 0;
        for (int i = 0; i < arrayOfString.length; i++) {

            sum += arrayOfInt[i];
        }

        if (sum % 10 == 0) {
            return true;
        }

        return false;
    }

    //1. pomnożenie przez 2 parzystych od prawej
    //2. dodanie liczb do siebie jeżeli przekroczą 10
    //3. z sumowanie
    //4. musi być podzielny przez 10”

    //parzyste i nie parzyste w ifie
    //pomnożyć parzyste przez 2

    //

    //zsumować forem


    public boolean isCorrect(String cardNumber) {
        return false;
    }
}

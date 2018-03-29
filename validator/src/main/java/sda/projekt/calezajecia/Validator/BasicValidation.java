package sda.projekt.calezajecia.Validator;

import java.io.IOException;

public class BasicValidation {


    public static String BasicValidation(String path, String cardNo, int rules) throws IOException {

        ObjectFromFile objectFromFile = new ObjectFromFile();
        ObjectFromFile[] tablicaOFF = null;
        tablicaOFF = Buffer.read(path, rules);


        if (LuhnValidatorImpl.logicLuna(cardNo) == true) {
            return ReturnIssuer.Issuer(tablicaOFF, cardNo);
            //System.out.println(ReturnIssuer.Issuer(tablicaOFF, cardNo))
        } else {
            return " błędny numer katy";
            //System.out.println(ReturnIssuer.Issuer(tablicaOFF, cardNo) + " błędny numer katy");
        }

    }

}

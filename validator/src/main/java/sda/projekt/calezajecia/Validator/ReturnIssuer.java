package sda.projekt.calezajecia.Validator;

public class ReturnIssuer {

    public static String Issuer(ObjectFromFile[] array, String cardNo) {

        // startsWith

        for (int i = 0; i < array.length; i++) {

            if (cardNo.startsWith(array[i].cardNo) && cardNo.length() == array[i].charCard) {

                return array[i].issuer;

            }

        }

        return " nie ma takiego wystawcy";

    }

}

package sda.projekt.calezajecia;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


import java.io.IOException;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);
    }

    public void testMain() throws IOException {


    }
}

/*

import sda.projekt.calezajecia.Validator.BasicValidation;

int size = 8;
    String path = "rule.txt";
    String cardNo = "5448501000000000";
    String cardNo2 = "377200000000000";
    //String cardNo3 = "207200000000000";
    String cardNo4 = "3";


    String Mastercard = BasicValidation.BasicValidation(path, cardNo, size);
    String AmericanExpress = BasicValidation.BasicValidation(path, cardNo2, size);
    //String noIssuer = BasicValidation.BasicValidation(path,cardNo3,size);
    String wrongCardNumber = BasicValidation.BasicValidation(path, cardNo4, size);

    assertEquals("Mastercard", Mastercard);
    assertEquals("AmericanExpress", AmericanExpress);
    //assertEquals("Nie ma takiego wystawcy błędny numer katy",noIssuer);
    assertEquals(" błędny numer katy", wrongCardNumber);*/

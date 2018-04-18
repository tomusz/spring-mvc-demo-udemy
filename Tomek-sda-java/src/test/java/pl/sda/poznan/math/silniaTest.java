package pl.sda.poznan.math;

import org.junit.Test;

import static org.junit.Assert.*;

public class silniaTest {

    @Test
    public void should_return_one_when_one(){
        int wynik = silnia.silnia(1);
        assertEquals(1,wynik);
    }

    @Test
    public void should_return_two_when_two(){
        int wynik = silnia.silnia(2);
        assertEquals(2,wynik);
    }

    @Test
    public void should_retur_six_when_tree(){
        int wynik = silnia.silnia(3);
        assertEquals(6,wynik);
    }


}
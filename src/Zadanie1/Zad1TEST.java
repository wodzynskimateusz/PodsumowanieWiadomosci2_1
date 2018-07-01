package Zadanie1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Zad1TEST {

    @Test
    public void obliczTest(){
        Zad1 zad1 = new Zad1();
        assertEquals(12319, zad1.oblicz("84100809978"), 0.0001);
    }

    @Test
    public void isLeapTestTrue(){
        Zad1 zad1 = new Zad1();
        assertTrue(zad1.isLeap(2016));
    }

    @Test
    public void isLeapTestFalse(){
        Zad1 zad1 = new Zad1();
        assertFalse(zad1.isLeap(2018));
    }
}

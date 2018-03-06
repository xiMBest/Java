package ua.lviv.iot;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class AutomarketTest {

    Automobile bMW = new Automobile(Mark.BMW, Category.CAR,
            Energy.GASOLINE, EUStandart.EURO5, 2016,
            400, 3, 2000, 2);
    Automobile mAN = new Automobile(Mark.MAN, Category.TRACK,
            Energy.DIESEL, EUStandart.EURO6, 2017,
            19000, 2, 14000, 15);
    Automobile nISSAN = new Automobile(Mark.NISSAN, Category.MINIVEN,
            Energy.GAS, EUStandart.EURO2, 2000,
            700, 6, 3500, 3);
    Automobile oPEL = new Automobile(Mark.OPEL, Category.BUS,
            Energy.GASOLINE, EUStandart.EURO1, 1999,
            400, 30, 3700, 6);

    List<Automobile> automobile = new LinkedList<>();

    @Test
    public void print() {
        automobile.add(bMW);
        automobile.add(mAN);
        automobile.add(nISSAN);
        automobile.add(oPEL);
        String expected = "Automobile mark=BMW, categories=CAR, energy=GASOLINE, eustandart=EURO5, year=2016, cargo=400, passenger=3, weigth=2000, engine=2\n" +
                "Automobile mark=MAN, categories=TRACK, energy=DIESEL, eustandart=EURO6, year=2017, cargo=19000, passenger=2, weigth=14000, engine=15\n" +
                "Automobile mark=NISSAN, categories=MINIVEN, energy=GAS, eustandart=EURO2, year=2000, cargo=700, passenger=6, weigth=3500, engine=3\n" +
                "Automobile mark=OPEL, categories=BUS, energy=GASOLINE, eustandart=EURO1, year=1999, cargo=400, passenger=30, weigth=3700, engine=6\n";
        String actual = "";

        for (Automobile auto : automobile) {
            actual+=auto;
        }
        assertEquals(expected,actual);

    }

    @Test
    public void addAutomobile() {

    }

    @Test
    public void findByEngine() {

    }

    @Test
    public void findByYear() {
    }

    @Test
    public void sortByYear() {

    }

    @Test
    public void sortByEngine() {
    }
}
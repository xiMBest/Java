package ua.lviv.iot;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class AutomarketTest {

    Automobile bMW = new Automobile(Mark.BMW, Category.CAR, Energy.GASOLINE, EUStandart.EURO5, 2016,
            400, 3, 2000, 2);
    Automobile mAN = new Automobile(Mark.MAN, Category.TRACK, Energy.DIESEL, EUStandart.EURO6, 2017,
            19000, 2, 14000, 15);
    Automobile nISSAN = new Automobile(Mark.NISSAN, Category.MINIVEN, Energy.GAS, EUStandart.EURO2, 2000,
            700, 6, 3500, 3);
    Automobile oPEL = new Automobile(Mark.OPEL, Category.BUS, Energy.GASOLINE, EUStandart.EURO1, 1999,
            400, 30, 3700, 6);

    List<Automobile> automobile = new LinkedList<>();
    Automarket market = new Automarket();

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
            actual += auto;
        }
        assertEquals(expected, actual);

    }

    @Test
    public void addAutomobile() {
        List<Automobile> automobile = new LinkedList<>();
        automobile.add(bMW);
        market.addAutomobile(bMW);
        automobile.toString();
        assertEquals(automobile.get(0), market.getAutomobileList().get(0));
    }

    @Test
    public void findByEngine() {
        market.getAutomobileList().add(bMW);
        market.getAutomobileList().add(mAN);
        market.getAutomobileList().add(nISSAN);
        market.getAutomobileList().add(oPEL);
        List<Automobile> listExpected = new LinkedList<>();
        listExpected.add(oPEL);

        final int engineToFind = 6;
        assertEquals(listExpected, market.findByEngine(engineToFind));
    }

    @Test
    public void findByYear() {
        market.getAutomobileList().add(bMW);
        market.getAutomobileList().add(mAN);
        market.getAutomobileList().add(nISSAN);
        market.getAutomobileList().add(oPEL);
        List<Automobile> listExpected = new LinkedList<>();
        listExpected.add(bMW);

        final int yearToFind = 2016;
        assertEquals(listExpected, market.findByYear(yearToFind));
    }

    @Test
    public void sortByYear() {
        market.getAutomobileList().add(bMW);
        market.getAutomobileList().add(mAN);
        market.getAutomobileList().add(nISSAN);
        market.getAutomobileList().add(oPEL);

        List<Automobile> listExpected = new LinkedList<>();
        listExpected.add(oPEL);
        listExpected.add(nISSAN);
        listExpected.add(bMW);
        listExpected.add(mAN);

        assertEquals(listExpected, market.sortByYear());
    }

    @Test
    public void sortByEngine() {
        market.getAutomobileList().add(bMW);
        market.getAutomobileList().add(mAN);
        market.getAutomobileList().add(nISSAN);
        market.getAutomobileList().add(oPEL);

        List<Automobile> listExpected = new LinkedList<>();
        listExpected.add(bMW);
        listExpected.add(nISSAN);
        listExpected.add(oPEL);
        listExpected.add(mAN);

        assertEquals(listExpected, market.sortByEngine());
    }

    @Test
    public void writerTest() {
        market.getAutomobileList().add(bMW);
        market.getAutomobileList().add(mAN);
        market.getAutomobileList().add(nISSAN);
        market.getAutomobileList().add(oPEL);
        WriterAutomobile writerAutomobile = new WriterAutomobile();
        writerAutomobile.writeToFile(market.getAutomobileList());
    }


}
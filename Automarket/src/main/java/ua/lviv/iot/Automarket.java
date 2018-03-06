package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;

public class Automarket {

    private List<Automobile> automobile = new LinkedList<Automobile>();

    public final void print() {
        for (Automobile auto : automobile) {
            System.out.println(auto);
        }
    }

    public Automarket() {
    }

    public final void addAutomobile(final Automobile addAuto) {
        automobile.add(addAuto);
    }

    public final List<Automobile> getAutomobileList() {
        return automobile;
    }

    public final void setAutomobileList(
            final LinkedList<Automobile> automarket) {
        this.automobile = automarket;
    }

    public final List<Automobile> findByEngine(final int engineToFind) {
        List<Automobile> result = new LinkedList<Automobile>();
        for (Automobile auto : automobile) {
            if (engineToFind == auto.getEngine()) {
                result.add(auto);

            }
        }
        return result;
    }

    public final List<Automobile> findByYear(final int yearToFind) {
        List<Automobile> result = new LinkedList<Automobile>();
        for (Automobile auto : automobile) {
            if (yearToFind == auto.getYear()) {
                result.add(auto);
            }
        }
        return result;
    }

    public final List<Automobile> sortByYear() {
        automobile.sort((Automobile o1, Automobile o2) ->
                o1.getYear() - o2.getYear());
        return automobile;
    }

    public final List<Automobile> sortByEngine() {
        automobile.sort((Automobile o1, Automobile o2) ->
                o1.getEngine() - o2.getEngine());
        return automobile;
    }

    public Automarket(final LinkedList<Automobile> automobile) {
        this.automobile = automobile;
    }

}

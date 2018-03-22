package ua.lviv.iot;


public class Automobile {

    private Mark mark;
    private Category categories;
    private Energy energy;
    private EUStandart eustandart;
    private int year;
    private int cargo;
    private int passenger;
    private int weigth;
    private int engine;

    public Automobile(final Mark mark, final Category categories, final Energy energy, final EUStandart eustandart,
                      final int year, final int cargo, final int passenger, final int weigth, final int engine) {
        this.mark = mark;
        this.categories = categories;
        this.energy = energy;
        this.eustandart = eustandart;
        this.year = year;
        this.cargo = cargo;
        this.passenger = passenger;
        this.weigth = weigth;
        this.engine = engine;
    }

    public final int getYear() {
        return year;
    }

    public final int getCargo() {
        return cargo;
    }

    public final int getPassenger() {
        return passenger;
    }

    public final int getWeigth() {
        return weigth;
    }

    public final int getEngine() {
        return engine;
    }

    @Override
    public final String toString() {
        return "Automobile mark=" + mark + ", categories=" + categories + ", energy=" + energy + ", eustandart="
                + eustandart + ", year=" + year + ", cargo=" + cargo + ", passenger=" + passenger + ", weigth="
                + weigth + ", engine=" + engine + "\n";
    }

    public String getHeaders() {
        return "Mark, Category, Energy, EUStandart, year, cargo, passenger, weigth, engine";
    }

    public String toCSV() {
        return this.mark + ", " + this.categories + ", " + this.energy + ", " + this.eustandart + ", " + getYear() + ", " + getCargo() + ", " + getPassenger() + ", " + getWeigth() + ", " + getEngine() + ".";
    }
}

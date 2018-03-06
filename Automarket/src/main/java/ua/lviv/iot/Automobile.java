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

    public Automobile() {
    }

    public Automobile(final Mark mark,
                      final Category categories,
                      final Energy energy,
                      final EUStandart eustandart,
                      final int year,
                      final int cargo,
                      final int passenger,
                      final int weigth,
                      final int engine) {
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

    public final Mark getMark() {
        return mark;
    }

    public final void setMark(final Mark mark) {
        this.mark = mark;
    }

    public final Category getCategories() {
        return categories;
    }

    public final void setCategories(final Category categories) {
        this.categories = categories;
    }

    public final Energy getEnergy() {
        return energy;
    }

    public final void setEnergy(final Energy energy) {
        this.energy = energy;
    }

    public final EUStandart getEustandart() {
        return eustandart;
    }

    public final void setEustandart(final EUStandart eustandart) {
        this.eustandart = eustandart;
    }

    public final int getYear() {
        return year;
    }

    public final void setYear(final int year) {
        this.year = year;
    }

    public final int getCargo() {
        return cargo;
    }

    public final void setCargo(final int cargo) {
        this.cargo = cargo;
    }

    public final int getPassenger() {
        return passenger;
    }

    public final void setPassenger(final int passenger) {
        this.passenger = passenger;
    }

    public final int getWeigth() {
        return weigth;
    }

    public final void setWeigth(final int weigth) {
        this.weigth = weigth;
    }

    public final int getEngine() {
        return engine;
    }

    public final void setEngine(final int engine) {
        this.engine = engine;
    }

    @Override
    public final String toString() {
        return "Automobile mark=" + mark + ", categories="
                + categories + ", energy=" + energy
                + ", eustandart="
                + eustandart + ", year=" + year + ", cargo="
                + cargo + ", passenger=" + passenger
                + ", weigth=" + weigth
                + ", engine=" + engine + "\n";
    }


}

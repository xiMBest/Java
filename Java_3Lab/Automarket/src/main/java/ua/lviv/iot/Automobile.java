package ua.lviv.iot;


import javax.persistence.*;

@Entity
public class Automobile {



    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Integer id;
    @Column
    private Mark mark;
    @Column
    private Category categories;
    @Column
    private Energy energy;
    @Column
    private EUStandart eustandart;
    @Column
    private int year;
    @Column
    private int cargo;
    @Column
    private int passenger;
    @Column
    private int weigth;
    @Column
    private int engine;

    public Automobile(){

    }
    public void setMark(Mark mark) {
        this.mark = mark;
    }

    public void setCategories(Category categories) {
        this.categories = categories;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public void setEustandart(EUStandart eustandart) {
        this.eustandart = eustandart;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }



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

    public Mark getMark() {
        return mark;
    }

    public Category getCategories() {
        return categories;
    }

    public Energy getEnergy() {
        return energy;
    }

    public EUStandart getEustandart() {
        return eustandart;
    }

    @Override
    public final String toString() {
        return "Automobile mark=" + mark + ", categories=" + categories + ", energy=" + energy + ", eustandart="
                + eustandart + ", year=" + year + ", cargo=" + cargo + ", passenger=" + passenger + ", weigth="
                + weigth + ", engine=" + engine + "\n";
    }

//    public String getHeaders() {
//        return "Mark, Category, Energy, EUStandart, year, cargo, passenger, weigth, engine";
//    }

    public String toCSV() {
        return this.mark + ", " + this.categories + ", " + this.energy + ", " + this.eustandart + ", " + getYear() + ", " + getCargo() + ", " + getPassenger() + ", " + getWeigth() + ", " + getEngine() + ".";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}

package demo;

public class main {
    public static void main(String args[])
    {
        
        
        Pool NULP = new Pool();
        Pool LNU = new Pool(30, 10000, 5, 10, "tile");
        Pool UKU = new Pool (50, 20000, 10, 10, "tile");
        
        System.out.println(NULP.toString());
        System.out.println(LNU.toString());
        System.out.println(UKU.toString());
        
        NULP.resetValues(70, 15000, 5, 10, "tile");
        
        NULP.printSum();
        LNU.printSum();
        UKU.printSum();
        
        LNU.setCapacity(23000);
        
        Pool.printStaticSum();
    }
}
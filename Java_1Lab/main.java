package demo;

public class main {
    public static void main(String args[])
    {
        
        
        Pool lvivPolitech = new Pool();
        Pool universityFranko = new Pool(30, 10000, 5, 10, "tile");
        Pool catholicUniversity = new Pool (50, 20000, 10, 10, "tile");
        
        System.out.println(lvivPolitech.toString());
        System.out.println(universityFranko.toString());
        System.out.println(catholicUniversity.toString());
        
        lvivPolitech.resetValues(70, 15000, 5, 10, "tile");
        
        lvivPolitech.printSum();
        univeersityFranko.printSum();
        catholicUniversity.printSum();
        
        universityFranko.setCapacity(23000);
        
        Pool.printStaticSum();
    }
}
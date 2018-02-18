package demo;


public class Pool{
	private double price;
	private static double capacity;
	private int line;
	private String covering = "tile";
	private double depth;
	
	public static double totalCapacity=0;
	
	public Pool(){
	}
	
	public Pool(double price, double capacity, int line, double depth){
		setPrice(price);
		setCapacity(capacity);
		setLine(line);
		setDepth(depth);
	}
	
	public Pool(double price, double capacity, int line, double depth, String covering){
		setPrice(price);
		setCapacity(capacity);
		setLine(line);
		setDepth(depth);
		setCovering(covering);
	}
	
	@Override
	public String toString(){
		return "Pool is cost"+price+"UAH, has"+line+"lines, is"+depth+"meters deep, has"+capacity+"liter, is covered with " + covering +".";
	}
	
	static void printStaticSum(){
		System.out.println("Pool can be filled" + capacity + "liter.");
	}
	
	public void printSum(){
		System.out.println("The pool can be filled"+capacity+"liter, total liter is:"+totalCapacity+".");
	}
	
	public void resetValues(double price, double capacity, int line, double depth, String covering){
		setPrice(price);
		setCapacity(capacity);
		setLine(line);
		setDepth(depth);
		setCovering(covering);
	}
	
	public double getPrice(){
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getCapacity(){
		return capacity;
	}
	
	public void setCapacity(double capacity){
		totalCapacity -= this.totalCapacity;
		this.capacity = capacity;
		totalCapacity += this.capacity;
	}
	
	public int getLine(){
		return line;
	}
	
	public void setLine(int line){
		this.line = line;
	}
	
	public double depth(){
		return depth;
	}
	
	public void setDepth(double depth){
		this.depth = depth;
	}
	
	public String getCovering() {
        return covering;
    }

    public void setCovering(String covering) {
        this.covering = covering;
    }
    
}
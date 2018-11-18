 

public class Car 
{ 
	 
	String name; 
	int speed; 
	int hp; 
	

	public Car(String name, int speed, 
				int hp) 
	{ 
		this.name = name; 
		this.speed = speed; 
		this.hp = hp; 
	} 

	public String getName() 
	{ 
		return name; 
	} 

	public int getSreed() 
	{ 
		return speed; 
	} 

	
	public int getHorsepower() 
	{ 
		return hp; 
	} 

	
	public String toString() 
	{ 
		return("This is "+ this.getName()+ 
			".\nits Characteristics are: " + 
			this.getSreed()+" Max Speed, " + this.getHorsepower() + " Horsepower"); 
	} 

	public static void main(String[] args) 
	{ 
		Car Lamborghini = new Car("Lamborghini", 350, 650); 
		System.out.println(Lamborghini.toString()); 
	} 
} 

public class Ship 
{ 
	String ship; 
	int yearBuilt; 

	public Ship(String ship, int yearBuilt) 
	{	 
		this.ship = ship; 
		this.yearBuilt = yearBuilt; 
	} 

	public String toString()
	{ 
		return "Normal Ship\nShip Name: " + ship + 
				"\nBuilt: " + yearBuilt; 
	} 
} 

public class CruiseShip extends Ship
{ 

	int maxPassengers; 


	CruiseShip(String ship, int maxPassengers) 
	{ 
		super(ship, maxPassengers); 

		this.maxPassengers = maxPassengers; 

	} 

	public String toString()
	{ 

		return "\nCruise Ship\n" + 
				"Name: " + ship +  
				"\nPassengers: " + maxPassengers; 
	} 
} 
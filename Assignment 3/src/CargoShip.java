

public class CargoShip extends Ship 
{ 
	int tonnageCapacity; 

	CargoShip(String ship, int tonnageCapacity) 
	{ 
	super(ship, tonnageCapacity); 
	this.tonnageCapacity = tonnageCapacity; 
	} 

	public String toString() 
	{ 

	return "\nCargo Ship\nName: " + ship + 
			"\nCargo Capacity of Tonnage: " + tonnageCapacity + " tons"; 
	} 
}



public class Car extends Automobile 
{
	
	int maxPassengers;
	
	public Car() 
	{
		
		Year = 1918;
		maxPassengers = 2;
	}


	public Car(int Year, double Weight, String licensePlate, String Make, int maxPassengers) 
	{
		super(Year, Weight, licensePlate, Make);
		this.maxPassengers = maxPassengers;
	}

	public int getMaxPassengers() 
	{
		return maxPassengers;
	}

	public String toString() 
	{
		return "Car: " + super.toString() + ", Max Passengers: " + maxPassengers;
	}

}

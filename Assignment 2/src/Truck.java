

public class Truck extends Automobile 
{
	
	double towCapacity = 0;


	public Truck() {
		
		Year = 1925;
		towCapacity = 1000;
	}
	

	public Truck(int Year, double Weight, String licensePlate, String Make, double towCapacity) 
	{
		super(Year, Weight, licensePlate, Make);
		this.towCapacity = towCapacity;
	}

	public double getTowCapacity() 
	{
		return towCapacity;
	}

	public String toString() 
	{
		return "Truck: " + super.toString() + ", Tow Capacity: " + towCapacity;
	}

}

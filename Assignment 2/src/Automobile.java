public class Automobile extends Vehicle 
{
	public String licensePlate;
	public String Make;
	
	
	public Automobile() 
	{
		
		licensePlate = "Unknown";
		Make = "Unknown";
		
	}


	public Automobile(int Year, double Weight, String licensePlate, String Make) 
	{
		super(Year, Weight);
		this.licensePlate = licensePlate;
		this.Make = Make;
	}

	public String getLicensePlate() 
	{
		return licensePlate;
	}

	public String getMake() 
	{
		return Make;
	}

	public String toString() 
	{
		return super.toString() + ", License Plate: " + licensePlate + ", Make: " + Make;
	}
}

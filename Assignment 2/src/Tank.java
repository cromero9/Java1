

public class Tank extends Vehicle 
{
	
	double armorWidth;
	
	public Tank(){
		
		Year = 1933;
		armorWidth = 200;
	}

	public Tank(int Year, double Weight, double armorWidth) 
	{
		super(Year, Weight);
		this.armorWidth = armorWidth;
	}

	public double getArmorWidth() 
	{
		return armorWidth;
	}

	public String toString() 
	{
		return "Tank: " + super.toString() + ", Armor Width: " + armorWidth;
	}

}

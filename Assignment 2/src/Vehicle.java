
public class Vehicle {

	public int Year;
	public double Weight;
	
	public Vehicle() {
		Year = 1917;
		Weight = 2000.0;
	}


	
	public Vehicle(int Year, double Weight) {
		this.Year = Year;
		this.Weight = Weight;
	}

	public double getWeight() {
		return Weight;
	}
	public int getYear() {
		return Year;
	}
	public String toString() {
		return "Year: " + Year + ", Weight: " + Weight;
	}

}

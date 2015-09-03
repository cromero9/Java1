

import java.util.*;

public class TestAuto 
{

	private static Scanner keyboard;

	public static void main(String[] args) 
	{
		

		keyboard = new Scanner(System.in);
		int year;
		double weight;
		String licensePlate;
		String Make;
		double armorWidth;
		double towCapacity;
		int maxPassengers;

		
		System.out.println("Would you like to create a new Vehicle?: Yes = 1 or No = 0");
			int n = keyboard.nextInt();
			
			if(n == 1)
			{
			System.out.println("Car: ");
			System.out.println("Year: ");
			year = keyboard.nextInt();
			System.out.println("Weight: ");
			weight =keyboard.nextDouble();
			System.out.println("License Plate: ");
			licensePlate = keyboard.next();
			System.out.println("Make: ");
			Make = keyboard.next();
			System.out.println("Max Passengers: ");
			maxPassengers = keyboard.nextInt();
			
			Car c = new Car(year, weight, licensePlate, Make, maxPassengers);
			
			System.out.println("Truck: ");
			System.out.println("Year: ");
			year = keyboard.nextInt();
			System.out.println("Weight: ");
			weight =keyboard.nextDouble();
			System.out.println("License Plate: ");
			licensePlate = keyboard.next();
			System.out.println("Make: ");
			Make = keyboard.next();
			System.out.println("Tow Capacity: ");
			towCapacity = keyboard.nextDouble();
			
			Truck k = new Truck(year, weight, licensePlate, Make, towCapacity);
			
			System.out.println("Tank: ");
			System.out.print("Year: "); 
			year = keyboard.nextInt(); 
			System.out.print("Weight: ");
			weight = keyboard.nextDouble();
			System.out.print("Armor Width: ");
			armorWidth = keyboard.nextDouble();
			
			Tank t = new Tank(year, weight, armorWidth);
			
			System.out.println(c.toString());
			System.out.println(k.toString());
			System.out.println(t.toString());
			}
			else
			{
			
				Car c = new Car();
				Truck k = new Truck();
				Tank t = new Tank();
				
				System.out.print("Default Vehicles: \n");
				System.out.println(c.toString());
				System.out.println(k.toString());
				System.out.println(t.toString());
				
			}
			
	
	} 
		
	
}



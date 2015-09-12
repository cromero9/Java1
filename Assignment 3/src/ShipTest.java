import java.util.Scanner;
public class ShipTest
{ 
	public static void main(String[] args) 
	{
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter name for Ship: ");
	String Ship = keyboard.next();
	System.out.println("Enter year built of Ship: ");
	int year = keyboard.nextInt();
	System.out.println("Enter name for Cruise Ship: ");
	String CruiseShip = keyboard.next();
	System.out.println("Enter passenger capacity: ");
	int passengers = keyboard.nextInt();
	System.out.println("Enter name for Cargo Ship: ");
	String CargoShip = keyboard.next();
	System.out.println("Enter tonnage capacity: ");
	int tonnage = keyboard.nextInt();
	Ship[] ships = new Ship[3]; 
	ships[0]= new Ship(Ship, year); 
	ships[1] = new CruiseShip(CruiseShip, passengers); 
	ships[2] = new CargoShip(CargoShip, tonnage); 


	for (int i = 0 ; i < ships.length;i++)
	{ 
		System.out.println(ships[i]); 
	} 
	} 
} 
import java.util.Scanner;
public class TestPhoneBill {
	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will calculate your phone bill for you");
		System.out.println("What is your call rate?:");
		double callRate = keyboard.nextDouble();
		System.out.println("What is your monthly rate?:");
		double monthlyRate = keyboard.nextDouble();
		System.out.println("How many minutes did you talk");
		int time = keyboard.nextInt();
		LongDistanceBill bill = new LongDistanceBill(monthlyRate);
		bill.setCallRate(callRate);
		System.out.println("your monthly bill is: "+ bill.calculateBill(time));
		
	}
	

}

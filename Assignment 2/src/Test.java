

import java.util.Scanner;

public class Test{

	private static Scanner keyboard;

	public static void main(String[] args) {
		
		String FirstName;
		String LastName;
		double Grammar;
		double Spelling;
		double Content;
		

		keyboard = new Scanner(System.in);
		
		System.out.println("Enter First Name: ");
		FirstName = keyboard.next();
		
		System.out.println("Enter Last Name: ");
		LastName = keyboard.next();

		System.out.println("Enter scores.");

		System.out.print("Grammar: ");
		Grammar = keyboard.nextDouble();
		
		System.out.print("Spelling: ");
		Spelling = keyboard.nextDouble();
		
		System.out.print("Content: ");
		Content = keyboard.nextDouble();
		
		
		Essays r = new Essays(Grammar, Spelling, Content, FirstName, LastName);
		
		System.out.println("\n" + "Name of Student: "+ r.getFirstName() + " " + r.getLastName());
		System.out.println("Grammar: " + r.getGrammar());
		System.out.println("Spelling: " + r.getSpelling());
		System.out.println("Content: " + r.getContent());
		System.out.println("Score is: " + r.getScore() + " = "+ r.getGrade());

	}

}

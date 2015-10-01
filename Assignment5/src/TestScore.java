import java.util.Scanner;

public class TestScore{
	public static void main(String args[]) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);
		int array[] = new int[2];
		System.out.println("Enter scores: ");
		for(int i=0; i<2; i++)
			array[i]=keyboard.nextInt();
		
		Scores t1 = new Scores(array);
		System.exit(0);
		
	}

}

import java.util.Scanner;

class Scores 
{
	private int score[]=new int[5];
	public Scores(int test[])
	{
		try
		{
			for(int i=0; i<5; i++)
			{
				if(test[i]<0||test[i]>100){
					throw new IllegalArgumentException("Number cannot be"
							+ "less than 0 and greater than 100");
				}
				else{
					score[i]=test[i];
				}
			}
			System.out.println("Average is: "+ Average());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	
	public double Average()
	{
		int sum=0;
		double avg;
		for(int i=0;i<5;i++)
		{
			sum+=score[i];
		}
		avg=sum/5;
		return avg;
	}

}

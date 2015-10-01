import java.util.Scanner;

class Scores 
{
	private int score[]=new int[2];
	public Scores(int test[])
	{
		try
		{
			for(int i=0; i<2; i++)
			{
				if(test[i]<0||test[i]>100){
					throw new IllegalArgumentException("Number cannot be less than 0 and greater than 100");
				}
				else{
					score[i]=test[i];
				}
			}
			System.out.println("Average is: "+ average());
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	
	public double average()
	{
		int sum=0;
		double avg;
		for(int i=0;i<2;i++)
		{
			sum+=score[i];
		}
		avg=sum/2;
		return avg;
	}

}


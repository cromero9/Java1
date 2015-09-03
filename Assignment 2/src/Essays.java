

public class Essays extends GradedActivity 
{
	public String FirstName;
	public String LastName;
	public double Grammar;
	public double Spelling;
	public double Content;
	
	
	public Essays(double Grammar, double Spelling, double Content, String FirstName, String LastName) 
	{

		double totalScore;
		this.FirstName = FirstName;
		
		this.LastName = LastName;

		if (Grammar >= 0 && Grammar <= 25) 
		{
			this.Grammar = Grammar;
		} 
		else 
		{
			this.Grammar = 0;
		}

		if (Spelling >= 0 && Spelling <= 35) 
		{
			this.Spelling = Spelling;
		} 
		else 
		{
			this.Spelling = 0;
		}

		if (Content >= 0 && Content <= 40) 
		{
			this.Content = Content;
		} 
		else 
		{
			this.Content = 0;
		}

		totalScore = this.Content + this.Spelling + this.Grammar;

		setScore(totalScore);

	}
	public String getFirstName()
	{
		
		return FirstName;
	}
	public String getLastName()
	{
		
		return LastName;
	}

	public double getGrammar() 
	{
		
		return Grammar;
	}

	public double getSpelling() 
	{
		
		return Spelling;
	}

	public double getContent() 
	{
		
		return Content;
	}

	
}

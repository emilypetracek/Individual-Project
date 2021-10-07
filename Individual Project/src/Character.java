
public class Character
	{
		private String name;
		private String strengths;
		private String weaknesses; 
		private int points;
	
public Character (String n, String s, String w, int p)
	{
		name = n;
		strengths = s;
		weaknesses = w;
		points = p;
		
	}

public String getName()
	{
		return name;
	}

public void setName(String name)
	{
		this.name = name;
	}

public String getStrengths()
	{
		return strengths;
	}

public void setStrengths(String strengths)
	{
		this.strengths = strengths;
	}

public String getWeaknesses()
	{
		return weaknesses;
	}

public void setWeaknesses(String weaknesses)
	{
		this.weaknesses = weaknesses;
	}

public int getPoints()
	{
		return points;
	}

public void setPoints(int points)
	{
		this.points = points;
	}
	}
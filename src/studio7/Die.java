package studio7;

public class Die 

{
	
	private int face;
	
	public Die (int n)
	{
		face = (int)(Math.random()*n+1);
	}
	public int getFace()
	{
		return face;
	}
	public static void main(String[] args)
	{
		Die n1 = new Die (20);
		System.out.println(n1.getFace());
		
		
		
	}

}

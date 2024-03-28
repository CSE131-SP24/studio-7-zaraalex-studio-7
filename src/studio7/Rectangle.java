package studio7;

public class Rectangle
{
	
	private double length;
	private double width;
	private boolean sqaure;
	
	public Rectangle ()
	{
		length = 0.0;
		width = 0.0;
		sqaure = false;
		
		
	}
	
	public Rectangle (double length, double width)
	{
		this.length = length;
		this.width = width;
		
		if (length == width)

		{
			sqaure = true;
		}
		
	}
	
	public void compare (Rectangle r)
	{
		if ( this.area() > r.area())
		{
			System.out.println("r1");
		}
		else
		{
			System.out.println("r2");
		}
		
		
	}
	
	public double perimeter ()
	{
		return  (2*length)+(2*width);
		
		
	
	}
	
	public double area ()
	{
		
		
		return  length*width;
	
		
	
	}
	
	public boolean isSquare ()
	{
		return sqaure;
	}



	public static void main(String[] args)
	{
		
		Rectangle r1 = new Rectangle (5.0,5.0);
		Rectangle r2 = new Rectangle (3.0,7.0);
		r1.compare(r2);
		

		
				
		
		
		
		
		

	}

}


public class Square{
	private Rectangle mSquare;

	public Square() 
	{
		this("NoNameSquare");
	}
	
	public Square(String name)
	{
		this(name,3);
	}
	
	public Square(String name, int side)
	{
		mSquare = new Rectangle(name,side,side);
		
	}
	
	public double getArea()
	{
		return mSquare.getArea();
	}
	
	public double getPerimeter()
	{
		return mSquare.getPerimeter();
	}
	
	public double getDistance(Shape other)
	{
		return mSquare.getDistance(other);
	}
	
	public String toString()
	{
		return "Square: " + super.toString() + ", Corner: " + mSquare.getCorner() + ", Length: " + mSquare.getLength() + ", Width: " + mSquare.getWidth();
	}
	
	public boolean equals(Object other)
	{
		return mSquare.equals(other);
	}
	
	public int compareTo(Object arg0)
	{
		return mSquare.compareTo(arg0);
	}
	
	public void scale(int scaleFactor)
	{
		mSquare.scale(scaleFactor);
	}
	
	public Point getCorner()
	{
		return mSquare.getCorner();
	}
	
	
}

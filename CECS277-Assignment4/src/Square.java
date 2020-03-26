
public class Square extends Shape{
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
		super(name);
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
	
	@Override
	public String toString()
	{
		return "Square: " + super.toString() + ", Side: " + mSquare.getWidth();
	}
	
	@Override
	public boolean equals(Object other)
	{
		return mSquare.equals(other);
	}
	@Override
	public int compareTo(Object arg0)
	{
		return mSquare.compareTo(arg0);
	}
	@Override
	public void scale(int scaleFactor)
	{
		mSquare.scale(scaleFactor);
	}
	
	public Point getCorner()
	{
		return mSquare.getCorner();
	}
	
	
}

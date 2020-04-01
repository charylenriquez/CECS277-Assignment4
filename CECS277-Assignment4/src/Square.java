
public class Square extends Shape{
	
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
		if(!(other instanceof Square)) throw new InvalidDistanceComputationException("Square", other.getClass().toString());
		else
		{
			Square s = (Square)other;
			return getCorner().getDistance(s.getCorner());
		}
	}
	
	@Override
	public String toString()
	{
		return "Square: " + mSquare.getName() + ", Side: " + mSquare.getWidth();
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Square)) throw new InvalidComparisonException("Square", other.getClass().toString());
		else
		{
			Square s = (Square)other;
			return this.getArea() == s.getArea();
		}
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
	
	private Rectangle mSquare;
}

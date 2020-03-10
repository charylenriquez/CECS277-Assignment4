
public class Rectangle extends Shape{

	public Rectangle()
	{
		this("NoName");
	}
	
	public Rectangle(String name)
	{
		this(name, 2);
	}
	
	public Rectangle(String name, int length)
	{
		this(name, length, 2 * length);
	}
	
	public Rectangle(String name, int length, int width)
	{
		this(name, length, width, new Point("corner", 0,0));
	}

	public Rectangle(String name, int length, int width, Point corner)
	{
		super(name);
		mLength = length;
		mWidth = width;
		mCorner = new Point(corner);
	}

	@Override
	public double getArea() 
	{
		return mLength * mWidth;
	}

	@Override
	public double getPerimeter() 
	{
		return 2 * mLength + 2 * mWidth;
	}
	
	@Override
	public double getDistance(Shape other)
	{
		if(!(other instanceof Rectangle)) return 0.0;
		else
		{
			Rectangle r = (Rectangle)other;
			return mCorner.getDistance(r.mCorner);
		}
	}
	
	@Override
	public String toString()
	{
		return "Rectangle: " + super.toString() + ", Corner: " + mCorner + ", Length: " + mLength + ", Width: " + mWidth;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Rectangle)) return false;
		else
		{
			Rectangle r = (Rectangle)other;
			return mCorner.equals(mCorner) && mLength == r.mLength && mWidth == r.mWidth;
			
		}
	}
	//TODO
	@Override
	public int compareTo(Object arg0) {
		return 0;
	}
	//TODO
	@Override
	public String scale(int scaleFactor)
	{
		return "TODO";
	}
	public Point getCorner()
	{
		return mCorner;
	}
	
	public int getLength()
	{
		return mLength;
	}
	
	public int getWidth()
	{
		return mWidth;
	}
	
	private Point mCorner;
	private int mLength;
	private int mWidth;
}

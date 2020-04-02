// Assignment 4
// Dmitry Merezhko	 ID: 025-947-712
// Charyl Enriquez   ID: 015392154
// Britney Khuu 	 ID: 018577765

public class Name 
{
	public Name()
	{
		this("NoName");
	}
	
	public Name(Name name)
	{
		this(name.getName());
	}
	
	public Name(String name)
	{
		setName(name);
	}
	
	public String getName()
	{
		return mName;
	}
	
	public void setName(String name)
	{
		mName = name;
	}
	
	private String mName;
}

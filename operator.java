package test;
public class operator 
{
	private double length,breadth,height;
	
	public void setLength(double l)
	{
		length=l;
	}
	public void setBreadth(double b)
	{
		breadth=b;
	}
	public void setHeight(double h)
	{
		height=h;
	}
	public double volume()
	{
		return length*breadth*height;
	}
	public double getLength()
	{
		return length;
	}
	public double getBreadth()
	{
		return breadth;
	}
	public double getHeight()
	{
		return height;
	}
	public static void main(String args[])
	{
		operator b=new operator();
		b.setLength(10.0);
		b.setBreadth(20.0);
		b.setHeight(10.0);
		System.out.println(b.volume());
          		
	}
}
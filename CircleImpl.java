
public class CircleImpl extends Circle{

	private double radius;
	private double length;
	private double width;
	public void setRadius(double x)
	{
		radius=x;
	}
	public void setLength(double x)
	{
		length=x;
	}
	public void setWidth(double x)
	{
		width=x;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	@Override
	public double aoc() {
		return pi*radius*radius;
	}
	@Override
	public double aor() {
		return length*width;
	}

}

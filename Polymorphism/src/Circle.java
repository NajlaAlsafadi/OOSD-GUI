
public class Circle extends Shape {



public double radius;
final double pi = Math.PI;

public Circle()
{
  this.radius = 1;
}

public Circle(double radius)
{
	
	this.radius =radius;
}

public double getArea()
{
	return Math.PI * radius * radius;
}
public double getPerimeter()
{
return (2 * pi * radius);
}
}
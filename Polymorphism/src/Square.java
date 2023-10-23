
public class Square extends Shape {

	public double side;
	
	
	
	public Square()
	{
		this.side = 1;
		
	}
	
	public Square(double side)
	 {
		 this.side = side;
		 
		 
	 }
	 
	 public double getArea()
	 {
		 return side * side;
	 }
	 
	 public double getPerimeter()
	 {
		 return 4 * (side) ;
	 }
}


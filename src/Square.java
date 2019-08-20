
public class Square extends Shape implements  TwoDimensionalShapeInterface  {

	private double side;

	
	public Square(double shapeArea, String color, double side) {
		super(shapeArea, color);
		this.side = side;
	}
	
	
	
	
	
	@Override
	public double calculateArea() {
		double sqrarea = this.side * this.side;
		return sqrarea;
	}
	@Override
	public void printInfo() {
		
	}

	public double getSide() {
		return side;
	}





	public void setSide(double side) {
		this.side = side;
	}





	

}

package classwork_12;

public class Rectangle {
	double height;
	double width;
	
	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public boolean isSquare() {
		if(width == height) {
			return true;
		} else {
			return false;
		}
	}
}

package classwork_11;

public class Rectangle {
	double width;
	double heigth;
	
	public Rectangle(double width, double heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public double area() {
		return width * heigth;
	}
	
	public double perimeter() {
		return 2 * (heigth + width);
	}
	
	public void describe() {
		System.out.println("Width is " + area());
		System.out.println("Height is " + perimeter());
	}
}

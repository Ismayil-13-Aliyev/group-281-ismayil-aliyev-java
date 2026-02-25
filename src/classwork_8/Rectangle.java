package classwork_8;

public class Rectangle {
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}

	public double getPerimeter() {
		return (width + height) * 2;
	}
	
	public void printInfo() {
		System.out.println(width);
		System.out.println(height);
		System.out.println(getArea());
		System.out.println(getPerimeter());
	}
}

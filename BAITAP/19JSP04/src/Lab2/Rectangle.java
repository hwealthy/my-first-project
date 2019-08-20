package Lab2;

public class Rectangle extends Shape {
	public static int length;
	public static int width;
	public Rectangle(String color, int length, int width,double getArea) {
		super(color);
		this.length = length;
		this.width = width;
		this.color = color;
		this.getClass();
	}
	public static double getArea(int length, int width){
		return (length*width);	
	
}
	@Override
	public String toString() {
		return "Rectangle [color=" + color + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}}

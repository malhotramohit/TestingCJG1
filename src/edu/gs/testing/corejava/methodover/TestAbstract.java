package edu.gs.testing.corejava.methodover;

abstract class Shape {
	protected String color;
	protected boolean filled;

	public Shape() {
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public abstract double getArea();

	public abstract double getPerimeter();

	public abstract String toString();

}

class Rectangle extends Shape {
	protected double width;
	protected double length;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled + "]";
	}

}

class Circle extends Shape {
	protected double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}

}

public class TestAbstract {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(12, 13, "Red", false);
		System.out.println(rectangle.getArea());

		// par p = c();
		Shape s1 = rectangle; // upcasting
		System.out.println(s1.getPerimeter());

		Rectangle r1 = (Rectangle) s1;
		System.out.println(r1.getLength());

		Shape s2 = new Circle(12, "red", false);

		s2 = r1;

		System.out.println(s2.getArea()); // rect area, runtime poly , dynamic method disp

		if (s2 instanceof Circle) {
			Circle c1 = (Circle) s2; // rect -> circle

			System.out.println(c1.getRadius());
		} else {
			System.out.println("not possible");
		}

	}

}
